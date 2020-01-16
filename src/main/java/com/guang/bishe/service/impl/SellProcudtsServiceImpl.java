package com.guang.bishe.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guang.bishe.domain.*;
import com.guang.bishe.mapper.CarMapper;
import com.guang.bishe.mapper.ProductMapper;
import com.guang.bishe.mapper.ProductimgMapper;
import com.guang.bishe.service.SellProductsService;
import com.guang.bishe.service.dto.PageResult;
import com.guang.bishe.service.dto.ShopResult;
import com.guang.bishe.service.util.IDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Service
public class SellProcudtsServiceImpl implements SellProductsService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductimgMapper productimgMapper;
    @Autowired
    private CarMapper carMapper;

    @Override
    public PageResult getUserAllProducts(HttpServletRequest request, int page, int row) {
        //如果该用户已登录，从session中获取该user，根据userId查询该用户下的所有商品
        User user = (User) request.getSession().getAttribute("user");
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria1 = productExample.createCriteria();
        criteria1.andProductSellerIdEqualTo(user.getUserId());
        //执行查询前，进行分页操作
        PageHelper.startPage(page, row);
        List<Product> productList = productMapper.selectByExample(productExample);
        PageInfo pageInfo = new PageInfo(productList);
        int totalPages = pageInfo.getPages();

        return PageResult.buid(page, productList, totalPages);
    }

    @Override
    public void updateProductStatus(HttpServletRequest request, long id, String status) {
        //根据id获取商品，然后更新状态
        Product product = productMapper.selectByPrimaryKey(id);
        product.setProductIsSell(status);
        productMapper.updateByPrimaryKey(product);
    }

    @Override
    public ShopResult updateProduct(HttpServletRequest request, Product product) {
        product.setProductPicture("不使用该字段");
        productMapper.updateByPrimaryKey(product);
        return ShopResult.build(200, "修改成功", request.getContextPath() + "/adminimenu");
    }

    @Override
    public ShopResult updatelittleProducts(HttpServletRequest request, int[] ids, int status) {
        //循环数组，改变商品状态
        for (int i = 0; i < ids.length; i++) {
            //判断status状态
            //状态2是删除操作
            if (status == 2) {
                //删除商品前要先删除商品图片
                ProductimgExample example = new ProductimgExample();
                ProductimgExample.Criteria criteria = example.createCriteria();
                criteria.andProductIdEqualTo((long) ids[i]);
                productimgMapper.deleteByExample(example);
                //还要删除购物车对应的商品
                CarExample example1 = new CarExample();
                CarExample.Criteria criteria1 = example1.createCriteria();
                criteria1.andCarProductIdEqualTo((long) ids[i]);
                carMapper.deleteByExample(example1);

                productMapper.deleteByPrimaryKey((long) ids[i]);
            } else {
                //此状态是改变上架或不上架。
                Product product = productMapper.selectByPrimaryKey((long) ids[i]);
                product.setProductIsSell(status + "");
                productMapper.updateByPrimaryKey(product);
            }
        }
        return ShopResult.build(200, "修改成功", request.getContextPath() + "/adminimenu");

    }

    @Override
    public ShopResult insertProduct(HttpServletRequest request, Product product) {
        User user = (User) request.getSession().getAttribute("user");
        product.setProductSellerId(user.getUserId());
        product.setProductNo(IDUtils.genItemId() + "");
        product.setProductHassSelled(0);
        if (product.getProductDescription() == null) {
            product.setProductDescription("商家未进行介绍");
        }
        productMapper.insert(product);

        ProductExample example = new ProductExample();
        ProductExample.Criteria criteria = example.createCriteria();
        criteria.andProductNoEqualTo(product.getProductNo());
        List<Product> productList = productMapper.selectByExample(example);
        //商品图片添加，先获取路径
        Map<Integer, String> list = (Map<Integer, String>) request.getSession().getAttribute("uploadImgCount");
        for (Map.Entry<Integer, String> entry : list.entrySet()) {
            Productimg productimg = new Productimg();
            productimg.setProductId(productList.get(0).getProductId());
            productimg.setImgurl(entry.getValue());
            productimgMapper.insert(productimg);
        }
        return ShopResult.build(200, "添加成功", request.getContextPath() + "/adminimenu");
    }
}
