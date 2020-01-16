package com.guang.bishe.controller;
import com.guang.bishe.service.CartService;
import com.guang.bishe.service.dto.CartView;
import com.guang.bishe.service.dto.ShopResult;
import com.guang.bishe.service.dto.ShowCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    /**
     * 在商品详情页面加入购物车
     *
     * @param request
     * @param id
     * @param price
     * @param number
     * @param status
     * @return
     */
    @RequestMapping("/addcart")
    @ResponseBody
    public ShopResult addCart(HttpServletRequest request, Long id,
                              double price, Integer number, Integer status) {
        ShopResult result = cartService.addCart(request, id, price, number, status);
        return result;
    }

    /**
     * 首页点击加入购物车
     *
     * @param request
     * @param id
     * @return
     */
    @RequestMapping("/indexAddCart")
    public String indexAddCart(HttpServletRequest request, Long id) {
        cartService.addIndexCart(request, id);
        return "redirect:cart";
    }

    /**
     * 跳转购物车页面
     *
     * @return
     */
    @RequestMapping("/cart")
    public String toCart(HttpServletRequest request, Model model) {
        //定义两个数
        int productNum = 0;
        double productPriceCount = 0.00;
        List<CartView> list = cartService.getCartProductsByUser(request);
        for (CartView cartView : list) {
            productNum += cartView.getCarProductNum();
            productPriceCount += cartView.getCarProductPrice();
        }
        model.addAttribute("cartList", list);
        model.addAttribute("productNum", productNum);
        model.addAttribute("productMoney", productPriceCount);
        model.addAttribute("listNum", list.size());
        return "cart";
    }

    /**
     * 选择多个商品，改变价格
     *
     * @return
     */
    @RequestMapping("/updatePrice")
    @ResponseBody
    public ShowCart updateCart(HttpServletRequest request, Long[] cartId) {
        ShowCart showCart = cartService.updateCartPrice(request, cartId);
        return showCart;
    }

    /**
     * 删除购物车的一个商品
     *
     * @param id
     * @return
     */
    @RequestMapping("/deleteCartOne")
    public String deleteCartOne(Long id) {
        cartService.deleteCartOne(id);
        return "redirect:cart";
    }
}
