package com.guang.bishe.service;

import com.guang.bishe.service.dto.OrderAndUser;
import com.guang.bishe.service.dto.PageResult;

public interface SellOrdersService {

    /**
     * 商家从首页跳转订单列表
     *
     * @param page
     * @param row
     * @param userId
     * @return
     */
    PageResult getOrderListByUserId(int page, int row, long userId);

    /**
     * 在订单列表中按条件查询
     *
     * @param page
     * @param row
     * @param userId
     * @param action
     * @return
     */
    PageResult selectOrderListAction(int page, int row, long userId, String action);

    /**
     * 订单详情,创建一个新pojo作为返回对象
     *
     * @param id
     * @return
     */
    OrderAndUser selectItemByOrderId(long id);
}
