package com.guang.bishe.controller;

import com.guang.bishe.service.PageService;
import com.guang.bishe.service.dto.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 首页controller
 *
 * @author guang
 * @date 2018/11/5
 */
@Controller
public class PageController {

    @Autowired
    private PageService pageService;

    /**
     * 主页
     *
     * @param page   当前页数，默认是1
     * @param row    一页有几个数据，默认10个
     * @param status 商品的状态：0默认、1最新、2销量，默认是0
     * @param min    输入的最低价格，默认为0
     * @param max    输入的最高价格，默认为100000
     * @param word   输入要查询的关键字，默认为空
     * @return
     */
    @RequestMapping("/")
    public String index(@RequestParam(defaultValue = "1") Integer page,
                        @RequestParam(defaultValue = "10") Integer row,
                        @RequestParam(defaultValue = "0") Integer status,
                        @RequestParam(defaultValue = "0.00") double min,
                        @RequestParam(defaultValue = "100000.00") double max,
                        @RequestParam(defaultValue = "") String word, Model model) {
        //下面是查询商品列表
        //返回PageResult，其中object属性是 list集合
        getIndex(page, row, status, min, max, word, model);
        return "/index";
    }

    /**
     * 转到首页
     *
     * @return
     */
    @RequestMapping("/index")
    public String toIndex(@RequestParam(defaultValue = "1") Integer page,
                          @RequestParam(defaultValue = "10") Integer row,
                          @RequestParam(defaultValue = "0") Integer status,
                          @RequestParam(defaultValue = "0.00") double min,
                          @RequestParam(defaultValue = "100000.00") double max,
                          @RequestParam(defaultValue = "") String word, Model model) {
        //下面是查询商品列表
        //返回PageResult，其中object属性是 list集合
        getIndex(page, row, status, min, max, word, model);
        return "/index";
    }

    //转到主页的代码
    private void getIndex(Integer page, Integer row, Integer status, double min,
                          double max, String word, Model model) {
        PageResult pageResult = pageService.getProductList(page, row, status, min, max, word);
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("status", status);
        model.addAttribute("max", max);
        model.addAttribute("min", min);
    }
}
