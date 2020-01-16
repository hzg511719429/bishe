package com.guang.bishe.service.dto;

import com.guang.bishe.domain.Item;

public class ItemAndProduct extends Item {

    private String productName;
    private double productPrice;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
