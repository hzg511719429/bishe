package com.guang.bishe.controller;
import com.guang.bishe.domain.Product;
import com.guang.bishe.domain.Productimg;
import com.guang.bishe.service.ProductService;
import com.guang.bishe.service.SellProductsService;
import com.guang.bishe.service.dto.PageResult;
import com.guang.bishe.service.dto.ShopResult;
import com.guang.bishe.service.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class SellProductsController {

    @Autowired
    private SellProductsService sellProductsService;
    @Autowired
    private ProductService productService;

    /**
     * 卖家商品列表展示
     *
     * @param model
     * @param page
     * @param row
     * @return
     */
    @RequestMapping("/adminimenu")
    public String sellProducts(HttpServletRequest request, Model model,
                               @RequestParam(defaultValue = "1") Integer page,
                               @RequestParam(defaultValue = "10") Integer row) {
        PageResult pageResult = sellProductsService.getUserAllProducts(request, page, row);
        model.addAttribute("pageResult", pageResult);
        model.addAttribute("objList", pageResult.getObjects().size());
        return "sell/sellProducts";
    }

    /**
     * 上传图片
     *
     * @param file
     * @param count
     * @param request
     * @return
     */
    @RequestMapping("/uploadImg")
    @ResponseBody
    public ShopResult upload(MultipartFile file, int count, HttpServletRequest request) {
        if (file == null) {
            return ShopResult.build(500, "请选择上传的图片");
        }
        try {
            if (count == 0) {
                request.getSession().setAttribute("uploadImgCount", null);
            } else if (count > 5) {
                return ShopResult.build(500, "上传图片不能超过6张");
            }
            String basePath = request.getSession().getServletContext().getRealPath("/");
            String contentType = file.getContentType();
            //如果是文件保存在/data/files 图片保存在/data/images
            String path = contentType.contains("image") ? "data/images/" + DateUtils.format(new Date(), "YYYYMMdd") : "data/files/" + DateUtils.format(new Date(), "YYYYMMdd");
            String fileName = System.currentTimeMillis() + ".jpg";
            //新的图片
            File newFile = new File(basePath + path);
            if (!newFile.exists()) {
                newFile.mkdirs();
            }
            //把内存图片写入磁盘中
            File imgFile = new File(basePath + path, fileName);
            file.transferTo(imgFile);
            Map<Integer, String> list = (Map<Integer, String>) request.getSession().getAttribute("uploadImgCount");
            if (list == null) {
                list = new HashMap<>();
            }
            list.put(count, path + "/" + fileName);
            request.getSession().setAttribute("uploadImgCount", list);
            return ShopResult.build(200, count + "", path + "/" + fileName);

        } catch (Exception e) {
            e.printStackTrace();
            return ShopResult.build(500, "上传失败");
        }
    }

    /**
     * 删除上传的图片
     *
     * @param request
     * @param index_imgUrl
     * @return
     */
    @RequestMapping("/delImgUrl")
    @ResponseBody
    public ShopResult deleteImg(HttpServletRequest request, Integer index_imgUrl) {
        Map<Integer, String> list = (Map<Integer, String>) request.getSession().getAttribute("uploadImgCount");
        list.remove(index_imgUrl);
        return ShopResult.build(200, "删除成功");
    }

    /**
     * 修改商品状态
     *
     * @param request
     * @param id
     * @param status
     * @param model
     * @return
     */
    @RequestMapping("/updateSellStatus")
    public String updateSellStatus(HttpServletRequest request, Long id, String status, Model model) {
        sellProductsService.updateProductStatus(request, id, status);
        PageResult pageResult = sellProductsService.getUserAllProducts(request, 1, 10);
        model.addAttribute("pageResult", pageResult);
        return "/sell/sellProducts";
    }

    /**
     * 跳转到修改商品页面
     *
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/updateProduct", method = RequestMethod.GET)
    public String toUpdateProductView(Model model, @RequestParam Long id) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        List<Productimg> productimgList = productService.getProductimgList(id);
        model.addAttribute("productImgs", productimgList);

        return "sell/updateSellProduct";
    }

    /**
     * 修改商品
     *
     * @param request
     * @param product
     * @return
     */
    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
    public String updateGoods(HttpServletRequest request, Product product) {
        sellProductsService.updateProduct(request, product);
        return "redirect:adminimenu";
    }

    /**
     * 删除商品修改页面上的图片
     *
     * @param productImgId
     * @return
     */
    @RequestMapping("/updateDeleteImg")
    @ResponseBody
    public ShopResult updateDeleteImg(Long productImgId) {
        productService.updateDeleteImg(productImgId);
        return ShopResult.build(200, "删除成功");
    }

    /**
     * 更改全部所选择的商品的状态
     *
     * @param request
     * @param ids
     * @param status
     * @return
     */
    @RequestMapping(value = "/updatelittleProducts", method = RequestMethod.POST)
    @ResponseBody
    public ShopResult updatelittleProducts(HttpServletRequest request, int[] ids, Integer status) {
        ShopResult shopResult = sellProductsService.updatelittleProducts(request, ids, status);
        return shopResult;
    }

    /**
     * 添加商品
     *
     * @param request
     * @param product
     * @return
     */
    @RequestMapping(value = "/insertProduct", method = RequestMethod.POST)
    @ResponseBody
    public ShopResult insertProduct(HttpServletRequest request, Product product) {
        ShopResult shopResult = sellProductsService.insertProduct(request, product);
        return shopResult;
    }

}
