package com.guang.bishe.service;

import com.guang.bishe.domain.Orders;
import com.guang.bishe.service.dto.OrderAndUser;
import com.guang.bishe.service.dto.PageResult;

public interface UserService {
    /**
     *
     * 查找订单列表
     */
    PageResult selectOrderListByUserId(int page, int row, Long userId);
    /**
     *订单
     * 更新
     */

    void updateOrder(long orderId, String status);
    /**
     *
     * 删除订单
     */
    void deleteOrderByOrderId(long id);
    /**
     *
     * 订单 详情
     */
    OrderAndUser selectitemByOrderId(long id);
    /**
     *
     * 通过订单id查找订单
     */
    Orders selectOrderByOrderId(long id);
}
