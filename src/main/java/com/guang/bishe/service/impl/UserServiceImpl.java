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
    private ItemMapper itemMapper;
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
    public void updateOrder(Orders orders) {
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
    public Orders selectOrderByOrderId(long id) {
        return orderMapper.selectByPrimaryKey(id);
    }
}
