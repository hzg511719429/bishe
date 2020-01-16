package com.guang.bishe.domain;

public class Car {
    private Long carId;

    private Long carBuyerId;

    private Long carProductId;

    private Integer carProductNum;

    private Double carProductPrice;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getCarBuyerId() {
        return carBuyerId;
    }

    public void setCarBuyerId(Long carBuyerId) {
        this.carBuyerId = carBuyerId;
    }

    public Long getCarProductId() {
        return carProductId;
    }

    public void setCarProductId(Long carProductId) {
        this.carProductId = carProductId;
    }

    public Integer getCarProductNum() {
        return carProductNum;
    }

    public void setCarProductNum(Integer carProductNum) {
        this.carProductNum = carProductNum;
    }

    public Double getCarProductPrice() {
        return carProductPrice;
    }

    public void setCarProductPrice(Double carProductPrice) {
        this.carProductPrice = carProductPrice;
    }
}