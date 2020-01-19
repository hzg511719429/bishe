package com.guang.bishe.service;

import com.guang.bishe.domain.Address;
import com.guang.bishe.service.dto.ShopResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface AddressService {

    /**
     * 在注册时插入一个买家地址
     *
     * @param address
     */
    void insertAddress(Address address);

    /**
     * 根据用户id获取所有该用户的地址
     *
     * @param userId
     * @return
     */
    List<Address> getAddressByUserId(long userId);

    /**
     * 在订单页面添加一个新地址
     *
     * @param request
     * @param address
     * @return
     */
    ShopResult insertAddress(HttpServletRequest request, String address);

    /**
     * 改变默认的用户地址
     *
     * @param request
     * @param num
     */
    void updateAddress(HttpServletRequest request, int num);

    /**
     * 更改用户地址
     *
     * @param addressId
     * @param addressAddress
     */
    void updateAdressAll(String[] addressId, String[] addressAddress);

    /**
     * 在修改资料页面添加多个地址
     *
     * @param hpmename
     * @param userId
     */
    void insertSomAdress(String[] hpmename, Long userId);

    /**
     * 根据id删除地址
     *
     * @param id
     */
    void deleteAddress(Long id);

    /**
     * 更改此地址为默认地址
     *
     * @param id
     */
    void updateDefaultAddress(Long id);
}
