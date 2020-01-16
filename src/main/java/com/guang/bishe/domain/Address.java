package com.guang.bishe.domain;

public class Address {
    private Long addressId;

    private Long addressBuyerId;

    private String addressAddress;

    private String addressIsDefault;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getAddressBuyerId() {
        return addressBuyerId;
    }

    public void setAddressBuyerId(Long addressBuyerId) {
        this.addressBuyerId = addressBuyerId;
    }

    public String getAddressAddress() {
        return addressAddress;
    }

    public void setAddressAddress(String addressAddress) {
        this.addressAddress = addressAddress == null ? null : addressAddress.trim();
    }

    public String getAddressIsDefault() {
        return addressIsDefault;
    }

    public void setAddressIsDefault(String addressIsDefault) {
        this.addressIsDefault = addressIsDefault == null ? null : addressIsDefault.trim();
    }
}