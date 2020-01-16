package com.guang.bishe.service.impl;

import com.guang.bishe.domain.Address;
import com.guang.bishe.domain.AddressExample;
import com.guang.bishe.domain.User;
import com.guang.bishe.mapper.AddressMapper;
import com.guang.bishe.service.AddressService;
import com.guang.bishe.service.dto.ShopResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public void insertAddress(Address address) {
        addressMapper.insert(address);
    }

    @Override
    public List<Address> getAddressByUserId(long userId) {
        AddressExample example = new AddressExample();
        AddressExample.Criteria criteria = example.createCriteria();
        criteria.andAddressBuyerIdEqualTo(userId);
        List<Address> list = addressMapper.selectByExample(example);
        return list;
    }

    @Override
    public ShopResult insertAddress(HttpServletRequest request, String address) {
        User user = (User) request.getSession().getAttribute("user");
        Address as = new Address();
        as.setAddressBuyerId(user.getUserId());
        as.setAddressAddress(address);
        as.setAddressIsDefault("0");
        //执行插入
        addressMapper.insert(as);
        return ShopResult.build(200, "添加成功");
    }

    @Override
    public void updateAddress(HttpServletRequest request, int num) {
        User user = (User) request.getSession().getAttribute("user");
        AddressExample example = new AddressExample();
        AddressExample.Criteria criteria = example.createCriteria();
        criteria.andAddressBuyerIdEqualTo(user.getUserId());
        List<Address> list = addressMapper.selectByExample(example);
        //循环用户地址，把选中的地址变成默认的，其余的变成不是
        for (int i = 0; i < list.size(); i++) {
            if (i == num) {
                if (!list.get(i).getAddressIsDefault().equals("1")) {
                    list.get(i).setAddressIsDefault("1");
                    addressMapper.updateByPrimaryKey(list.get(i));
                }

            } else {
                if (!list.get(i).getAddressIsDefault().equals("0")) {
                    list.get(i).setAddressIsDefault("0");
                    addressMapper.updateByPrimaryKey(list.get(i));
                }
            }
        }
    }

    @Override
    public void updateAdressAll(String[] addressId, String[] addressAddress) {
        for (int i = 0; i < addressId.length; i++) {
            Address address = new Address();
            address.setAddressId(Long.parseLong(addressId[i]));
            address.setAddressAddress(addressAddress[i]);
            addressMapper.updateByPrimaryKeySelective(address);
        }
    }

    @Override
    public void insertSomAdress(String[] hpmename, Long userId) {
        for (String as : hpmename) {
            Address address = new Address();
            address.setAddressAddress(as);
            address.setAddressBuyerId(userId);
            address.setAddressIsDefault("0");
            addressMapper.insert(address);
        }
    }

    @Override
    public void deleteAdress(Long id) {
        addressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updatedefaultAddresss(Long id) {
        //先查询出默认的地址改为不默认的
        AddressExample example = new AddressExample();
        AddressExample.Criteria criteria = example.createCriteria();
        criteria.andAddressIsDefaultEqualTo("1");
        List<Address> addressList = addressMapper.selectByExample(example);
        if (addressList.size() > 0) {
            Address address = new Address();
            address.setAddressId(id);
            address.setAddressIsDefault("0");
            addressMapper.updateByPrimaryKeySelective(address);
        }
        //将此地址变成默认地址
        Address address2 = new Address();
        address2.setAddressId(id);
        address2.setAddressIsDefault("1");
        addressMapper.updateByPrimaryKeySelective(address2);
    }
}
