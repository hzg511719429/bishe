<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/11/17
  Time: 0:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>支付</title>

</head>
<body>

<%@ include file="comment/head.jsp" %>

<div class="content" style="border-top:none;">
    <div id="breadcrumb">
        <ul>
            <li class="a1-1">
                <div class="li-msg">拍下商品</div>
            </li>
            <li class="a2-1">
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
        <table border="1px solid red">
            <c:forEach items="${order_list}" var="list">
                <tr>
                    <td>订单号</td>
                    <td>${list.orderNo}</td>
                </tr>
                <tr>
                    <td>金额</td>
                    <td>${list.orderTotalPrice}</td>
                </tr>

            </c:forEach>
            <c:if test="${paytype==0}">
                <tr>
                    <td colspan="2"><a style="color: red" href="gopay?ordersn=${order_list_one.orderId}&all=2">去支付</a>
                    </td>
                </tr>
            </c:if>
        </table>
    </div>
</div>

</body>
</html>
