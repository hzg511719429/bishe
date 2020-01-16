package com.guang.bishe.service.impl;

import com.guang.bishe.domain.Product;
import com.guang.bishe.domain.Productimg;
import com.guang.bishe.domain.ProductimgExample;
import com.guang.bishe.mapper.ProductMapper;
import com.guang.bishe.mapper.ProductimgMapper;
import com.guang.bishe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductimgMapper productimgMapper;

    @Override
    public Product getProductById(long id) {
        //根据id查询商品
        Product product = productMapper.selectByPrimaryKey(id);
        return product;
    }

    @Override
    public List<Productimg> getProductimgList(long id) {
        ProductimgExample example2 = new ProductimgExample();
        ProductimgExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andProductIdEqualTo(id);
        List<Productimg> productimgList = productimgMapper.selectByExample(example2);
        return productimgList;
    }

    @Override
    public void updateDeleteImg(long productImgId) {
        productimgMapper.deleteByPrimaryKey(productImgId);
    }
}
