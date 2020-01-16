package com.guang.bishe.service;

import com.guang.bishe.domain.Product;
import com.guang.bishe.domain.Productimg;

import java.util.List;

public interface ProductService {

    /**
     * 根据商品id获取商品
     *
     * @param id
     * @return
     */
    Product getProductById(long id);

    /**
     * 根据商品id获取商品图片
     *
     * @param id
     * @return
     */
    List<Productimg> getProductimgList(long id);

    /**
     * 根据商品图片id删除商品图片
     *
     * @param productImgId
     */
    void updateDeleteImg(long productImgId);
}
