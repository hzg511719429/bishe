package com.guang.bishe.service;

import com.guang.bishe.service.dto.CartView;
import com.guang.bishe.service.dto.ShopResult;
import com.guang.bishe.service.dto.ShowCart;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface CartService {

    /**
     * 添加商品到购物车
     *
     * @param request
     * @param id
     * @param price
     * @param number
     * @param status
     * @return
     */
    ShopResult addCart(HttpServletRequest request, long id, double price, int number, int status);

    /**
     * 在主页添加商品到购物车
     *
     * @param request
     * @param id
     * @return
     */
    void addIndexCart(HttpServletRequest request, long id);

    /**
     * 获取用户所有加入购物车的商品
     *
     * @param request
     * @return
     */
    List<CartView> getCartProductsByUser(HttpServletRequest request);

    /**
     * 选择多个商品，改变价格
     *
     * @param request
     * @param cartId
     * @return
     */
    ShowCart updateCartPrice(HttpServletRequest request, Long[] cartId);

    /**
     * 删除购物车中的一个商品
     *
     * @param id
     */
    void deleteCartOne(long id);
}
