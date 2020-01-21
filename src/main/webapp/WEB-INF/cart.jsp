<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/11/13
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

        em {
            font-variant: inherit;
            font-style: normal;
        }

        a:link, a:visited, a:hover {
            color: #000;
        }

        a:hover {
            text-decoration: none;
            color: #000;
        }

        ol, ul, li {
            list-style: none;
            margin: 0;
            padding: 0;
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
            background: mediumseagreen;

        }

        .menu li {
            float: left;
            width: 107px;
            height: 27px;
            margin-top: 4px;
            background: url(../static/img/navline.gif) no-repeat right 3px;
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
            text-decoration: none;
        }

        .menu li.current span {
            background: url(../static/img/tagbg.gif) no-repeat;
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
            width: 100%;
        }

        .fa-footer {
            background: #fff;
            width: 100%;
            height: 20px;
            border-bottom: 2px solid #FF4400;
        }

        .footer {
            height: 100px;
            width: 550px;
            margin: auto;
            text-align: center;
            padding-top: 5px;
            line-height: 20px;
        }

        #breadcrumb {
            padding: 50px 0 50px 0;
        }

        #breadcrumb ul {
            margin: auto;
            width: 840px;
            height: 34px;
        }

        #breadcrumb li {
            float: left;
            position: relative;
            width: 210px;
            height: 34px;
        }

        .li-msg {
            position: absolute;
            top: -26px;
            left: 70px;
        }

        .li-msg2 {
            position: absolute;
            top: -26px;
            left: 53px;
        }

        .a1-0 {
            background: url(../static/img/breadcrumb.png) 0 -34px no-repeat;
        }

        .a2-0 {
            background: url(../static/img/breadcrumb.png) 0 -102px no-repeat;
        }

        .a3-0 {
            background: url(../static/img/breadcrumb.png) 0 -136px no-repeat;
        }

        .a1-1 {
            background: url(../static/img/breadcrumb.png) 0 -204px no-repeat;
        }

        .a2-1 {
            background: url(../static/img/breadcrumb.png) 0 0 no-repeat;
        }

        .a2-2 {
            background: url(../static/img/breadcrumb.png) 0 -170px no-repeat;
        }

        .a3-1 {
            background: url(../static/img/breadcrumb.png) 0 -68px no-repeat;
        }

        .main {
            width: 1013px;
        }

        .main ul {
            margin-left: 150px;
            padding: 0 0 10px 0;
            overflow: auto;
            zoom: 1;
        }

        .main ul textarea {
            resize: none;
        }

        .main ul li {
            float: left;
            cursor: default;
            margin: 10px 0 0 13px;
            width: 207px;
            height: 84px;
            padding: 11px 15px;
            background: url(../static/img/T1VPiBXvpeXXbjLKQ7-237-106.png) no-repeat;
        }

        .main-foot {
            padding-left: 335px;
        }

        .main-foot a {
            margin-left: 26px;
        }

        .main-foot span {
            display: inline-block;
            border: 1px solid #FFF;
            padding: 4px 10px;
        }

        .main-foot span:hover {
            display: inline-block;
            background: #f7f7f7;
            border: 1px #c0c0c0 solid;
            color: #f40;
            padding: 4px 10px;
        }

        .main-add {
            display: inline-block;
            width: 207px;
            height: 84px;
            line-height: 84px;
            text-align: center;
            cursor: pointer;
        }

        .msg {
            background: #FBFCFF;
        }

        .msg table {
            text-align: center;
            border-bottom: 2px solid #B2D1FF;
        }

        .msg-tr td {
            border-bottom: 2px solid #B2D1FF;
        }

        #all {
            margin: 0;
            padding: 0;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript" src="static/js/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $(".l1").click(function () {
            });
        });
        $(document).ready(function () {
            $("#tabul li").each(function () {
                $("#tabul li").click(function () {
                    $(this).css({"background": "url(img/T1fuaCXxFdXXbjLKQ7-237-106.png)"});
                    $(this).siblings().css({"background": "url(img/T1VPiBXvpeXXbjLKQ7-237-106.png)"});
                });
            });
        });
        $(document).ready(function () {
            $(".main-add").click(function () {
                $("#menu1content").fadeTo("slow", 0.9)
            });
            $(".btn1").click(function () {
                $("#menu1content").fadeOut("slow")
            });
        });
        $(document).ready(function () {
            $("#all").click(function () {
                if ($(this).attr("checked")) {
                    $(":enabled:checkbox").attr("checked", "checked");
                } else {
                    $(":enabled:checkbox").removeAttr("checked", "");
                }
            })
        });
    </script>
    <title>下单</title>
</head>
<body>

<%@ include file="comment/head.jsp" %>

<div class="content" style="border-top:none;">
    <form id="car_form_sumbit" action="addOrder" method="post" onsubmit="return car_form_sumbit(this)">
        <div class="main">
            <h2 style="border-bottom:1px  #999 dashed; text-align:center;">我的餐车</h2>
            <div class="msg">
                <table>
                    <colgroup>
                        <col width="80"/>
                        <col width="255"/>
                        <col width="135"/>
                        <col width="135"/>
                        <col width="135"/>
                        <col width="80"/>
                    </colgroup>
                    <tr class=" msg-tr">
                        <td style=" text-align:left; padding-left:35px;"><input id="checkAll" onclick="getCheck(1)"
                                                                                type="checkbox" value="" checked/><label
                                style=" vertical-align:bottom;" for="all">全选</label></td>
                        <td>菜名</td>
                        <td>单价</td>
                        <td>数量</td>
                        <td>小计</td>
                        <td>操作</td>
                    </tr>
                    <input id="cartList" type="text" value="${listNum}" style="display: none"/>
                    <c:forEach items="${cartList}" var="list">
                        <tr height="50">
                            <td><input name="cartId" onclick="getCheck(0)" value="${list.carProductId}" type="checkbox"
                                       checked/></td>
                            <td>${list.productName}</td>
                            <td>${list.productPrice}</td>
                            <td>${list.carProductNum}</td>
                            <td>${list.carProductPrice}</td>
                            <td><a href="deleteCartOne?id=${list.carId}">删除</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <div style="overflow:auto; zoom:1;">
                <div class="main-foot">
                    <a>已选商品:<em id="productNum">${productNum}</em>件</a>
                    <a>合计:<em id="productMoney">${productMoney}</em>元</a>
                    <input type="submit" style="margin:0 20px 0 200px;" value="提交我的订单"/>
                </div>
            </div>
        </div>
    </form>
</div>

</body>

<script>
    function car_form_sumbit(param) {
        if ($("#productMoney").text() == 0) {
            alert("请选择商品");
            return false;
        } else {
            return true;
        }
    }

    function getCheck(num) {
        if (num == 0) {
            //获取已选择的商品,存到数组中
            var array = new Array();
            var i = 0;
            $("input[name='cartId']:checked").each(function () {
                array[i] = $(this).val();
                i++;
            });
            if (i != $("#cartList").val()) {
                $("#checkAll").attr("checked", false);
            } else {
                $("#checkAll").attr("checked", true);
            }
            $.ajax({
                url: "${pageContext.request.contextPath}/updatePrice",
                type: "POST",
                data: {cartId: array},
                traditional: true,
                success: function (data) {
                    $("#productNum").text(data.number);
                    $("#productMoney").text(data.price);
                }
            });
        } else {
            if ($('#checkAll').is(':checked')) {
                //获取已选择的商品,存到数组中
                var array = new Array();
                var i = 0;
                $("input[name='cartId']").each(function () {
                    $(this).attr("checked", true);
                    array[i] = $(this).val();
                    i++;
                });
                $.ajax({
                    url: "${pageContext.request.contextPath}/updatePrice",
                    type: "POST",
                    data: {cartId: array},
                    traditional: true,
                    success: function (data) {
                        $("#productNum").text(data.number);
                        $("#productMoney").text(data.price);
                    }
                });
            } else {
                $("input[name='cartId']").each(function () {
                    $(this).attr("checked", false);
                });
                $.ajax({
                    url: "${pageContext.request.contextPath}/updatePrice",
                    type: "POST",
                    data: {cartId: 0},
                    traditional: true,
                    success: function (data) {
                        $("#productNum").text(data.number);
                        $("#productMoney").text(data.price);
                    }
                });
            }
        }
    }
</script>

</html>
