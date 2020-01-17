package com.guang.bishe.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guang.bishe.domain.*;
import com.guang.bishe.mapper.ItemMapper;
import com.guang.bishe.mapper.OrdersMapper;
import com.guang.bishe.mapper.ProductMapper;
import com.guang.bishe.mapper.UserMapper;
import com.guang.bishe.service.UserService;
import com.guang.bishe.service.dto.ItemAndProduct;
import com.guang.bishe.service.dto.OrderAndUser;
import com.guang.bishe.service.dto.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private OrdersMapper orderMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private ProductMapper productMapper;
    @Override
    public PageResult selectOrderListByUserId(int page, int row, Long userId) {
        OrdersExample orderExample = new OrdersExample();
        OrdersExample.Criteria criteria = orderExample.createCriteria();
        criteria.andOrderBuyerIdEqualTo(userId);

        PageHelper.startPage(page,row);
        List<Orders> ordersList = orderMapper.selectByExample(orderExample);
        PageInfo pageInfo = new PageInfo(ordersList);
        return  PageResult.buid(page,ordersList,pageInfo.getPages());
    }



    @Override
    public void updateOrder(long orderId, String status) {
        Orders orders = new Orders();
        orders.setOrderId(orderId);
        orders.setOrderStatus(status);
        orderMapper.updateByPrimaryKeySelective(orders);
    }

    @Override
    public void deleteOrderByOrderId(long id) {
        ItemExample itemExample = new ItemExample();
        ItemExample.Criteria criteria = itemExample.createCriteria();
        criteria.andItemOrderIdEqualTo(id);
        itemMapper.deleteByExample(itemExample);
        orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public OrderAndUser selectitemByOrderId(long id) {

        OrderAndUser orderAndUser = new OrderAndUser();
        Orders orders = orderMapper.selectByPrimaryKey(id);

        orderAndUser.setOrderId(orders.getOrderId());
        orderAndUser.setOrderBuyerId(orders.getOrderBuyerId());
        orderAndUser.setOrderSellerId(orders.getOrderSellerId());
        orderAndUser.setOrderNo(orders.getOrderNo());
        orderAndUser.setOrderAddress(orders.getOrderAddress());
        orderAndUser.setOrderTime(orders.getOrderTime());
        orderAndUser.setOrderDelieveTime(orders.getOrderDelieveTime());
        orderAndUser.setOrderFinishTime(orders.getOrderFinishTime());
        orderAndUser.setOrderTotalPrice(orders.getOrderTotalPrice());
        orderAndUser.setOrderPayment(orders.getOrderPayment());
        orderAndUser.setOrderStatus(orders.getOrderStatus());
        orderAndUser.setOrderComments(orders.getOrderComments());
        //
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
            itemAndProduct.setItemProductNum(i.getItemProductNum());
            itemAndProduct.setItemId(i.getItemId());
            itemAndProduct.setItemOrderId(i.getItemOrderId());
            itemAndProduct.setItemProductId(i.getItemProductId());
            itemAndProduct.setItemProductPrice(i.getItemProductPrice());

            Product product = productMapper.selectByPrimaryKey(i.getItemProductId());
            itemAndProduct.setProductName(product.getProductName());
            itemAndProduct.setProductPrice(product.getProductPrice());

            itemAndProductList.add(itemAndProduct);
        }
        orderAndUser.setList(itemAndProductList);
        return orderAndUser;
    }

    @Override
    public Orders selectOrderByOrderId(long id) {
        return orderMapper.selectByPrimaryKey(id);
    }
}
