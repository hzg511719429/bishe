package com.guang.bishe.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guang.bishe.domain.*;
import com.guang.bishe.mapper.ItemMapper;
import com.guang.bishe.mapper.OrdersMapper;
import com.guang.bishe.mapper.ProductMapper;
import com.guang.bishe.mapper.UserMapper;
import com.guang.bishe.service.SellOrdersService;
import com.guang.bishe.service.dto.ItemAndProduct;
import com.guang.bishe.service.dto.OrderAndUser;
import com.guang.bishe.service.dto.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SellOrdersServiceImpl implements SellOrdersService {

    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public PageResult getOrderListByUserId(int page, int row, long userId) {
        OrdersExample example = new OrdersExample();
        OrdersExample.Criteria criteria = example.createCriteria();
        criteria.andOrderSellerIdEqualTo(userId);
        PageHelper.startPage(page, row);
        List<Orders> ordersList = ordersMapper.selectByExample(example);
        PageInfo<Orders> pageInfo = new PageInfo(ordersList);
        return PageResult.buid(page, ordersList, pageInfo.getPages());
    }

    @Override
    public PageResult selectOrderListAction(int page, int row, long userId, String action) {
        OrdersExample example = new OrdersExample();
        OrdersExample.Criteria criteria = example.createCriteria();
        criteria.andOrderSellerIdEqualTo(userId);
        if (!action.equals("00")) {
            criteria.andOrderStatusEqualTo(action);
        }
        PageHelper.startPage(page, row);
        List<Orders> ordersList = ordersMapper.selectByExample(example);
        PageInfo<Orders> pageInfo = new PageInfo(ordersList);
        return PageResult.buid(page, ordersList, pageInfo.getPages());
    }

    @Override
    public OrderAndUser selectItemByOrderId(long id) {
        OrderAndUser orderAndUser = new OrderAndUser();
        Orders orders = ordersMapper.selectByPrimaryKey(id);
        orderAndUser.setOrderNo(orders.getOrderNo());
        orderAndUser.setOrderId(orders.getOrderId());
        orderAndUser.setOrderBuyerId(orders.getOrderBuyerId());
        orderAndUser.setOrderSellerId(orders.getOrderSellerId());
        orderAndUser.setAddress(orders.getOrderAddress());
        orderAndUser.setOrderTime(orders.getOrderTime());
        orderAndUser.setOrderDelieveTime(orders.getOrderDelieveTime());
        orderAndUser.setOrderFinishTime(orders.getOrderFinishTime());
        orderAndUser.setOrderTotalPrice(orders.getOrderTotalPrice());
        orderAndUser.setOrderPayment(orders.getOrderPayment());
        orderAndUser.setOrderStatus(orders.getOrderStatus());
        orderAndUser.setOrderComments(orders.getOrderComments());

        User user = userMapper.selectByPrimaryKey(orders.getOrderBuyerId());
        orderAndUser.setUserName(user.getUserNickname());
        orderAndUser.setUserPhone(user.getUserPhone());

        List<ItemAndProduct> list = new ArrayList<>();
        ItemExample example = new ItemExample();
        ItemExample.Criteria criteria = example.createCriteria();
        criteria.andItemOrderIdEqualTo(orders.getOrderId());
        List<Item> itemList = itemMapper.selectByExample(example);
        for (Item item : itemList) {
            ItemAndProduct itemAndProduct = new ItemAndProduct();
            itemAndProduct.setItemProductNum(item.getItemProductNum());
            itemAndProduct.setItemOrderId(item.getItemOrderId());
            itemAndProduct.setItemId(item.getItemId());
            itemAndProduct.setItemProductId(item.getItemProductId());
            itemAndProduct.setItemProductPrice(item.getItemProductPrice());

            Product product = productMapper.selectByPrimaryKey(item.getItemProductId());
            itemAndProduct.setProductName(product.getProductName());
            itemAndProduct.setProductPrice(product.getProductPrice());

            list.add(itemAndProduct);
        }
        orderAndUser.setList(list);
        return orderAndUser;
    }
}
