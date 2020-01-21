<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/11/10
  Time: 22:29
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

        .tab {
            width: 1100px;
            margin: auto;
        }

        .teb-property {
            float: left;
            padding: 20px 0 0 30px;
            margin-left: 45px;
            height: 334px;
            width: 500px;
            background: url(../static/img/YOU.png) no-repeat;
        }

        .teb-property ul li {
            width: 430px;
            height: 50px;
            border-bottom: 1px #999 dashed;
        }

        .teb-property ul li a {
            display: inline-block;
            width: 50px;
            height: 26px;
            line-height: 26px;
            vertical-align: baseline;
            text-align: center;
        }

        .teb-property ul li span {
            display: inline-block;
            padding-top: 20px;
        }

        .sp {
            float: left;
            padding: 10px 10px 10px 10px;;
            background: #0FF;
            width: 452px;
            height: 361px;
        }

        .sp-wrap {
            display: none;
            line-height: 0;
            font-size: 0;
            background: #eee;
            position: relative;
            border: 1px solid #E4E4E4;
        }

        .sp-large {
            position: relative;
            overflow: hidden;
        }

        .sp-large a img {
            max-height: 300px;
            width: 450px;
            height: auto;
            cursor: -webkit-zoom-in;
            cursor: -moz-zoom-in;
        }

        .sp-large a {
            display: inline-block;
        }

        .sp-thumbs {
            width: 100%;
            text-align: center;
        }

        .sp-thumbs img {
            width: 50px;
            height: 50px;
        }

        .sp-thumbs a:link, .sp-thumbs a:visited {
            border: 5px solid #eee;
            display: inline-block;
        }

        .sp-thumbs a:hover, .sp-thumbs a:active, .sp-current {
            border: 5px solid #5BC9B7 !important;
        }

        .sp-zoom {
            position: absolute;
            left: 0;
            top: 0;
            cursor: zoom;
            cursor: -webkit-zoom-out;
            cursor: -moz-zoom-out;
            display: none;
        }

        .tab-list {
            width: 1100px;
            border: 1px #333 dashed;
        }

        .tab-list-head {
            height: 27px;
            background: #f7fafe;
        }

        .tab-list-heablogo {
            width: 210px;
            height: 27px;
            background: url(../static/img/index_1386824588_454.png) no-repeat center;
        }

        .tab-list-foot {
            display: none;
            width: 1000px;
            margin: auto;
            height: 100px;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript" src="static/js/jquery.js"></script>
    <script type="text/javascript" src="static/js/regist.js"></script>
    <script type="text/javascript">
        $(function () {
            var t = $("#text_box");
            $("#add").click(function () {
                t.val(parseInt(t.val()) + 1)
                setTotal();
            })
            $("#min").click(function () {
                if (t.val() > 0) {
                    t.val(parseInt(t.val()) - 1)
                } else {
                    t.val(0);
                }
                setTotal();
            })

            function setTotal() {
                $("#total").html((parseInt(t.val()) * 3.95).toFixed(2));
            }

            setTotal();
        });
        $(document).ready(function () {
            $(".tab-list-head").click(function () {
                $(".tab-list-foot").slideToggle(1000);
            });
        });
    </script>
    <title>商品-详情</title>
<body>

<%@ include file="comment/head.jsp" %>

<div style="border-top:1px #999 solid;"></div>
<div class="content" style="border-top:none;">
    <div class="tab">
        <div style="overflow:auto;zoom:1;">
            <div class="sp">
                <div class="page">
                    <div class="sp-wrap">
                        <c:forEach items="${productImgList}" var="imgList">
                            <a href="${imgList.imgurl}"><img src="${imgList.imgurl}" alt="图片"></a>
                        </c:forEach>
                        <script type="text/javascript" src="static/js/smoothproducts.js"></script>
                    </div>
                </div>
            </div>
            <div class="teb-property">
                <ul>
                    <li>
                        <h1 style=" text-align:center; font-size:14px;">${product.productName}</h1>
                    </li>
                    <li><a>单价</a><em style="font-size:26px; padding-right:20px;">￥</em><em
                            style="color:#FF9562; font-weight:bold; font-size:26px; ">${product.productPrice}</em></li>
                    <li>
                        <span><a>已售</a><em>${product.productHassSelled}</em>份</span>
                    </li>
                    <li>
                            <span>
                                <a>口味</a>
                                <c:if test="${product.productTaste == 0}">
                                    <a style="text-decoration: none">不辣</a>
                                </c:if>
                                <c:if test="${product.productTaste == 1}">
                                    <a style="text-decoration: none">辣</a>
                                </c:if>
                            </span>
                    </li>
                    <li>
                        <a>我要</a>
                        <span>
                                    <button id="min">-</button>
                                    <input id="text_box" type="text" name="num" value="1" style="width:20px;"
                                           onkeyup="this.value=this.value.replace(/\D/g,'')"/>
                                    <button id="add">+</button>
                            </span>份
                        <a>库存</a><a>(<em>${product.productStock}</em>)</a>
                    </li>
                    <li>
                        <button id="addcart" onclick="addcart(0)" style="margin:30px 0 0 35px;">加入购物车</button>
                        <button onclick="addcart(1)" style=" margin-left:35px;">直接付款</button>
                    </li>
                </ul>
            </div>
        </div>
        <div class="tab-list">
            <div class="tab-list-head">
                <div class="tab-list-heablogo"></div>
            </div>
            <div class="tab-list-foot">
                <p>${product.productDescription}</p>
            </div>
        </div>
    </div>
</div>

</body>

<script type="text/javascript">

    function addcart(status) {
        //判断库存是否充足
        var number = $("#text_box").attr("value");
        if (number > ${product.productStock}) {
            alert("库存不足，请重新输入");
        } else {
            $.ajax({
                url: '${pageContext.request.contextPath}/addcart',
                type: "POST",
                data: {id:${product.productId}, price:${product.productPrice}, number: number, status: status},
                success: function (data) {
                    if (data.status == 200) {
                        alert(data.msg);
                        if (data.data != null) {
                            window.location.href = data.data;
                        }
                    } else {
                        alert(data.msg);
                    }
                }
            });
        }
    }

</script>


</html>
