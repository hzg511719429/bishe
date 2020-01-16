package com.guang.bishe.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guang.bishe.domain.Product;
import com.guang.bishe.domain.ProductExample;
import com.guang.bishe.domain.Productimg;
import com.guang.bishe.domain.ProductimgExample;
import com.guang.bishe.mapper.ProductMapper;
import com.guang.bishe.mapper.ProductimgMapper;
import com.guang.bishe.service.PageService;
import com.guang.bishe.service.dto.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PageServiceImpl implements PageService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductimgMapper productimgMapper;

    @Override
    public PageResult getProductList(int page, int row, int status, double min, double max, String word) {
        //根据输入条件，进行组合查询
        ProductExample example1 = new ProductExample();
        ProductExample.Criteria criteria1 = example1.createCriteria();

        //确定最高价和最低价
        criteria1.andProductPriceBetween(min, max);
        //上架的才显示 不上架的不显示
        criteria1.andProductIsSellEqualTo("1");
        //判断商品的状态
        if (status != 0) {
            if (status == 1) {
                //按照最新查询
                example1.setOrderByClause("product_id DESC");
            } else {
                //按照卖出最多查询
                example1.setOrderByClause("product_hass_selled DESC");
            }
        }
        //根据搜索的关键词在进行查询
        if (word != null) {
            criteria1.andProductNameLike("%" + word + "%");
        }
        //执行查询
        PageHelper.startPage(page, row);
        List<Product> productList = productMapper.selectByExample(example1);
        PageInfo pageInfo = new PageInfo(productList);
        //总页数
        int totalPages = pageInfo.getPages();
        for (Product product : productList) {
            ProductimgExample example2 = new ProductimgExample();
            ProductimgExample.Criteria criteria2 = example2.createCriteria();
            criteria2.andProductIdEqualTo(product.getProductId());
            List<Productimg> productimgList = productimgMapper.selectByExample(example2);
            if (productimgList.size() == 0) {
                product.setProductPicture("static/img/defult.jpg");
            } else {
                //因为可能上传多张图片，这里取一张显示
                product.setProductPicture(productimgList.get(0).getImgurl());
            }
        }

        return PageResult.buid(page, productList, totalPages);
    }


}
