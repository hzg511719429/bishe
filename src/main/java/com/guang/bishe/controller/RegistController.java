package com.guang.bishe.controller;

import com.guang.bishe.domain.Address;
import com.guang.bishe.domain.User;
import com.guang.bishe.service.AddressService;
import com.guang.bishe.service.LoginService;
import com.guang.bishe.service.RegistService;
import com.guang.bishe.service.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class RegistController {

    @Autowired
    private RegistService registService;
    @Autowired
    private LoginService loginService;
    @Autowired
    private AddressService addressService;


    @RequestMapping(value = "/regist", method = RequestMethod.GET)
    public String registView() {
        return "regist";
    }

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public String regist(Model model, User user, String addressAddress, String passwordAgain) {
        String reg = "([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})";
        //数据校验
        if (user.getUserEmail() == "" || user.getUserEmail() == null) {
            model.addAttribute("msg_email", "邮箱不能为空！");
            model.addAttribute("user_regist", user);
            model.addAttribute("addressr", addressAddress);
            return "regist";
        }
        if (!user.getUserEmail().matches(reg)) {
            model.addAttribute("msg_email", "邮箱格式不正确！");
            model.addAttribute("user_regist", user);
            model.addAttribute("addressr", addressAddress);
            return "regist";
        }
        if (user.getUserPassword() == "" || user.getUserPassword() == null) {
            model.addAttribute("msg_password", "密码不能为空！");
            model.addAttribute("user_regist", user);
            model.addAttribute("addressr", addressAddress);
            return "regist";
        }
        if (user.getUserPassword().length() < 6) {
            model.addAttribute("msg_password", "密码长度不能小于6位！");
            model.addAttribute("user_regist", user);
            model.addAttribute("addressr", addressAddress);
            return "regist";
        }
        if (passwordAgain == "" || passwordAgain == null) {
            model.addAttribute("msg_password2", "确认密码不能为空！");
            model.addAttribute("user_regist", user);
            model.addAttribute("addressr", addressAddress);
            return "regist";
        }
        if (passwordAgain.length() < 6) {
            model.addAttribute("msg_password2", "确认密码长度不能小于6位！");
            model.addAttribute("user_regist", user);
            model.addAttribute("addressr", addressAddress);
            return "regist";
        }
        if (!user.getUserPassword().equals(passwordAgain)) {
            model.addAttribute("msg_password2", "两次密码不一致");
            model.addAttribute("user_regist", user);
            model.addAttribute("addressr", addressAddress);
            return "regist";
        }
        if (user.getUserNickname() == null || user.getUserNickname() == "") {
            model.addAttribute("msg_nickname", "昵称不能为空");
            model.addAttribute("user_regist", user);
            model.addAttribute("addressr", addressAddress);
            return "regist";
        }
        if (user.getUserRealname() == null || user.getUserRealname() == "") {
            model.addAttribute("msg_realname", "真实姓名不能为空");
            model.addAttribute("user_regist", user);
            model.addAttribute("addressr", addressAddress);
            return "regist";
        }
        if (user.getUserPhone() == null || user.getUserPhone() == "") {
            model.addAttribute("msg_phone", "电话不能为空");
            model.addAttribute("user_regist", user);
            model.addAttribute("addressr", addressAddress);
            return "regist";
        }
        if (!"1".equals(user.getUserRol())) {
            if (addressAddress == null || addressAddress == "") {
                model.addAttribute("msg_address", "地址不能为空");
                model.addAttribute("user_regist", user);
                model.addAttribute("addressr", addressAddress);
                return "regist";
            }
        }
        user.setUserPassword(MD5Util.MD5(user.getUserPassword()));
        //检查用户是否已经存在
        User user1 = registService.getUserByEmail(user.getUserEmail());
        if (user1 != null) {
            model.addAttribute("msg_email", "用户名已经存在");
            model.addAttribute("user_regist", user);
            model.addAttribute("addressr", addressAddress);
            return "regist";
        } else {
            //判断注册的是买家还是卖家
            if ("1".equals(user.getUserRol())) {
                //卖家
                registService.insertUser(user);
            } else {
                //买家
                user.setUserRol("0");
                registService.insertUser(user);
                //向数据库插入数据后，在取出以便导入用户地址数据(因改了用户角色，需重新获取user)
                List<User> userList = loginService.getUser(user);
                User user2 = userList.get(0);

                //导入用户地址数据
                Address address = new Address();
                address.setAddressBuyerId(user2.getUserId());
                address.setAddressAddress(addressAddress);
                address.setAddressIsDefault("1");
                addressService.insertAddress(address);

            }
            model.addAttribute("view","login");
            model.addAttribute("message","注册成功！");
            return  "success";
        }
    }
}
