package com.guang.bishe.domain;

import java.util.Date;

public class Orders {
    private Long orderId;

    private Long orderBuyerId;

    private Long orderSellerId;

    private String orderNo;

    private String orderAddress;

    private Date orderTime;

    private Date orderDelieveTime;

    private Date orderFinishTime;

    private Double orderTotalPrice;

    private String orderPayment;

    private String orderStatus;

    private String orderComments;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderBuyerId() {
        return orderBuyerId;
    }

    public void setOrderBuyerId(Long orderBuyerId) {
        this.orderBuyerId = orderBuyerId;
    }

    public Long getOrderSellerId() {
        return orderSellerId;
    }

    public void setOrderSellerId(Long orderSellerId) {
        this.orderSellerId = orderSellerId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress == null ? null : orderAddress.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getOrderDelieveTime() {
        return orderDelieveTime;
    }

    public void setOrderDelieveTime(Date orderDelieveTime) {
        this.orderDelieveTime = orderDelieveTime;
    }

    public Date getOrderFinishTime() {
        return orderFinishTime;
    }

    public void setOrderFinishTime(Date orderFinishTime) {
        this.orderFinishTime = orderFinishTime;
    }

    public Double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public String getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(String orderPayment) {
        this.orderPayment = orderPayment == null ? null : orderPayment.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOrderComments() {
        return orderComments;
    }

    public void setOrderComments(String orderComments) {
        this.orderComments = orderComments == null ? null : orderComments.trim();
    }
}