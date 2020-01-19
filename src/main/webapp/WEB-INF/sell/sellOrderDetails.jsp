<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/11/17
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
            background: #eee;
            width: 100%;
            padding-top: 50px;
        }

        .fa-footer {
            background: #eee;
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

        .main {
            position: relative;
            width: 750px;
            padding-top: 26px;
            text-align: center;
        }

        .main-tab {
            position: absolute;
            width: 104px;
            height: 26px;
            line-height: 26px;
            background: #a4bed4;
            left: 35px;
            top: 0px;
            border: 1px #000 solid;
            border-bottom: none;
            text-align: center;
        }

        .main-tab-ex {
            border-bottom: 1px #000 solid;
        }

        .main-tab-ex table {
            border-collapse: collapse;
            border: 1px #000 solid;
        }

        .main-tab-ex td {
            border: 1px #000 solid;
            text-align: center;
        }

        .main-tab-ex-tr1 {
            background: #a4bed4;
        }

        .main-tab-ex-tr2 {
            background: #dbeaf9;
        }

        .main-tab-ex-tr3 {
            background: #dbeaf6;
            height: 50px;
        }

        .main-msg {
            height: 100px;
            padding: 0 200px 10px 200px;
            background: #cbeae9;
        }

        .main-p {
            background: #a4bed4;
        }

        .main-msg span {
            display: inline-block;
            width: 354px;
            background: url(../../static/img/MEIDIAN.png) no-repeat;
            height: 100px;
            padding: 2px;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript" src="static/js/jquery.js"></script>
    <script type="text/javascript" src="static/js/regist.js"></script>
    <script type="text/javascript">
    </script>
    <title>我的订单</title>
</head>
<body>
<%@ include file="../comment/head.jsp" %>

<div style="border-top:1px #999 solid;"></div>
<div class="content" style="border-top:none;">
    <div class="main">
        <div class="main-tab">订单详情</div>
        <div class="main-tab-ex">
            <table>
                <colgroup>
                    <col width="250"/>
                    <col width="100"/>
                    <col width="100"/>
                    <col width="100"/>
                    <col width="100"/>
                    <col width="100"/>
                </colgroup>
                <tr class="main-tab-ex-tr1" height="26" style=" ">
                    <td colspan="6">订单编号：${orderAndUser.orderNo}</td>
                </tr>
                <tr class="main-tab-ex-tr2" height="50">
                    <td colspan="2">点餐人信息：<a>${orderAndUser.userName}</a><a
                            style="padding-left:70px;">${orderAndUser.userPhone}</a></td>
                    <td>成交时间：</td>
                    <td><a><fmt:formatDate value="${orderAndUser.orderTime}" pattern="yyyy-MM-dd hh:MM:ss"/></a></td>
                    <td>要求配送时间：</td>
                    <td><a><fmt:formatDate value="${orderAndUser.orderDelieveTime}" pattern="yyyy-MM-dd hh:MM:ss"/></a>
                    </td>
                </tr>
                <tr class="main-tab-ex-tr2">
                    <td colspan="6">配送地点:<em>${orderAndUser.address}</em></td>
                </tr>
                <tr class="main-tab-ex-tr1" height="50">
                    <td>菜名</td>
                    <td>单价</td>
                    <td>数量</td>
                    <td>付款方式</td>
                    <td>订单状态</td>
                    <td>交易操作</td>
                </tr>
                <c:forEach items="${orderAndUser.list}" var="product" varStatus="pt">
                    <tr class="main-tab-ex-tr3">
                        <td><a href="productDesc?id=${product.itemProductId}">${product.productName}</a></td>
                        <td>${product.productPrice}</td>
                        <td>${product.itemProductNum}</td>
                        <c:if test="${pt.index == 0}">
                            <td rowspan="${orderAndUser.list.size()}">
                                <c:if test="${orderAndUser.orderPayment == 0}">支付宝</c:if>
                                <c:if test="${orderAndUser.orderPayment == 1}">货到付款</c:if>
                            </td>
                            <td rowspan="${orderAndUser.list.size()}">
                                <c:if test="${orderAndUser.orderStatus == 0}"> 待付款</c:if>
                                <c:if test="${orderAndUser.orderStatus == 1}">待发货</c:if>
                                <c:if test="${orderAndUser.orderStatus == 2}">待收货</c:if>
                                <c:if test="${orderAndUser.orderStatus == 3}">交易成功</c:if>
                                <c:if test="${orderAndUser.orderStatus == 4}">货到付款/待发货</c:if>
                                <c:if test="${orderAndUser.orderStatus == 5}">货到付款/待收货</c:if>
                                <c:if test="${orderAndUser.orderStatus == 6}">货到付款/交易完成</c:if>
                                <c:if test="${orderAndUser.orderStatus == 7}">已评价</c:if>
                                <c:if test="${orderAndUser.orderStatus == 8}">取消</c:if>
                                <c:if test="${orderAndUser.orderStatus == 9}">申请退款</c:if>
                                <c:if test="${orderAndUser.orderStatus == 10}">已退款</c:if>
                                <c:if test="${orderAndUser.orderStatus == 11}">用户未收货</c:if>
                            </td>
                            <td rowspan="${orderAndUser.list.size()}">
                                <c:if test="${orderAndUser.orderStatus == 0}">
                                    <button><a style="width:50px;"
                                               href="backOrder?orderId=${orderAndUser.orderId}">退回订单</a></button>
                                    &nbsp;&nbsp;
                                </c:if>
                                <c:if test="${orderAndUser.orderStatus == 1}">
                                    <button><a style="width:50px;"
                                               href="sendOrder?orderId=${orderAndUser.orderId}">现在发货</a></button>
                                    <button><a style="width:50px;"
                                               href="backOrder?orderId=${orderAndUser.orderId}">退回订单</a></button>
                                </c:if>
                                <c:if test="${orderAndUser.orderStatus == 2}">
                                    <button><a style="width:60px;" href="receiveOrder?orderId=${orderAndUser.orderId}">买家已收货</a>
                                    </button>
                                    <button><a style="width:60px;"
                                               href="notReceiveOrder?orderId=${orderAndUser.orderId}&action=2">买家未收货</a>
                                    </button>
                                </c:if>
                                <c:if test="${orderAndUser.orderStatus == 3}">用户未评价</c:if>
                                <c:if test="${orderAndUser.orderStatus == 4}">
                                    <button><a style="width:50px;"
                                               href="goodsSendOrder?orderId=${orderAndUser.orderId}">现在发货</a></button>
                                    <button><a style="width:50px;"
                                               href="backOrder?orderId=${orderAndUser.orderId}">退回订单</a></button>
                                </c:if>

                                <c:if test="${orderAndUser.orderStatus == 5}">
                                    <button><a style="width:60px;"
                                               href="goodsReceiveOrder?orderId=${orderAndUser.orderId}">买家已收货</a>
                                    </button>
                                    <button><a style="width:60px;"
                                               href="notReceiveOrder?orderId=${orderAndUser.orderId}&action=2">买家未收货</a>
                                    </button>
                                </c:if>
                                <c:if test="${orderAndUser.orderStatus == 6}">用户未评价</c:if>
                                <c:if test="${orderAndUser.orderStatus == 7}">
                                    <button><a style="width:50px;"
                                               href="sellSelectMessageOrder?orderId=${orderAndUser.orderId}">已评价</a>
                                    </button>
                                </c:if>
                                <c:if test="${orderAndUser.orderStatus == 8}">已经取消</c:if>
                                <c:if test="${orderAndUser.orderStatus == 9}">
                                    <button><a style="width:50px;"
                                               href="backMoney?orderId=${orderAndUser.orderId}">退款</a></button>
                                </c:if>
                                <c:if test="${orderAndUser.orderStatus == 10}">已经退款</c:if>
                                <c:if test="${orderAndUser.orderStatus == 11}">用户未接收</c:if>
                            </td>
                        </c:if>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <p class="main-p">客户留言</p>
        <div class="main-msg">
            <span>${orderAndUser.orderComments}</span>
        </div>
    </div>
</div>

</body>
</html>
