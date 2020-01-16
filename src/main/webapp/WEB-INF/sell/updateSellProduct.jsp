<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/11/11
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <style type="text/css">
        html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, font, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td {
            margin: 0;
            padding: 0;
            border: 0;
            outline: 0;
            font-size: 100%;
            font-size: 12px;
            text-decoration: none;
            margin: 0 auto;
            font-family: Verdana, Geneva, sans-serif;
        }

        a:link, a:visited, a:hover {
            color: #000;
        }

        a:hover {
            text-decoration: underline;
            color: #f40;
        }

        ol, ul {
            list-style: none;
        }

        body {
            font-size: 10px;
            color: #000;
            background: #eee;
        }

        .logo {
            height: 75px;
            width: 1100px;
            margin: auto;
            background: no-repeat left;
        }

        .nav {
            position: absolute;
            float: left;
            width: 0;
            height: 0;
        }

        .menu {
            position: relative;
            top: 44px;
            left: 280px;
            width: 535px;
            height: 31px;
            background: url(../../static/img/navbg.gif) repeat-x;
            padding-left: 7px;
        }

        .menu li {
            float: left;
            width: 107px;
            height: 27px;
            margin-top: 4px;
            background: url(../../static/img/navline.gif) no-repeat right 3px;
        }

        .menu li span {
            display: block;
            width: 98px;
            height: 27px;
            margin-left: 4px;
            text-align: center;
            line-height: 27px;
        }

        .menu li span a, .menu .back a {
            color: #fff;
            text-decoration: none;
            display: block;
        }

        .menu li span a:hover, .menu .back a:hover {
            text-decoration: underline;
        }

        .menu li.current span {
            background: url(../../static/img/tagbg.gif) no-repeat;
        }

        .menu li.current a {
            font-weight: bold;
            color: #00712E;
        }

        .header {
            float: right;
            height: 75px;
            width: 180px;
        }

        .header ul li {
            float: left;
            padding-right: 15px;
        }

        .header ul li a {
            display: block;
            float: left;
            height: 36px;
            line-height: 36px;
        }

        .content {
            background: #fdfdfd;
            height: 552px;
            width: 990px;
            border: 1px #999 solid;
        }

        .menu-content {
            height: 500px;
        }

        .menu-content .tr1 {
            height: 38px;
            background: #eee;
        }

        .menu-content .tr2 {
            height: 38px;
            background: #ccc;
        }

        .menu-content td {
            width: 245px;
            text-align: center;
        }

        .menu-content a {
            display: inline-block;
            padding-left: 5px;
        }

        .menu-content button {
            text-align: center;
            line-height: 18px;
        }

        .fafoot {
            background: #fff;
            width: 100%;
            height: 20px;
            border-bottom: 2px solid #FF4400;
        }

        .foot-tab {
            padding-left: 290px;
        }

        .foot-tab ul li {
            float: left;
            padding: 5px;
        }

        .foot-tab ul li, .foot-tab ul span {
            float: left;
            padding: 5px;
        }

        .foot-tab-hover, .foot-tab-hover1, .foot-tab-hover2 {
            display: block;
            float: left;
            cursor: pointer;
            height: 23px;
            width: 9px;
            padding: 4px 10px;
            border: 1px #fff solid;
            line-height: 23px;
            text-align: center;
        }

        .foot-tab-active {
            display: block;
            line-height: 23px;
            text-align: center;
            float: left;
            cursor: pointer;
            height: 23px;
            width: 9px;
            padding: 4px 10px;
            background-color: #FFEDE1;
            border: 1px #F60 solid;
            font-weight: bold;
        }

        .foot-tab ul li a:hover, .foot-tab ul span a:hover {
            background: #f7f7f7;
            border: 1PX #C0C0C0 solid;
            text-decoration: none;
        }

        .footer {
            height: 100px;
            width: 550px;
            margin: auto;
            text-align: center;
            padding-top: 5px;
            line-height: 20px;
        }

        .tips-button {
            background: #737373;
            height: 28px;
            line-height: 28px;
            margin: auto;
        }

        .tips-button a {
            display: inline-block;
            margin-left: 45px;
            padding: 0;
            cursor: pointer;
            text-align: center;
            width: 104px;
            background: url(../../static/img/biaotianniou1.png) no-repeat;
            _background: none;
            _filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src="static/img/biaotianniou1.png");
        }

        .tips-button a:hover {
            color: #000;
            font-weight: bolder;
            text-decoration: none;
            background: url(../../static/img/biaotianniou2.png) no-repeat;
            _background: none;
            _filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src="static/img/biaotianniou2.png");
        }

        .tips-button a:active {
            color: #fff;
            background: url(../../static/img/biaotianniou3.png) no-repeat;
            text-decoration: none;
            _background: none;
            _filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src="img/biaotianniou3.png");
        }

        .tr1 a {
            display: inline-block;
            width: 230px;
        }

        .function {
            position: absolute;
            display: none;
            top: 76px;
            width: 990px;
            height: 552px;
            background: #DBEAF9;
        }

        .function2 {
            position: absolute;
            top: 76px;
            width: 990px;
            height: 552px;
            background: #DBEAF9;
        }

        .function td, .function2 td {
            height: 60px;
            text-align: center;
            background: #0C9;
            border-width: 2px;
            border-style: solid;
            border-color: #DFDFDF #ADADAD #ADADAD #DFDFDF;
        }

        .function-head {
            height: 18px;
            line-height: 18px;
            width: 990px;
            background: #666;
            color: #F40;
            font-weight: bolder;
            text-align: center;
        }

        .function-content {
            width: 746px;
        }

        .function-content-img {
            height: 100px;
            margin: 0px;
            padding-left: 4px;
        }

        .function-content-img a {
            position: relative;
            display: inline-block;
            float: left;
            border: 1px #999 dashed;
            background: #fff;
            width: 99px;
            height: 98px;
            margin-right: 5px;
        }

        .function-content-img a p {
            position: absolute;
            display: inline-block;
            left: 85px;
            width: 14px;
            height: 14px;
            background: url(../../static/img/PUSS.jpg) no-repeat;
        }

        .function-content-list {
            float: left;
            height: 150px;
            line-height: 150px;
            text-align: center;
            font-size: 19px;
        }

        .textarea {
            height: 126px;
            width: 434px;
            margin-left: 55px;
            margin-top: 10px;
        }

        .function-foot {
            position: relative;
            height: 50px;
            width: 990px;
            background: #666;
            text-align: center;
        }

        .function-btn {
            background-color: #FFF;
            border: 1px solid #CDCDCD;
            height: 24px;
            width: 70px;
        }

        .function-file {
            position: absolute;
            top: 0;
            right: 80px;
            height: 24px;
            filter: alpha(opacity:0);
            opacity: 0;
            width: 260px
        }

        .function-foot button {
            text-align: center;
            line-height: 18px;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript" src="static/js/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#five").click(function () {
                if ($(this).attr("checked")) {
                    $(".col").attr("checked", "checked");
                } else {
                    $(".col").removeAttr("checked", "checked");
                }
            })
            $("#container").click(function () {
                $(".function").fadeTo(1000, 1);
            });
            $(".2").click(function () {
                $(".function2").fadeTo(1000, 1);
            });
            $("p.3").click(function () {
                $(this).parent().remove();
            });
            $(".12").click(function () {
                $(".function").add(".function2").fadeOut();
            });
        });


        $(document).ready(function () {
            $(".foot-tab ul li a").each(function () {
                $(".foot-tab ul li a").click(function () {
                    $(this).addClass("foot-tab-active").css("color", " #F60")
                    $(this).removeClass("foot-tab-hover")
                    $(this).parent("li").siblings().children().addClass("foot-tab-hover").css("color", "#000")
                    $(this).parent("li").siblings().children().removeClass("foot-tab-active")
                });
                $(".foot-tab-hover1").click(function () {
                    $(this).parent().next().children().addClass("foot-tab-active").css("color", " #F60")
                    $(this).parent().next().children().removeClass("foot-tab-hover")
                    $(this).parent().next().siblings().children().addClass("foot-tab-hover").css("color", "#000")
                    $(this).parent().next().siblings().children().removeClass("foot-tab-active")
                });
                $(".foot-tab-hover2").click(function () {
                    $(this).parent().prev().children().addClass("foot-tab-active").css("color", " #F60")
                    $(this).parent().prev().children().removeClass("foot-tab-hover")
                    $(this).parent().prev().siblings().children().addClass("foot-tab-hover").css("color", "#000")
                    $(this).parent().prev().siblings().children().removeClass("foot-tab-active")
                });
            });
        });
    </script>
    <title>商品管理</title>
</head>
<body>

<%@ include file="../comment/head.jsp" %>

<div class="function2">
    <form action="updateProduct" method="POST" onsubmit="return add_product(this)">
        <div class="function-head">正在修改菜品</div>
        <input name="productId" value="${product.productId}" type="text" style="display: none"/>
        <input name="productNo" value="${product.productNo}" type="text" style="display: none"/>
        <input name="productSellerId" value="${product.productSellerId}" type="text" style="display: none"/>
        <input name="productHassSelled" value="${product.productHassSelled}" type="text" style="display: none"/>
        <table width="750">
            <tr>
                <td width="60">菜名</td>
                <td><input name="productName" type="text" value="${product.productName}"/></td>
                <td width="60">单价</td>
                <td><input name="productPrice" type="text" value="${product.productPrice}"/></td>
            </tr>
            <tr>
                <td width="60">库存</td>
                <td><input name="productStock" type="text" value="${product.productStock}"/></td>
                <td width="60">是否上架</td>
                <td>
                    <input name="productIsSell" type="radio"
                           <c:if test="${product.productIsSell == 1}">checked</c:if> value="1"/>是&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="productIsSell" type="radio"
                           <c:if test="${product.productIsSell == 0}">checked</c:if> value="0"/>否
                </td>
            </tr>
            <tr>
                <td width="60">选择图片</td>
                <td width="300">
                    <div class="function-box">
                        <form id="img_upload" action="" method="post" enctype="multipart/form-data">
                            <input type="file" name="file" id="fileField" size="28"/>
                            <input type="button" name="submit" onclick="uploadImg()" class="function-btn" value="上传"/>
                        </form>
                    </div>
                </td>
                <td width="60">口味</td>
                <td>
                    <input name="productTaste" type="radio" value="0"
                           <c:if test="${product.productTaste == 0}">checked</c:if> />不辣&nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="productTaste" type="radio" value="1"
                           <c:if test="${product.productTaste == 1}">checked</c:if>  />辣
                </td>
            </tr>
        </table>
        <div class="function-content">
            <div id="function-content-img" class="function-content-img">
                <c:forEach items="${productImgs}" var="img">
                    <a id="upload_${img.id}">
                        <p class="3"></p>
                        <img src="${img.imgurl}" style="width: 100px;height: 100px;z-index: 1;position:absolute;"
                             alt="图片"/>
                        <img style="position:absolute;left:86px;z-index:999;float: right" src="static/img/PUSS.jpg"
                             onclick="delImg(${img.id})"/>
                    </a>
                </c:forEach>
            </div>
            <div style="height:150px; padding-left:70px;">
                <div class="function-content-list">简介：</div>
                <textarea name="productDescription" cols="" rows="" class="textarea">
                    ${product.productDescription}
                </textarea>
            </div>
        </div>
        <div class=" function-foot">
            <input value="确认修改" style="position:absolute;  top:10px; width:104px; left:300px;" type="submit"/>
            <input type="button" value="取消操作" onclick="returnProductList()"
                   style="position:absolute;  top:10px; width:104px; left:650px;"/>
        </div>
    </form>
</div>

<%@ include file="../comment/foot.jsp" %>

</body>

<script>

    function returnProductList() {
        window.location.href = "adminimenu";
    }

    //定义一个全局变量 用来保存图片上传的次数,一次最多只能上传6张
    var imgCount = 0;

    function uploadImg() {
        var formData = new FormData();
        //获取file控件中的内容
        var files = $("#fileField").get(0).files[0];
        formData.append("file", files);
        formData.append("count", imgCount);
        $.ajax({
            url: "${pageContext.request.contextPath}/uploadImg",
            type: "POST",
            data: formData,
            async: false,
            cache: false,
            contentType: false,
            processData: false,
            success: function (data) {
                if (data.status == 200) {
                    imgCount++;
                    //成功之后照片显示 并且把路径回显到隐藏的input中
                    $("#add_goods_img_id").attr("value", data.data);
                    //清空数据，方便再次上传
                    $("#fileField").attr("value", "");
                    $("#function-content-img").append("<a id=\"upload_" + data.msg + "\"><p class=\"3\"></p><img src=\"" + data.data + "\" style=\"width: 100px;height: 100px;z-index: 1;position:absolute;\" alt=\"图片\"/><img style=\"position:absolute;left:86px;z-index:999;float: right\" src=\"static/img/PUSS.jpg\" onclick=\"delImg(" + data.msg + ")\"/></a>");
                } else {
                    alert(date.msg);
                }
            },
            error: function (retuData) {
                alert(retuData);
            }
        });
    }

    function delImg(productImgId) {
        $.ajax({
            url: "${pageContext.request.contextPath}/updateDeleteImg",
            type: "POST",
            data: {productImgId: productImgId},
            traditional: true,
            success: function (data) {
                if (data.status == 200) {
                    alert(data.msg);
                    $("#upload_" + productImgId).remove();
                } else {
                    alert(data.msg);
                }
            }
        });
    }

    function add_product(param) {
        //添加商品发出ajax请求
        var reg_number = /^[1-9]\d*$/;
        var reg_price = /(^[1-9]([0-9]+)?(\.[0-9]{1,2})?$)|(^(0){1}$)|(^[0-9]\.[0-9]([0-9])?$)/;
        if (param.productName.value == "") {
            alert("名字不能为空");
            return false
        } else if (!reg_price.test(param.productPrice.value) || param.productName.value == "") {
            alert("请填写正确的价格")
            return false
        } else if (param.productStock.value == "" || !reg_number.test(param.productStock.value)) {
            alert("请输入正确库存");
            return false
        } else {

            return true;
        }

    }

</script>

</html>
