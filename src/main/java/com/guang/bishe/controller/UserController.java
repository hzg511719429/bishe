package com.guang.bishe.controller;

import com.guang.bishe.domain.Address;
import com.guang.bishe.domain.User;
import com.guang.bishe.service.AddressService;
import com.guang.bishe.service.RegistService;
import com.guang.bishe.service.dto.ShopResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private AddressService addressService;
    @Autowired
    private RegistService registService;

    /**
     * 跳转用户信息更改页面
     *
     * @return
     */
    @RequestMapping("/updateUser")
    public String editProfile(HttpServletRequest request, Model model) {
        User user = (User) request.getSession().getAttribute("user");
        if (!"1".equals(user.getUserRol())) {
            List<Address> addressList = addressService.getAddressByUserId(user.getUserId());
            model.addAttribute("addressList", addressList);
        }
        return "updateUser";
    }

    /**
     * 更改用户信息
     *
     * @param request
     * @param model
     * @param user
     * @param addressId
     * @param addressAddress
     * @param hpmename
     * @return
     */
    @RequestMapping(value = "updateUser", method = RequestMethod.POST)
    public String updateUser(HttpServletRequest request, Model model, User user,
                             String[] addressId, String[] addressAddress, String[] hpmename) {
        //校验数据
        if (user.getUserPassword() == null || user.getUserPassword() == "") {
            model.addAttribute("errss1", "密码不能为空");
            //判断用户是否为买家
            checkUserRol(user, model);
            return "updateUser";
        } else if (user.getUserPassword().length() < 6) {
            model.addAttribute("errss1", "密码长度不能小于6");
            checkUserRol(user, model);
            return "updateUser";
        } else if (user.getUserNickname() == null || user.getUserNickname() == "") {
            model.addAttribute("errss3", "昵称不能为空");
            checkUserRol(user, model);
            return "updateUser";
        } else if (user.getUserRealname() == null || user.getUserRealname() == "") {
            model.addAttribute("errss4", "真实姓名不能为空");
            checkUserRol(user, model);
            return "updateUser";
        } else if (user.getUserPhone() == null || user.getUserPhone() == "") {
            model.addAttribute("errss5", "电话不能为空");
            checkUserRol(user, model);
            return "updateUser";
        }
        registService.updateUser(user);
        if (user.getUserRol().equals("0")) {
            for (int i = 0; i < addressId.length; i++) {
                if (addressAddress[i] == null || addressAddress[i] == "") {
                    model.addAttribute("errss6", "地址不能为空");
                    return "updateUser";
                }
            }
            addressService.updateAdressAll(addressId, addressAddress);

            if (hpmename != null) {
                addressService.insertSomAdress(hpmename, user.getUserId());
            }
        }
        return "redirect:index";
    }

    private void checkUserRol(User user, Model model) {
        if (!"1".equals(user.getUserRol())) {
            //获取该用户的所有地址
            List<Address> addressList = addressService.getAddressByUserId(user.getUserId());
            model.addAttribute("addressList", addressList);
        }
    }

    /**
     * 删除地址
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteAdress")
    @ResponseBody
    public ShopResult deleteAdress(Long id) {
        addressService.deleteAdress(id);
        return ShopResult.ok();
    }

    /**
     * 更改此地址为默认地址
     *
     * @param id
     * @return
     */
    @RequestMapping("/updatedefaultAddresss")
    public String updatedefaultAddresss(Long id) {
        addressService.updatedefaultAddresss(id);
        return "redirect:updateUser";
    }
}
