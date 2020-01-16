package com.guang.bishe.controller;

import com.guang.bishe.domain.Product;
import com.guang.bishe.domain.Productimg;
import com.guang.bishe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/productDesc")
    public String productDescription(Model model, Long id) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        List<Productimg> productimgList = productService.getProductimgList(id);
        if (productimgList.size() == 0) {
            Productimg productimg = new Productimg();
            productimg.setImgurl("static/img/defult.jpg");
            productimgList.add(productimg);
            model.addAttribute("productImgList", productimgList);
        } else {
            model.addAttribute("productImgList", productimgList);
        }
        return "productDesc";
    }


}
