package com.guang.bishe.domain;

public class Item {
    private Long itemId;

    private Long itemOrderId;

    private Long itemProductId;

    private Integer itemProductNum;

    private Double itemProductPrice;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemOrderId() {
        return itemOrderId;
    }

    public void setItemOrderId(Long itemOrderId) {
        this.itemOrderId = itemOrderId;
    }

    public Long getItemProductId() {
        return itemProductId;
    }

    public void setItemProductId(Long itemProductId) {
        this.itemProductId = itemProductId;
    }

    public Integer getItemProductNum() {
        return itemProductNum;
    }

    public void setItemProductNum(Integer itemProductNum) {
        this.itemProductNum = itemProductNum;
    }

    public Double getItemProductPrice() {
        return itemProductPrice;
    }

    public void setItemProductPrice(Double itemProductPrice) {
        this.itemProductPrice = itemProductPrice;
    }
}