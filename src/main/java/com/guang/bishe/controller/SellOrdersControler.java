package com.guang.bishe.controller;

import com.guang.bishe.domain.User;
import com.guang.bishe.service.SellOrdersService;
import com.guang.bishe.service.dto.OrderAndUser;
import com.guang.bishe.service.dto.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SellOrdersControler {

    @Autowired
    private SellOrdersService sellOrdersService;

    /**
     * 首页商家点击“我的订单”
     *
     * @param request
     * @param model
     * @param page
     * @param row
     * @return
     */
    @RequestMapping("/sellOrderList")
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
    @RequestMapping("/sellOrderListAction")
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
     * @param request
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/sellOrderDetails")
    public String sellOrderDetailsView(HttpServletRequest request, Model model, Long id) {
        OrderAndUser orderAndUser = sellOrdersService.selectItemByOrderId(id);
        model.addAttribute("orderAndUser", orderAndUser);
        return "sell/sellOrderDetails";

    }
}
