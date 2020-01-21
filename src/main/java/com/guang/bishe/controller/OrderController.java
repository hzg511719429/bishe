package com.guang.bishe.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.guang.bishe.domain.Address;
import com.guang.bishe.domain.Orders;
import com.guang.bishe.domain.User;
import com.guang.bishe.service.AddressService;
import com.guang.bishe.service.CartService;
import com.guang.bishe.service.OrderService;
import com.guang.bishe.service.dto.CartView;
import com.guang.bishe.service.dto.OrderAndUser;
import com.guang.bishe.service.dto.PageResult;
import com.guang.bishe.service.dto.ShopResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import static com.guang.bishe.config.AlipayServiceEnvConstants.*;


@Controller
public class OrderController {

    @Autowired
    private CartService cartService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private OrderService orderService;

    /**
     * 跳转到订单
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/addOrder")
    public String addOrder(HttpServletRequest request, Model model) {
        //首先判断是否登陆 未登陆 返回未登录信息
        if (request.getSession().getAttribute("user") == null) {
            return "login";
        } else {
            int productNum = 0;
            double productPriceCount = 0.00;
            List<CartView> list = cartService.getCartProductsByUser(request);
            for (CartView cartView : list) {
                productNum += cartView.getCarProductNum();
                productPriceCount += cartView.getCarProductPrice();
            }
            //这里要调用 user接口 查询用户所有的收货地址
            User user = (User) request.getSession().getAttribute("user");
            List<Address> addressList = addressService.getAddressByUserId(user.getUserId());
            model.addAttribute("car_list", list);
            model.addAttribute("user_s", user);
            model.addAttribute("userAddress", addressList);
            model.addAttribute("priceCount", productPriceCount);
            return "addOrder";
        }
    }

    /**
     * 在订单页面添加用户地址
     *
     * @param request
     * @param address
     * @return
     */
    @RequestMapping("/user/addAddress")
    @ResponseBody
    public ShopResult insertAddress(HttpServletRequest request, String address) {
        ShopResult result = addressService.insertAddress(request, address);
        return result;
    }

    /**
     * 改变默认的用户地址
     *
     * @param request
     * @param num
     */
    @RequestMapping("/user/selectAddress")
    @ResponseBody
    public ShopResult selectAddress(HttpServletRequest request, Integer num) {
        addressService.updateAddress(request, num);
        return ShopResult.ok();
    }

    /**
     * 确认订单
     *
     * @param request
     * @param model
     * @param sc_date
     * @param paytype
     * @param message
     * @param sumprice
     * @return
     */
    @RequestMapping("/confirmOrder")
    public String confirmOrder(HttpServletRequest request, Model model, String sc_date,
                               Integer paytype, @RequestParam(defaultValue = "") String message,
                               double sumprice) {
        List<Orders> list = orderService.insertConfirmOrder(request, sc_date, paytype, message, sumprice);
        model.addAttribute("order_list", list);
        model.addAttribute("order_list_one", list.get(0));
        model.addAttribute("paytype", paytype);

        return "gopay";
    }

    /**
     * 用户订单列表
     *
     * @param request
     * @param model
     * @param page
     * @param row
     * @return
     */
    @RequestMapping(value = "menu", method = RequestMethod.GET)
    public String orderList(HttpServletRequest request, Model model,
                            @RequestParam(defaultValue = "1") Integer page,
                            @RequestParam(defaultValue = "10") Integer row) {
        User user = (User) request.getSession().getAttribute("user");
        PageResult pageResult = orderService.selectOrderListByUserId(page, row, user.getUserId());
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("orderSize", pageResult.getObjects().size());
        return "orderList";
    }

    /**
     * 去支付
     *
     * @param request
     * @return
     */
    @RequestMapping("/gopay")
    public String confirmOrder(HttpServletRequest request, HttpServletResponse response, Long[] ordersn, int all) throws IOException {
        //传入一个订单  然后用这个订单的 生成时间去 查找所有的  查出来的list集合 当做一次付款
        String ww = "http://" + request.getServerName() + ":" + request.getServerPort() + "/" + request.getContextPath();
        double money = 0.00;
        String ordersn_string = "";
        for (Long l : ordersn) {
            money += orderService.selectOrderByuser(l);
            ordersn_string += l + ",";
        }
        ordersn_string = ordersn_string.substring(0, ordersn_string.length() - 1);
        //判断有没有登录
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do", APP_ID, PRIVATE_KEY, "json", "utf-8", ALIPAY_PUBLIC_KEY, "RSA2");
        //创建API对应的request
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        if (all == 1) {
            alipayRequest.setReturnUrl(ww + "/payok?orderSn=" + ordersn_string + "&all=1");//成功后回调
            alipayRequest.setNotifyUrl(ww + "/payok?orderSn=" + ordersn_string + "&all=1");//在公共参数中设置回跳和通知地址
        } else if (all == 2) {
            alipayRequest.setReturnUrl(ww + "/payok?orderSn=" + ordersn_string + "&all=2");//成功后回调
            alipayRequest.setNotifyUrl(ww + "/payok?orderSn=" + ordersn_string + "&all=2");//在公共参数中设置回跳和通知地址
        }
        alipayRequest.setBizContent("{\"out_trade_no\":\"" + ordersn[0] + "\","
                + "\"total_amount\":\"" + money + "\","
                + "\"subject\":\"subject\","
                + "\"body\":\"body\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");//填充业务参数
        String form = "";
        try {
            //调用SDK生成表单
            form = alipayClient.pageExecute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        response.setContentType("text/html;charset=" + "utf-8");
        //直接将完整的表单html输出到页面
        response.getWriter().write(form);
        response.getWriter().flush();
        response.getWriter().close();
        return "gopay";
    }

    @RequestMapping(value = "/payok")
    public String payok(String orderSn, int all, HttpServletRequest request) {
        //支付成功之后 增加支付记录 订单表状态改变
        String[] ordersn_string = orderSn.split(",");
        Long[] longs = new Long[100];
        for (int i = 0; i < ordersn_string.length; i++) {
            longs[i] = Long.parseLong(ordersn_string[i]);
        }
        orderService.updateOrderStatus(all, request, longs);
        //首先先获取到相关数据
        return "payok";
    }

    @GetMapping(value = "/deleteOrder")
    public String deleteOder(Long id) {
        orderService.deleteOrderById(id);
        return "redirect:menu";
    }

    @GetMapping(value = "/menuDetails")
    public String menuDetails(Long id, HttpServletRequest request, Model model) {
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            return "login";
        }
        OrderAndUser orderAndUser = orderService.selectItemByOrderId(id);
        model.addAttribute("orderAndUser", orderAndUser);
        return "orderDetails";
    }
}
