package com.guang.bishe.service.impl;

import com.guang.bishe.domain.*;
import com.guang.bishe.mapper.CarMapper;
import com.guang.bishe.mapper.ProductMapper;
import com.guang.bishe.mapper.ProductimgMapper;
import com.guang.bishe.service.CartService;
import com.guang.bishe.service.dto.CartView;
import com.guang.bishe.service.dto.ShopResult;
import com.guang.bishe.service.dto.ShowCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CarMapper carMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductimgMapper productimgMapper;

    @Override
    public ShopResult addCart(HttpServletRequest request, long id, double price, int number, int status) {
        //传入价格，方便计算购物车总价格
        User user = (User) request.getSession().getAttribute("user");
        //判断购物车中是否有该商品
        CarExample example1 = new CarExample();
        CarExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andCarProductIdEqualTo(id);
        List<Car> carList = carMapper.selectByExample(example1);
        if (carList.size() == 0) {
            Car car = new Car();
            car.setCarBuyerId(user.getUserId());
            car.setCarProductId(id);
            car.setCarProductNum(number);
            car.setCarProductPrice(price * number);
            carMapper.insert(car);
        } else {
            carList.get(0).setCarProductNum(carList.get(0).getCarProductNum() + number);
            carList.get(0).setCarProductPrice(carList.get(0).getCarProductNum() * price);
            carMapper.updateByPrimaryKey(carList.get(0));
        }
        if (status == 0) {
            return ShopResult.build(200, "加入成功");
        } else {
            return ShopResult.build(200, "加入成功，跳转订单页面", request.getContextPath() + "/cart");
        }
    }

    @Override
    public void addIndexCart(HttpServletRequest request, long id) {
        User user = (User) request.getSession().getAttribute("user");
        //判断购物车中是否有该商品
        CarExample example1 = new CarExample();
        CarExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andCarProductIdEqualTo(id);
        List<Car> carList = carMapper.selectByExample(example1);
        //获取该商品
        Product product = productMapper.selectByPrimaryKey(id);
        if (carList.size() == 0) {
            Car car = new Car();
            car.setCarBuyerId(user.getUserId());
            car.setCarProductId(id);
            car.setCarProductNum(1);
            car.setCarProductPrice(product.getProductPrice());
            carMapper.insert(car);
        } else {
            carList.get(0).setCarProductNum(carList.get(0).getCarProductNum() + 1);
            carList.get(0).setCarProductPrice(carList.get(0).getCarProductNum() * product.getProductPrice());
            carMapper.updateByPrimaryKey(carList.get(0));
        }
    }

    @Override
    public List<CartView> getCartProductsByUser(HttpServletRequest request) {
        //获取用户
        User user = (User) request.getSession().getAttribute("user");
        //获取购物车
        CarExample example = new CarExample();
        CarExample.Criteria criteria = example.createCriteria();
        criteria.andCarBuyerIdEqualTo(user.getUserId());
        Long[] cartId = (Long[]) request.getSession().getAttribute("sel_products");
        if (cartId != null && cartId.length != 0) {
            List<Long> longs = new ArrayList<>();
            for (int i = 0; i < cartId.length; i++) {
                longs.add(cartId[i]);
            }
            criteria.andCarProductIdIn(longs);
        }
        List<Car> carList = carMapper.selectByExample(example);
        List<CartView> list = new ArrayList<>();
        for (Car car : carList) {
            CartView cartView = new CartView();
            cartView.setCarBuyerId(car.getCarBuyerId());
            cartView.setCarId(car.getCarId());
            cartView.setCarProductId(car.getCarProductId());
            //购买数量
            cartView.setCarProductNum(car.getCarProductNum());
            //购物车总价格
            cartView.setCarProductPrice(car.getCarProductPrice());

            ProductimgExample example1 = new ProductimgExample();
            ProductimgExample.Criteria criteria1 = example1.createCriteria();
            criteria1.andProductIdEqualTo(car.getCarProductId());
            cartView.setProductImg(productimgMapper.selectByExample(example1).get(0).getImgurl());

            //购物车页面的两个属性
            Product product = productMapper.selectByPrimaryKey(car.getCarProductId());
            //商品单个价格
            cartView.setProductPrice(product.getProductPrice());
            //商品名字
            cartView.setProductName(product.getProductName());
            list.add(cartView);
        }
        return list;
    }

    @Override
    public ShowCart updateCartPrice(HttpServletRequest request, Long[] cartId) {
        ShowCart showCart = new ShowCart();
        request.getSession().setAttribute("sel_products", cartId);
        if (cartId != null && cartId.length != 0) {
            User user = (User) request.getSession().getAttribute("user");
            List<Long> list = new ArrayList<>();
            for (int i = 0; i < cartId.length; i++) {
                list.add(cartId[i]);
            }
            CarExample example = new CarExample();
            CarExample.Criteria criteria = example.createCriteria();
            criteria.andCarBuyerIdEqualTo(user.getUserId());
            criteria.andCarProductIdIn(list);
            List<Car> carList = carMapper.selectByExample(example);
            showCart.setNumber(0);
            showCart.setPrice(0.00);
            for (Car car : carList) {
                showCart.setNumber(showCart.getNumber() + car.getCarProductNum());
                showCart.setPrice(showCart.getPrice() + car.getCarProductPrice());
            }
        } else {
            showCart.setNumber(0);
            showCart.setPrice(0.00);
        }
        return showCart;
    }

    @Override
    public void deleteCartOne(long id) {
        carMapper.deleteByPrimaryKey(id);
    }


}
