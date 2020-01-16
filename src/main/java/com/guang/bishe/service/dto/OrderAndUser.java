package com.guang.bishe.service.dto;

import com.guang.bishe.domain.Orders;

import java.util.List;

public class OrderAndUser extends Orders {

    private String userName;
    private String userPhone;
    private String address;
    private List<ItemAndProduct> list;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ItemAndProduct> getList() {
        return list;
    }

    public void setList(List<ItemAndProduct> list) {
        this.list = list;
    }
}
