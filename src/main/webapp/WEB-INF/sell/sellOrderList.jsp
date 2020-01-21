<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/11/17
  Time: 16:32
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
            color: #f40;;
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
            background: mediumseagreen;

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

        .menu-content tr {
            height: 38px;
            background: #eee;
        }

        .menu-content td {
            width: 245px;
            text-align: center;
        }

        .menu-content td a {
            display: inline-block;
            width: 230px;
        }

        .menu-content a {
            display: inline-block;
            padding-left: 5px;
        }

        .menu-content button {
            text-align: center;
            line-height: 18px;
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

        .fa-footer {
            background: #fff;
            width: 100%;
            height: 20px;
            border-bottom: 2px solid #F40;
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
            height: 26px;
            line-height: 26px;
            margin: auto;
            padding-top: 4px;
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
            _filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src="img/biaotianniou1.png");
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
            _filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src="static/img/biaotianniou3.png");
        }

    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>全部订单</title>
    <script type="text/javascript" src="static/js/jquery.js"></script>
</head>
<body>
<%@ include file="../comment/head.jsp" %>

<div style="border-top:1px #999 solid;"></div>
<div class="content" style=" border-top:none;">
    <div class="menu-content">
        <table>
            <tr>
                <td>商品单号</td>
                <td>地址</td>
                <td>交易状态</td>
                <td>交易操作</td>
            </tr>
        </table>
        <div class="tips-button">
            <select name="choose" onchange="submitaction(this)" style="margin-left:860px; width:125px;">
                <option
                        <c:if test="${raction=='00'}">selected</c:if> value="00">全部订单
                </option>
                <option
                        <c:if test="${raction=='0'}">selected</c:if> value="0">待付款
                </option>
                <option
                        <c:if test="${raction=='1'}">selected</c:if> value="1">待配送
                </option>
                <option
                        <c:if test="${raction=='2'}">selected</c:if> value="2">已配送
                </option>
                <option
                        <c:if test="${raction=='3'}">selected</c:if> value="3">已完成
                </option>
                <option
                        <c:if test="${raction=='4'}">selected</c:if> value="4">待配送(货到付款)
                </option>
                <option
                        <c:if test="${raction=='5'}">selected</c:if> value="5">已配送(货到付款)
                </option>
                <option
                        <c:if test="${raction=='6'}">selected</c:if> value="6">完成(货到付款)
                </option>
                <option
                        <c:if test="${raction=='7'}">selected</c:if> value="7">已评价
                </option>

                <option
                        <c:if test="${raction=='8'}">selected</c:if> value="8">已取消
                </option>
                <option
                        <c:if test="${raction=='9'}">selected</c:if> value="9">待退款
                </option>
                <option
                        <c:if test="${raction=='10'}">selected</c:if> value="10">已退款
                </option>
            </select>
        </div>
        <table>
            <c:forEach items="${pageResult.objects}" var="order">
                <tr>

                    <td><a href="sellOrderDetails?id=${order.orderId}">${order.orderNo}</a></td>
                    <td>￥<em>${order.orderTotalPrice}</em></td>
                        <%--订单状态 分为0：已确定 未付款  1：已确定已付款未发货--%>
                        <%--2：已确定已付款已发货待收货 3：已确定 已付款 已发货 已收货--%>
                        <%--4：已确定 货到付款 未发货:5：已确定 货到付款 已发货未收货--%>
                        <%--6：已确定 货到付款 已发货 已收货--%>
                        <%--7：已经评价 ；8取消订单;9退款申请（）10已退款;11用户不收货--%>
                    <td><c:if test="${order.orderStatus==0}"> 待付款</c:if>
                        <c:if test="${order.orderStatus==1}">待发货</c:if>
                        <c:if test="${order.orderStatus==2}">待收货</c:if>
                        <c:if test="${order.orderStatus==3}">交易成功</c:if>
                        <c:if test="${order.orderStatus==4}">货到付款/待发货</c:if>
                        <c:if test="${order.orderStatus==5}">货到付款/待收货</c:if>
                        <c:if test="${order.orderStatus==6}">货到付款/交易完成</c:if>
                        <c:if test="${order.orderStatus==7}">已评价</c:if>
                        <c:if test="${order.orderStatus==8}">取消</c:if>
                        <c:if test="${order.orderStatus==9}">申请退款</c:if>
                        <c:if test="${order.orderStatus==10}">已退款</c:if>
                        <c:if test="${order.orderStatus==11}">用户未收货</c:if>
                    </td>
                    <td><c:if test="${order.orderStatus==0}">
                        <button><a style="width:50px;" href="backOrder?orderId=${order.orderId}">退回订单</a></button>
                        &nbsp;&nbsp;
                    </c:if>
                        <c:if test="${order.orderStatus==1}">
                            <button><a style="width:50px;" href="sendOrder?orderId=${order.orderId}">现在发货</a></button>
                            <button><a style="width:50px;" href="backOrder?orderId=${order.orderId}">退回订单</a></button>
                        </c:if>
                        <c:if test="${order.orderStatus==2}">
                            <button><a style="width:60px;" href="receiveOrder?orderId=${order.orderId}">买家已收货</a>
                            </button>
                            <button><a style="width:60px;"
                                       href="notReceiveOrder?orderId=${order.orderId}&action=2">买家未收货</a></button>
                        </c:if>
                        <c:if test="${order.orderStatus==3}">用户未评价</c:if>
                        <c:if test="${order.orderStatus==4}">
                            <button><a style="width:50px;" href="goodsSendOrder?orderId=${order.orderId}">现在发货</a>
                            </button>
                            <button><a style="width:50px;" href="backOrder?orderId=${order.orderId}">退回订单</a></button>
                        </c:if>

                        <c:if test="${order.orderStatus==5}">
                            <button><a style="width:60px;" href="goodsReceiveOrder?orderId=${order.orderId}">买家已收货</a>
                            </button>
                            <button><a style="width:60px;"
                                       href="notReceiveOrder?orderId=${order.orderId}&action=2">买家未收货</a></button>
                        </c:if>
                        <c:if test="${order.orderStatus==6}">用户未评价</c:if>
                        <c:if test="${order.orderStatus==7}">
                            <button><a style="width:50px;"
                                       href="selectMessageOrder?orderId=${order.orderId}">已评价</a></button>
                        </c:if>
                        <c:if test="${order.orderStatus==8}">已经取消</c:if>
                        <c:if test="${order.orderStatus==9}">
                            <button><a style="width:50px;" href="backMoney?orderId=${order.orderId}">退款</a></button>
                        </c:if>
                        <c:if test="${order.orderStatus==10}">已经退款</c:if>
                        <c:if test="${order.orderStatus==11}">用户未接收</c:if>

                    </td>
                </tr>
            </c:forEach>

        </table>
    </div>
    <div style="width:990px;">
        <div class="foot-tab">
            <c:if test="${raction!=null && raction!=''}">
                <ul>
                    <span id="sli"><a class="foot-tab-hover1"
                                      <c:if test="${pageResult.curr!=1}">href="sellOrderListAction?action=${raction}"</c:if>
                                      style="width:57px;">首页</a></span>

                        <%--<li><a  class="foot-tab-active" style="color: #F60;" href="#">1</a></li>--%>
                        <%--<li><a  class="foot-tab-hover" href="#">2</a></li>--%>
                        <%--<li><a  class="foot-tab-hover" href="#">3</a></li>--%>
                        <%--<li><a  class="foot-tab-hover" href="#">4</a></li>--%>
                        <%--<li><a  class="foot-tab-hover" href="#">5</a></li>--%>

                    <span><a class="foot-tab-hover2"
                             <c:if test="${pageResult.curr!=pageResult.pages}">href="sellOrderListAction?page=${pageResult.pages}&action=${raction}"</c:if>
                             style="width:57px;">尾页</a></span>

                    <li><input style="padding:0;width: 30px" id="p22" value=""/></li>
                    <li><input style="padding:0;" type="button" name="提交" onclick="tz()" value="跳转"/>
                        共${pageResult.pages}页
                    </li>
                    <script>
                        $(document).ready(function () {
                            var p =
                            ${pageResult.curr}
                            var classl = "foot-tab-hover";
                            for (var i =${pageResult.pages}; i > 0; i--) {
                                if (p == i) {
                                    $("#sli").after('<li><a  class="foot-tab-active" style="color: #F60;" >' + i + '</a></li>');
                                } else {
                                    $("#sli").after('<li><a  class="foot-tab-hover" href="sellOrderListAction?page=' + i + '&action=${raction}">' + i + '</a></li>');
                                }

                            }
                        })

                        function tz() {
                            var tf = $("#p22").val()
                            if (tf <= 0) {
                                alert("请输入正确的页数");
                            } else if (tf >${pageResult.pages}) {
                                alert("大于总页数，请输入正确的页数");
                            } else {
                                window.location.href = "sellOrderListAction?page=" + tf + "&action=${raction}";
                            }

                        }
                    </script>
                </ul>
            </c:if>
            <c:if test="${raction==null || raction==''}">
                <ul>
                    <span id="sli"><a class="foot-tab-hover1"
                                      <c:if test="${pageResult.curr!=1}">href="sellOrderList"</c:if>
                                      style="width:57px;">首页</a></span>

                        <%--<li><a  class="foot-tab-active" style="color: #F60;" href="#">1</a></li>--%>
                        <%--<li><a  class="foot-tab-hover" href="#">2</a></li>--%>
                        <%--<li><a  class="foot-tab-hover" href="#">3</a></li>--%>
                        <%--<li><a  class="foot-tab-hover" href="#">4</a></li>--%>
                        <%--<li><a  class="foot-tab-hover" href="#">5</a></li>--%>

                    <span><a class="foot-tab-hover2"
                             <c:if test="${pageResult.curr!=pageResult.pages}">href="sellOrderList?page=${pageResult.pages}"</c:if>
                             style="width:57px;">尾页</a></span>

                    <li><input style="padding:0;width: 30px" id="p2" value=""/></li>
                    <li><input style="padding:0;" type="button" name="提交" onclick="tz()" value="跳转"/>
                        共${pageResult.pages}页
                    </li>
                    <script>
                        $(document).ready(function () {
                            var p =
                            ${pageResult.curr}
                            var classl = "foot-tab-hover";
                            for (var i =${pageResult.pages}; i > 0; i--) {
                                if (p == i) {
                                    $("#sli").after('<li><a  class="foot-tab-active" style="color: #F60;" >' + i + '</a></li>');
                                } else {
                                    $("#sli").after('<li><a  class="foot-tab-hover" href="sellOrderList?page=' + i + '">' + i + '</a></li>');
                                }

                            }
                        })

                        function tz() {
                            var tf = $("#p2").val()
                            if (tf <= 0) {
                                alert("请输入正确的页数");
                            } else if (tf > ${pageResult.pages}) {
                                alert("大于总页数，请输入正确的页数");
                            } else {
                                window.location.href = "sellOrderList?page=" + tf;
                            }
                        }
                    </script>
                </ul>
            </c:if>


        </div>
    </div>
</div>

</body>
<script>
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

    function submitaction(obj) {
        window.location.href = "sellOrderListAction?action=" + obj.value;
    }
</script>
</html>
