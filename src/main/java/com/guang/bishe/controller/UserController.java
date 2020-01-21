package com.guang.bishe.controller;

import com.guang.bishe.domain.Address;
import com.guang.bishe.domain.Orders;
import com.guang.bishe.domain.User;
import com.guang.bishe.service.AddressService;
import com.guang.bishe.service.OrderService;
import com.guang.bishe.service.RegistService;
import com.guang.bishe.service.UserService;
import com.guang.bishe.service.dto.ShopResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private AddressService addressService;
    @Autowired
    private RegistService registService;
    @Autowired
    private UserService userService;

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
        model.addAttribute("view","index");
        model.addAttribute("message","修改个人信息成功！");
        return  "success";
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
    @RequestMapping("/deleteAddress")
    @ResponseBody
    public String deleteAddress(Long id) {
        addressService.deleteAddress(id);
        return  "success";
    }

    /**
     * 更改此地址为默认地址
     *
     * @param id
     * @return
     */
    @RequestMapping("/updateDefaultAddress")
    public String updateDefaultAddress(Long id) {
        addressService.updateDefaultAddress(id);
        return "redirect:updateUser";
    }

    /**
     * 订单收货
     *
     * @return
     */
    @GetMapping("/userReceiveOrder")
    public String userReceiveOrder(Long id, Integer action, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            return "login";
        }
        if (action == 2) {
            userService.updateOrder(id, "3");
        }
        return "redirect:menu";
    }

    /**
     * 评价订单view
     */
    @GetMapping("messageOrder")
    public String messageOrder(Long id, Model model, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            return "login";
        }
        model.addAttribute("id", id);
        return "message";
    }

    /**
     * 评价订单
     */
    @PostMapping("messageOrder")
    public String messageOrder(Orders orders, Model model, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            return "login";
        }
        userService.updateOrder(orders);

        model.addAttribute("view", "menu");
        model.addAttribute("message", "评价成功！");
        return "success";

    }

    /**
     * 查看评价订单
     */
    @RequestMapping(value = "selectMessageOrder", method = RequestMethod.GET)
    public String selectMessageOrder(Long orderId, Model model, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            return "login";
        }
        Orders orders = userService.selectOrderByOrderId(orderId);
        model.addAttribute("orders", orders);
        model.addAttribute("action", 2);
        model.addAttribute("role", user.getUserRol());
        return "message";

    }
}
