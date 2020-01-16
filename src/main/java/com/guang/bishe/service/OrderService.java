package com.guang.bishe.service;

import com.guang.bishe.domain.Orders;
import com.guang.bishe.service.dto.PageResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface OrderService {

    /**
     * 插入订单，并获该用户的所有订单
     *
     * @param request
     * @param sc_date
     * @param paytype
     * @param message
     * @param sumprice
     * @return
     */
    List<Orders> insertConfirmOrder(HttpServletRequest request, String sc_date, int paytype, String message, double sumprice);

    /**
     * 获取买家订单列表
     *
     * @param page
     * @param row
     * @param userId
     * @return
     */
    PageResult selectOrderListByUserId(Integer page, Integer row, Long userId);

    /**
     * 计算总金额
     *
     * @param order
     * @return
     */
    double selectOrderByuser(Long order);

    /**
     * 支付成功后，更改订单的支付状态
     *
     * @param all
     * @param request
     * @param longs
     */
    void updateOrderStatus(int all, HttpServletRequest request, Long[] longs);
}
