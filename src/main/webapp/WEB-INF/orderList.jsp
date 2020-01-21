<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/11/18
  Time: 1:49
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
            text-decoration: none;
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
            background: url(img/biaotianniou1.png) no-repeat;
            _background: none;
            _filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src="img/biaotianniou1.png");
        }

        .tips-button a:hover {
            color: #000;
            font-weight: bolder;
            text-decoration: none;
            background: url(../static/img/biaotianniou2.png) no-repeat;
            _background: none;
            _filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src="img/biaotianniou2.png");
        }

        .tips-button a:active {
            color: #fff;
            background: url(../static/img/biaotianniou3.png) no-repeat;
            text-decoration: none;
            _background: none;
            _filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src="img/biaotianniou3.png");
        }

    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript" src="static/js/jquery.js"></script>
    <script type="text/javascript" src="static/js/regist.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#five").click(function () {
                if ($(this).attr("checked")) {
                    $(".col").attr("checked", "checked");
                } else {
                    $(".col").removeAttr("checked", "checked");
                }
            })
        });

        function chec() {
            if ($(this).attr("checked")) {
                $(".col").attr("checked", "checked");
            } else {
                $(".col").removeAttr("checked", "checked");
            }
        }

        function checfor() {
            var i = 0;
            $("input[name='ordersn']:checked").each(function () {
                i++;
            });
            if (i != $("#orderSize").val()) {
                $("#five").attr("checked", false);
            } else {
                $("#five").attr("checked", true);
            }
        }

        function forms1() {
            // if ($("#f1").hasClass("col")){
            $("#f1").submit();
            //  }


        }

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
    <title>我的订单</title>
</head>
<body>

<%@ include file="comment/head.jsp" %>

<div class="content" style=" border-top:none;">
    <div class="menu-content">
        <table>
            <tr>
                <td>订单单号</td>
                <td>价格</td>
                <td>交易状态</td>
                <td>交易操作</td>
            </tr>
        </table>
        <form id="f1" action="gopay" method="post">
            <div class="tips-button">
                <input type="checkbox" id="five" style="margin:0 30px;" onclick="chec(this)" checked/>
                <label for="five" style=" height:28px; line-height:28px;  ">选取未付款</label>
                <a onclick="forms1()">合并付款</a>
            </div>

            <table>
                <c:forEach items="${pageResult.objects}" var="order">
                    <tr>
                        <td style="width:70px;">
                            <input type="hidden" value="1" name="all"/>
                            <input type="checkbox" name="ordersn" checked onclick="checfor()" value="${order.orderId}"
                                    <c:if test="${order.orderStatus==0}"> class="col"</c:if>/>
                            <input type="text" id="orderSize" value="${orderSize}" style="display: none"/>
                        </td>
                        <td><a href="menuDetails?id=${order.orderId}">${order.orderNo}</a></td>
                        <td>￥<em>${order.orderTotalPrice}</em></td>
                            <%--订单状态 分为0：已确定 未付款  1：已确定已付款未发货--%>
                            <%--2：已确定已付款已发货待收货 3：已确定 已付款 已发货 已收货--%>
                            <%--4：已确定 货到付款 未发货:5：已确定 货到付款 已发货未收货--%>
                            <%--6：已确定 货到付款 已发货 已收货--%>
                            <%--7：已经评价 ；8取消订单;9退款申请（）10已退款;11用户不收货--%>
                            <%--12：超时10分钟未付款，订单取消--%>
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
                            <c:if test="${order.orderStatus==11}">用户拒收</c:if>
                            <c:if test="${order.orderStatus==12}">订单取消</c:if>

                        </td>
                        <td><c:if test="${order.orderStatus==0}">
                            <button><a style="width:50px;" href="gopay?ordersn=${order.orderId}&all=1">付款</a></button>
                            &nbsp;&nbsp;
                            <button><a style="width:50px;" href="deleteOrder?id=${order.orderId}">取消</a></button>
                        </c:if>
                            <c:if test="${order.orderStatus==1}">
                                <button><a style="width:50px;" href="backMoneyOrder?orderId=${order.orderId}">申请退款</a>
                                </button>
                            </c:if>
                            <c:if test="${order.orderStatus==2}">
                                <button><a style="width:50px;"
                                           href="userReceiveOrder?id=${order.orderId}&action=2">确定收货</a>
                                </button>
                            </c:if>
                            <c:if test="${order.orderStatus==3}">
                                <button><a style="width:50px;" href="messageOrder?id=${order.orderId}">评价</a></button>
                            </c:if>
                            <c:if test="${order.orderStatus==4}">
                                <button><a style="width:50px;" href="deleteOrder?id=${order.orderId}">取消</a></button>
                            </c:if>

                            <c:if test="${order.orderStatus==5}">
                                <button><a style="width:50px;"
                                           href="userReceiveOrder?id=${order.orderId}&action=2">确定收货</a>
                                </button>
                            </c:if>
                            <c:if test="${order.orderStatus==6}">
                                <button><a style="width:50px;" href="messageOrder?id=${order.orderId}">评价</a></button>
                            </c:if>
                            <c:if test="${order.orderStatus==7}">
                                <button><a style="width:50px;" href="selectMessageOrder?orderId=${order.orderId}">已评价</a>
                                </button>
                            </c:if>
                            <c:if test="${order.orderStatus==8}">已取消</c:if>
                            <c:if test="${order.orderStatus==9}">等待退款</c:if>
                            <c:if test="${order.orderStatus==10}">已退款</c:if>
                            <c:if test="${order.orderStatus==11}">用户拒收</c:if>
                            <c:if test="${order.orderStatus==12}">超时10分钟未付款，订单取消</c:if>
                        </td>
                    </tr>
                </c:forEach>

            </table>
        </form>
    </div>
    <div style="width:990px;">
        <div class="foot-tab">

            <ul>
                <span id="sli"><a class="foot-tab-hover1"
                                  <c:if test="${pageResult.curr!=1}">href="menu"</c:if>
                                  style="width:57px;">首页</a></span>
                <span><a class="foot-tab-hover2"
                         <c:if test="${pageResult.curr!=pageResult.pages}">href="menu?page=${pageResult.pages}"</c:if>
                         style="width:57px;">尾页</a></span>

                <li><input style="padding:0;width: 30px" id="p2" value="" onkeyup="this.value=this.value.replace(/\D/g,'')"/></li>
                <li><input style="padding:0;" type="button" name="提交" onclick="tz()" value="跳转"/> 共${pageResult.pages}页
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
                                $("#sli").after('<li><a  class="foot-tab-hover" href="menu?page=' + i + '">' + i + '</a></li>');
                            }

                        }
                    })

                    function tz() {
                        var tf = $("#p2").val()
                        if (tf <= 0) {
                            alert("请输入正确的页数");
                        } else if (tf >${pageResult.pages}) {
                            alert("大于总页数，请输入正确的页数");
                        } else {
                            window.location.href = "menu?page=" + tf;
                        }

                    }
                </script>
            </ul>

        </div>
    </div>
</div>
</body>
<script>

</script>
</html>
