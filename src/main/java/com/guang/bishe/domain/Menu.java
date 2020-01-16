package com.guang.bishe.domain;

public class Menu {
    private Long menuId;

    private Long menuSellerId;

    private Long menuProductId;

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getMenuSellerId() {
        return menuSellerId;
    }

    public void setMenuSellerId(Long menuSellerId) {
        this.menuSellerId = menuSellerId;
    }

    public Long getMenuProductId() {
        return menuProductId;
    }

    public void setMenuProductId(Long menuProductId) {
        this.menuProductId = menuProductId;
    }
}