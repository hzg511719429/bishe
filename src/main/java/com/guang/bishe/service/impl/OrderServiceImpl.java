package com.guang.bishe.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guang.bishe.domain.*;
import com.guang.bishe.mapper.*;
import com.guang.bishe.service.OrderService;
import com.guang.bishe.service.dto.ItemAndProduct;
import com.guang.bishe.service.dto.OrderAndUser;
import com.guang.bishe.service.dto.PageResult;
import com.guang.bishe.service.util.IDUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private CarMapper carMapper;
    @Autowired
    private AddressMapper addressMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Orders> insertConfirmOrder(HttpServletRequest request, String sc_date, int paytype, String message, double sumprice) {
        //获取该用户
        User user = (User) request.getSession().getAttribute("user");
        //创建要返回的List<Orders>集合
        List<Orders> returnList = new ArrayList<>();
        Date date = new Date();
        //获取该用户的购物车
        CarExample example = new CarExample();
        CarExample.Criteria criteria = example.createCriteria();
        criteria.andCarBuyerIdEqualTo(user.getUserId());
        //获取该用户选择结算的商品，即获取相应的商品id
        Long[] carIds = (Long[]) request.getSession().getAttribute("sel_products");
        //遍历这些商品id，查询到购物车
        if (carIds != null) {
            List<Long> longs = new ArrayList<>();
            for (int i = 0; i < carIds.length; i++) {
                longs.add(carIds[i]);
            }
            //追加查询条件
            criteria.andCarProductIdIn(longs);
        }
        //执行查询，查询购物车
        List<Car> carList = carMapper.selectByExample(example);
        //创建一个map，键是每个商品（即该购物车）的卖家id，值是这个购物车
        Map<Long, List<Car>> map = new HashMap<>();
        for (Car car : carList) {
            Product product = productMapper.selectByPrimaryKey(car.getCarProductId());
            if (map.containsKey(product.getProductSellerId())) {
                List<Car> list = map.get(product.getProductSellerId());
                list.add(car);
                map.put(product.getProductSellerId(), list);
            } else {
                List<Car> list = new ArrayList<>();
                list.add(car);
                map.put(product.getProductSellerId(), list);
            }
        }
        //查询用户默认的地址
        AddressExample example1 = new AddressExample();
        AddressExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andAddressBuyerIdEqualTo(user.getUserId());
        criteria1.andAddressIsDefaultEqualTo("1");
        List<Address> addressList = addressMapper.selectByExample(example1);
        for (Map.Entry<Long, List<Car>> entry : map.entrySet()) {
            Orders orders = new Orders();
            orders.setOrderBuyerId(user.getUserId());
            orders.setOrderSellerId(entry.getKey());
            String orderNo = IDUtils.getOrdersn();
            orders.setOrderNo(orderNo);
            orders.setOrderAddress(addressList.get(0).getAddressAddress());
            orders.setOrderTime(date);
            //时间处理一下
            Calendar now = Calendar.getInstance();
            String[] sj = sc_date.split("-");
            String newdate = now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DAY_OF_MONTH) + " " + sj[0].substring(0, 2) + ":00:00";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date1 = null;
            try {
                date1 = sdf.parse(newdate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            orders.setOrderDelieveTime(date1);
            orders.setOrderFinishTime(new Date());
            orders.setOrderTotalPrice(sumprice);
            orders.setOrderPayment(paytype + "");
            /*<%--订单状态 分为0：已确定 未付款  1：已确定已付款未发货--%>
                <%--2：已确定已付款已发货待收货 3：已确定 已付款 已发货 已收货--%>
                <%--4：已确定 货到付款 未发货:5：已确定 货到付款 已发货未收货--%>
                <%--6：已确定 货到付款 已发货 已收货--%>
                <%--7：已经评价 ；8取消订单;9退款申请（）10已退款;11用户不收货--%>*/
            orders.setOrderStatus(paytype == 0 ? "0" : "4");
            orders.setOrderComments(message);
            //插入订单
            ordersMapper.insert(orders);

            //插入订单后，在获取，以便生成订单详情
            OrdersExample example2 = new OrdersExample();
            OrdersExample.Criteria criteria2 = example2.createCriteria();
            criteria2.andOrderBuyerIdEqualTo(user.getUserId());
            criteria2.andOrderNoEqualTo(orderNo);
            List<Orders> ordersList = ordersMapper.selectByExample(example2);
            returnList.add(ordersList.get(0));

            //生成订单项
            List<Car> carList1 = entry.getValue();
            for (Car car : carList1) {
                Item item = new Item();
                item.setItemOrderId(ordersList.get(0).getOrderId());
                item.setItemProductId(car.getCarProductId());
                item.setItemProductNum(car.getCarProductNum());
                item.setItemProductPrice(car.getCarProductPrice());
                //插入
                itemMapper.insert(item);

                //插入一个订单项，就删除一个购物车
                carMapper.deleteByPrimaryKey(car.getCarId());
                //同时减少商品库存，和增加该商品的卖出数量
                //先获取该商品
                Product product = productMapper.selectByPrimaryKey(car.getCarProductId());
                product.setProductStock(product.getProductStock() - car.getCarProductNum());
                product.setProductHassSelled(product.getProductHassSelled() + car.getCarProductNum());
                productMapper.updateByPrimaryKey(product);
            }
        }
        return returnList;
    }

    @Override
    public PageResult selectOrderListByUserId(Integer page, Integer row, Long userId) {
        OrdersExample example = new OrdersExample();
        OrdersExample.Criteria criteria = example.createCriteria();
        criteria.andOrderBuyerIdEqualTo(userId);
        PageHelper.startPage(page, row);
        List<Orders> ordersList = ordersMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(ordersList);
        return PageResult.buid(page, ordersList, pageInfo.getPages());
    }

    @Override
    public double selectOrderByuser(Long order) {
        Orders orders = ordersMapper.selectByPrimaryKey(order);
        OrdersExample example = new OrdersExample();
        OrdersExample.Criteria criteria = example.createCriteria();
        criteria.andOrderTimeEqualTo(orders.getOrderTime());
        List<Orders> list = ordersMapper.selectByExample(example);
        double sumPrice = 0.00;
        for (Orders orders1 : list) {
            sumPrice += orders1.getOrderTotalPrice();
        }
        return sumPrice;
    }

    @Override
    public void updateOrderStatus(int all, HttpServletRequest request, Long[] longs) {
        if (all == 1) {
            for (Long l : longs) {
                if (l != null) {
                    Orders orders = ordersMapper.selectByPrimaryKey(l);
                    //说明只结账一个商家的
                    orders.setOrderStatus(1 + "");
                    ordersMapper.updateByPrimaryKey(orders);
                } else {
                    break;
                }
            }
        } else {
            Orders orders = ordersMapper.selectByPrimaryKey(longs[0]);
            OrdersExample example = new OrdersExample();
            OrdersExample.Criteria criteria = example.createCriteria();
            criteria.andOrderTimeEqualTo(orders.getOrderTime());
            List<Orders> list = ordersMapper.selectByExample(example);
            for (Orders orders1 : list) {
                orders1.setOrderStatus(1 + "");
                ordersMapper.updateByPrimaryKey(orders1);
            }
        }
    }

    @Override
    public void deleteOrderById(Long id) {
        ItemExample example = new ItemExample();
        ItemExample.Criteria criteria = example.createCriteria();
        criteria.andItemOrderIdEqualTo(id);
        itemMapper.deleteByExample(example);
        ordersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public OrderAndUser selectItemByOrderId(Long id) {
        OrderAndUser orderAndUser = new OrderAndUser();
        Orders orders = ordersMapper.selectByPrimaryKey(id);
        BeanUtils.copyProperties(orders, orderAndUser);
        User user = userMapper.selectByPrimaryKey(orders.getOrderBuyerId());
        orderAndUser.setUserName(user.getUserNickname());
        orderAndUser.setUserPhone(user.getUserPhone());

        List<ItemAndProduct> itemAndProductList = new ArrayList<>();
        ItemExample itemExample = new ItemExample();
        ItemExample.Criteria criteria = itemExample.createCriteria();
        criteria.andItemOrderIdEqualTo(orders.getOrderId());
        List<Item> items = itemMapper.selectByExample(itemExample);
        for (Item i : items){
            ItemAndProduct itemAndProduct = new ItemAndProduct();
            BeanUtils.copyProperties(i, itemAndProduct);
            Product product = productMapper.selectByPrimaryKey(i.getItemProductId());
            itemAndProduct.setProductName(product.getProductName());
            itemAndProduct.setProductPrice(product.getProductPrice());
            itemAndProductList.add(itemAndProduct);
        }
        orderAndUser.setList(itemAndProductList);
        return orderAndUser;
    }
}
