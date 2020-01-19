<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/11/15
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
            background: url(../static/img/navbg.gif) repeat-x;
            padding-left: 7px;
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
            text-decoration: underline;
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
            background: url(../static/img/T1fuaCXxFdXXbjLKQ7-237-106.png) no-repeat;
        }

        .main-foot {
            float: right;
            margin-right: 100px;
            height: 20 xp;
        }

        .main-foot a {
            display: inline-block;
            border: 1px solid #FFF;
            padding: 4px 10px;
        }

        .main-foot a:hover {
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

        .shop-con {
            width: 1013px;
        }

        .shop-con span {
            display: inline-block;
            height: 108px;
            line-height: 108px;
            vertical-align: top;
            text-align: center;
            padding: 0 20px;
        }

        .shop-con textarea {
            height: 100px;
            width: 300px;
            resize: none;
        }

        .shop-con a {
            display: inline-block;
            vertical-align: top;
            height: 108px;
            line-height: 108px;
            text-align: center;
            padding-left: 430px;
        }

        #menu1content {
            position: absolute;
            display: none;
            width: 100%;
            height: 100%;
            background: #000;
            z-index: 3;
        }

        .btn1 {
            margin-left: 25px;
        }

        .boder {
            border: 1px solid red;
            /*background: url("static/img/YOU.png");*/
        }

        .boder2 {
            border: 1px solid black;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript" src="static/js/jquery.js"></script>
    <title>下单</title>

</head>
<body>

<div id="menu1content">
    <div style="margin:15% 0 0 35%; width:380px; height: 200px; background:#fff;">
        <h2 style="text-align:center;">我的新地址</h2>
        <textarea id="add_user_address"
                  style="margin:10px 0 0 4px; width:360px; height:126px; resize: none;"></textarea>
        <div style=" padding:18px 0 0 220px;">
            <button class="btn1">确认</button>
            <button class="btn2">取消</button>
        </div>
    </div>
</div>

<%@ include file="comment/head.jsp" %>

<div style="border-top:1px #999 solid;"></div>
<div class="content" style="border-top:none;">
    <div id="breadcrumb">
        <ul>
            <li class="a1-1">
                <div class="li-msg">拍下商品</div>
            </li>
            <li class="a2-0">
                <div class="li-msg2">付款到支付宝</div>
            </li>
            <li class="a2-0">
                <div class="li-msg"> 卖家配货</div>
            </li>
            <li class="a3-0">
                <div class="li-msg">确认收货</div>
            </li>
        </ul>
    </div>
    <div class="main">
        <form action="confirmOrder" onsubmit="return checkOrderForm(this)" method="post">
            <div>送餐时间&nbsp;&nbsp;&nbsp;
                <select name="sc_date">
                    <option>10.00-11.00</option>
                    <option>11.00-12.00</option>
                    <option>12.00-13.00</option>
                    <option>17.00-18.00</option>
                    <option>18.00-19.00</option>
                    <option>19.00-20.00</option>
                </select>
            </div>
            <h1>收货地址</h1>
            <ul id="tabul">
                <c:forEach items="${userAddress}" var="list" varStatus="status">
                    <c:if test="${list.addressIsDefault==1}">
                        <li class="boder">
                            <a onclick="xz_address(${status.index})">
                                <P>&nbsp;&nbsp;&nbsp;&nbsp;<span>${user_s.userRealname}</span><em>${user_s.userPhone}</em>
                                </P>
                                <div>${list.addressAddress}</div>
                            </a>
                        </li>
                    </c:if>
                    <c:if test="${list.addressIsDefault!=1}">
                        <li class="boder2">
                            <a onclick="xz_address(${status.index})">
                                <P>&nbsp;&nbsp;&nbsp;&nbsp;<span>${user_s.userRealname}</span><em>${user_s.userPhone}</em>
                                </P>
                                <div>${list.addressAddress}</div>
                            </a>
                        </li>
                    </c:if>
                </c:forEach>
                <li id="add_address_before" style="background:url(../static/img/T1fuaCXxFdXXbjLKQ7-237-106.png)"><a
                        class="main-add">添加新地址</a></li>

            </ul>

            <div>付款方式&nbsp;&nbsp;&nbsp;
                <input name="paytype" type="radio" value="0" checked="checked"/> 支付宝
                <input name="paytype" type="radio" value="1"/>货到付款
            </div>
            <h2>确认订单</h2>
            <div class="msg">
                <table>
                    <colgroup>
                        <col width="80"/>
                        <col width="335"/>
                        <col width="135"/>
                        <col width="135"/>
                        <col width="135"/>
                    </colgroup>
                    <tr class=" msg-tr">
                        <td></td>
                        <td>菜名</td>
                        <td>单价</td>
                        <td>数量</td>
                        <td>小计</td>
                    </tr>
                    <c:forEach items="${car_list}" var="order">
                        <tr height="50">
                            <td><img src="${order.productImg}" width="80" height="50"/></td>
                            <td>${order.productName}</td>
                            <td>${order.productPrice}</td>
                            <td>${order.carProductNum}</td>
                            <td>${order.carProductPrice}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <div class=" shop-con">
                <span>我要留言</span>
                <textarea name="message"></textarea>
                <a>总价<em>${priceCount}元</em></a>
            </div>
            <div style="overflow:auto; zoom:1;">
                <input type="text" name="sumprice" value="${priceCount}" style="display: none;">
                <div class="main-foot"><input style="margin-right:20px;" type="submit" value="提交我的订单"/><a href="index">取消订单</a>
                </div>
            </div>
        </form>
    </div>
</div>

</body>
<script type="text/javascript">
    $(function () {
        $(".main-add").click(function () {
            $("#menu1content").fadeTo("slow", 0.9)
        });
        $(".btn1").click(function () {
            if ($("#add_user_address").val() == "") {
                alert("请输入具体地址");
            } else {
                $.ajax({
                    type: 'POST',
                    url: '${pageContext.request.contextPath}/user/addAddress',
                    data: {address: $("#add_user_address").val()},
                    success: function (data) {
                        if (data.status == 200) {
                            alert(data.msg);
                            window.location.href = "addOrder";
                        } else {
                            alert(data.msg);
                        }
                    },
                });
                $("#menu1content").fadeOut("slow")
            }

        });
        $(".btn2").click(function () {

            $("#menu1content").fadeOut("slow")
        });
    });

    function xz_address(num) {
        $.ajax({
            url: "${pageContext.request.contextPath}/user/selectAddress",
            type: "POST",
            data: {num: num},
            success: function () {
                $('#tabul li').removeClass('boder');
                $('#tabul li').addClass('boder2');
                $('#tabul li:eq(' + num + ')').removeClass('boder2');
                $('#tabul li:eq(' + num + ')').addClass('boder');
            }
        });
    }

    function checkOrderForm(param) {
        if (param.sumprice.value == 0) {
            alert("没有可结算的商品");
            return false;
        }
        return true;
    }

</script>
</html>
