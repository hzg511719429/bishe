package com.guang.bishe.controller;

import com.guang.bishe.domain.Orders;
import com.guang.bishe.domain.User;
import com.guang.bishe.service.SellOrdersService;
import com.guang.bishe.service.UserService;
import com.guang.bishe.service.dto.OrderAndUser;
import com.guang.bishe.service.dto.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SellOrdersController {

    @Autowired
    private SellOrdersService sellOrdersService;
    @Autowired
    private UserService userService;

    /**
     * 首页商家点击“我的订单”
     *
     * @param request
     * @param model
     * @param page
     * @param row
     * @return
     */
    @GetMapping("/sellOrderList")
    public String toSellOrderListView(HttpServletRequest request, Model model,
                                      @RequestParam(defaultValue = "1") Integer page,
                                      @RequestParam(defaultValue = "10") Integer row) {
        //判断用户是否登录
        User sellUser = (User) request.getSession().getAttribute("user");
        PageResult pageResult = sellOrdersService.getOrderListByUserId(page, row, sellUser.getUserId());
        model.addAttribute("pageResult", pageResult);
        return "sell/sellOrderList";
    }

    /**
     * 根据条件查询后显示
     *
     * @param request
     * @param model
     * @param action
     * @param page
     * @param row
     * @return
     */
    @GetMapping("/sellOrderListAction")
    public String sellOrderListViewAction(HttpServletRequest request, Model model, String action,
                                          @RequestParam(defaultValue = "1") Integer page,
                                          @RequestParam(defaultValue = "10") Integer row) {
        //判断用户是否登录
        User sellUser = (User) request.getSession().getAttribute("user");
        PageResult pageResult = sellOrdersService.selectOrderListAction(page, row, sellUser.getUserId(), action);
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("raction", action);
        return "sell/sellOrderList";
    }


    /**
     * 订单详情
     *
     * @param model
     * @param id
     * @return
     */
    @GetMapping("/sellOrderDetails")
    public String sellOrderDetailsView(Model model, Long id) {
        OrderAndUser orderAndUser = sellOrdersService.selectItemByOrderId(id);
        model.addAttribute("orderAndUser", orderAndUser);
        return "sell/sellOrderDetails";
    }

    /**
     * 商家退单订单backOrder?orderId=${order.orderId}
     */
    @GetMapping(value = "/backOrder")
    public String sellOrderDetailsView(long orderId) {
        userService.updateOrder(orderId, "8");
        return "redirect:sellOrderList";
    }

    /**
     * 商家发货
     */
    @GetMapping(value = "/sendOrder")
    public String sendOrderGoods(long orderId) {
        userService.updateOrder(orderId, "2");
        return "redirect:sellOrderList";
    }

    /**
     * m买家收货
     */
    @GetMapping(value = "/receiveOrder")
    public String receiveOrder(long orderId) {
        userService.updateOrder(orderId, "3");
        return "redirect:sellOrderList";
    }

    /**
     * m买家未收货
     */
    @GetMapping(value = "/notReceiveOrder")
    public String notReceiveOrder(long orderId) {
        userService.updateOrder(orderId, "11");
        return "redirect:sellOrderList";
    }

    /**
     * 商家发货    货到付款
     */
    @GetMapping(value = "/goodsSendOrder")
    public String goodsSendOrder(long orderId) {
        userService.updateOrder(orderId, "5");
        return "redirect:sellOrderList";
    }

    /**
     * m买家收货  货到付款
     */
    @GetMapping(value = "/goodsReceiveOrder")
    public String goodsReceiveOrder(long orderId) {
        userService.updateOrder(orderId, "6");
        return "redirect:sellOrderList";
    }

    /**
     * 查看评价订单
     */
    @GetMapping(value = "/sellSelectMessageOrder")
    public String sellSelectMessageOrder(long orderId, Model model, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            return "login";
        }

        Orders orders = userService.selectOrderByOrderId(orderId);
        model.addAttribute("orders", orders);
        model.addAttribute("action", 2);
        return "sell/sellMessage";
    }
    /**
     * 退款
     */
    @GetMapping(value = "/backMoneyOrder")
    public String backMoneyOrder(long orderId, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            return "login";
        }
        userService.updateOrder(orderId, "9");
        return "redirect:sellOrderList";
    }

    /**
     * 退款
     */
    @GetMapping(value = "/backMoney")
    public String backMoney(long orderId, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            return "login";
        }
        userService.updateOrder(orderId, "10");
        return "redirect:sellOrderList";
    }
}
