package com.guang.bishe.domain;

public class Productimg {
    private Long id;

    private Long productId;

    private String imgurl;

    private String beiyong;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getBeiyong() {
        return beiyong;
    }

    public void setBeiyong(String beiyong) {
        this.beiyong = beiyong == null ? null : beiyong.trim();
    }
}