package com.guang.bishe.service;

import com.guang.bishe.domain.Product;
import com.guang.bishe.service.dto.PageResult;
import com.guang.bishe.service.dto.ShopResult;

import javax.servlet.http.HttpServletRequest;

public interface SellProductsService {

    /**
     * 查询卖家用户下的所有商品
     *
     * @param request
     * @param page
     * @param row
     * @return
     */
    PageResult getUserAllProducts(HttpServletRequest request, int page, int row);

    /**
     * 根据商品id更改商品的状态
     *
     * @param request
     * @param id
     * @param status
     */
    void updateProductStatus(HttpServletRequest request, long id, String status);

    /**
     * 修改商品信息
     *
     * @param request
     * @param product
     * @return
     */
    ShopResult updateProduct(HttpServletRequest request, Product product);

    /**
     * 更改全部指定的商品状态
     *
     * @param request
     * @param ids
     * @param status
     * @return
     */
    ShopResult updatelittleProducts(HttpServletRequest request, int ids[], int status);

    /**
     * 添加商品
     *
     * @param request
     * @param product
     * @return
     */
    ShopResult insertProduct(HttpServletRequest request, Product product);
}
