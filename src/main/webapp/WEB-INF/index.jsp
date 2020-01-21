<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/11/6
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

        .conntn {
            width: 100%;
            background: #fff;
        }

        .main-nav {
            background: #f50;
            padding: 5px;
            width: 540px;
        }

        .main-msg {
            float: left;
            width: 77px;
            height: 39px;
            background: #f6f6f6;
            line-height: 39px;
            text-align: center;
            color: #999;
            cursor: default
        }

        .main-search {
            font-size: 21px;
            border: 1px solid #D7D7D7;
            height: 35px;
            line-height: 35px;
            width: 350px;
        }

        .tab {
            float: left;
            padding-top: 50px;
            overflow: auto;
            zoom: 1;
        }

        .tab a {
            display: inline-block;
            position: relative;
            border: 1px solid #D7D7D7;
            background: none repeat scroll 0 0 #FFFFFF;
            cursor: pointer;
            font-size: 12px;
            margin: 0 2px;
            padding: 2px 6px;
        }

        .tab a:hover {
            background: #D23956;
            text-decoration: none;
            color: #FFF;
        }

        .tab input {
            border: 1px solid #D7D7D7;
            height: 22px;
            line-height: 22px;
            padding: 0 2px;
            position: relative;
            vertical-align: top;
            width: 60px;
        }

        .tabbnt {
            display: inline-block;
            border: none;
            cursor: pointer;
            height: 25px;
            vertical-align: top;
            width: 40px;
            background: url(../static/img/T1HkYtXdddXXbl7.zr-360-248.png) no-repeat scroll -20px 0;
            margin-left: 50px;
        }

        .button {
            cursor: pointer;
            height: 40px;
            overflow: hidden;
            width: 100px;
            background: url(../static/img/search.png) no-repeat 0 -1px;
            border: none;
            vertical-align: top;
        }

        .list {
            width: 1150px;
            border-bottom: 1px #999 solid;
            overflow: auto;
            zoom: 1;
        }

        .col_item {
            float: left;
            display: inline;
            padding: 10px 9px;
            width: 188px;
            margin: 0 10px 10px 0;
        }

        .col_item p.col_tit {
            height: 18px;
            line-height: 18px;
            margin-top: 5px;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
            width: 190px;
        }

        .col_item p.col_tit {
            height: 18px;
            line-height: 18px;
            margin-top: 5px;
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap;
            width: 190px;
        }

        .col_item .col_price {
            font-family: "微软雅黑";
            height: 24px;
            margin: 3px 0;
            position: relative;
            width: 190px;
        }

        .col_item .col_info {
            color: #666666;
            height: 18px;
            overflow: hidden;
            position: relative;
            width: 190px;
        }

        .col_item .price-wrap {
            display: inline-block;
            height: 24px;
            overflow: hidden;
            vertical-align: middle;
            width: 137px;
            margin-left: 25px;
        }

        .foot-tab {
            padding-left: 345px;
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
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%--    <link rel="stylesheet" href="static/css/bootstrap.css" type="text/css" media="screen">--%>
<%--    <script src="static/js/bootstrap.js" type="text/javascript"></script>--%>
<%--    <script type="text/javascript" src="static/js/jquery-1.9.1.min.js"></script>--%>
    <link rel="stylesheet" href="static/css/zalki_hover_img.css" type="text/css" media="screen">
    <script type="text/javascript" src="static/js/jquery.js"></script>
    <script src="static/jQuery/jquery.easing.1.3.js" type="text/javascript"></script>
    <script src="static/js/jquery.zalki_hover_img.min-0.2.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(window).load(function () {
            $('.main_box').ZalkiHoverImg(
            );
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
    <title>主页</title>
</head>
<body>
<%@ include file="comment/head.jsp" %>

<div class="conntn">
    <div style="width:900px; padding-top:50px; overflow:auto;zoom:1; ">
        <div class="main-nav">
            <div class="main-msg">菜色</div>
            <form action="index" id="search_form" method="get">
                <label>
                    <input type="text" name="status" value="${status}" style="display: none"/>
                    <input type="text" name="max" value="${max}" style="display: none"/>
                    <input type="text" name="min" value="${min}" style="display: none"/>
                    <input class="main-search" type="text" name="word" placeholder="搜索菜品" value="${word}"/>
                </label>
                <button class="button" onclick="search_form_sumbit()"></button>
            </form>
        </div>
        <div class="tab">
            <em style="font-size:14px; font-weight: 700;">排序:</em>
            <a href="index?status=0&max=${max}&min=${min}&word=${word}"
                    <c:if test="${status == 0}"> style=" color:red"</c:if> >默认</a>
            <a href="index?status=1&max=${max}&min=${min}&word=${word}"
                    <c:if test="${status == 1}"> style=" color:red"</c:if> >最新</a>
            <a href="index?status=2&max=${max}&min=${min}&word=${word}"
                    <c:if test="${status == 2}"> style=" color:red"</c:if> >销量</a>
            <div style="float: right">
                <form action="index" method="post" onsubmit="return checkPrice(this)">
                    <label>
                        <span style="padding:0 30px 0 150px;"><a style=" background:#D23956;">请输入价格</a></span>
                        <input type="text" name="status" value="${status}" style="display: none"/>
                        <input type="text" name="word" value="${word}" style="display: none"/>
                        <input type="text" name="min" placeholder="最低价格" value="${min}"/>
                    </label>
                    <i> 至 </i>
                    <label>
                        <input type="text" name="max" value="${max}" placeholder="最高价格"/>
                    </label>
                    <label>
                        <input type="submit" value="查询"/>
                    </label>
                </form>
            </div>
        </div>
    </div>

    <div class="list">
        <div style="width:1150px; height:30px; background:#eee; "></div>
        <div style=" margin:10px 20px 0 30px; width:1100px; overflow:auto; _zoom:1;">
            <c:forEach items="${pageResult.objects}" var="list">
                <div class="col_item">
                    <div class="main_box user_style4" data-hipop="two-horizontal">
                        <img src="${list.productPicture}" style="height: 250px;width: 188px">
                        <a href="indexAddCart?id=${list.productId}" class="popup" title="下单"></a>
                        <a href="productDesc?id=${list.productId}" class="popup2" title="详情"></a>
                    </div>
                    <p class="col_tit"><a style=" padding-left:20px;">${list.productName}</a></p>
                    <div class="col_price">
                        <span class="price-wrap"> <span>¥:<em>${list.productPrice}</em></span> </span>
                    </div>
                    <div class="col_info">
                        <a target="_blank" class="col_new">
                            <c:if test="${list.productTaste==0}">不辣</c:if>
                            <c:if test="${list.productTaste==1}">辣</c:if>
                        </a>
                        <i>|</i>
                        <a target="_blank" class="col_saled" data-spm="d11">已售<em>${list.productHassSelled}</em>件</a>
                        <i>|</i> <span class="col_shop"><a href="productDesc?id=${list.productId}">了解详情</a></span>
                    </div>
                </div>
            </c:forEach>
        </div>
        <div class="foot-tab">
            <ul>
                <span><a class="foot-tab-hover1"
                         href="index?page=1&row=10&status=${status}&max=${max}&min=${min}&word=${word}"
                         style="width:57px;">首页</a></span>
                <c:if test="${pageResult.pages == 1}">
                    <li><a class="foot-tab-active" style="color: #F60;" href="#">1</a></li>
                </c:if>
                <c:if test="${pageResult.pages > 1}">
                    <c:if test="${pageResult.curr == 1}">
                        <li><a class="foot-tab-active" style="color: #F60;" href="#">1</a></li>
                        <li><a class="foot-tab-hover"
                               href="index?page=${pageResult.curr+1}&row=10&status=${status}&max=${max}&min=${min}&word=${word}">2</a>
                        </li>
                    </c:if>
                    <c:if test="${pageResult.curr+1 < pageResult.pages && pageResult.curr >1 }">
                        <li><a class="foot-tab-hover"
                               href="index?page=${pageResult.curr-1}&row=10&status=${status}&max=${max}&min=${min}&word=${word}">${pageResult.curr-1}</a>
                        </li>
                        <li><a class="foot-tab-active" style="color: #F60;" href="#">${pageResult.curr}</a></li>
                        <li><a class="foot-tab-hover"
                               href="index?page=${pageResult.curr+1}&row=10&status=${status}&max=${max}&min=${min}&word=${word}">${pageResult.curr+1}</a>
                        </li>
                    </c:if>
                    <c:if test="${pageResult.curr == pageResult.pages}">
                        <li><a class="foot-tab-hover"
                               href="index?page=${pageResult.curr-1}&row=10&status=${status}&max=${max}&min=${min}&word=${word}">${pageResult.curr-1}</a>
                        </li>
                        <li><a class="foot-tab-active" style="color: #F60;" href="#">${pageResult.pages}</a></li>
                    </c:if>
                </c:if>
                <span><a class="foot-tab-hover2"
                         href="index?page=${pageResult.pages}&row=10&status=${status}&max=${max}&min=${min}&word=${word}"
                         style="width:57px;">尾页</a></span>
            </ul>
            <form action="index" method="post" onsubmit="return checkPage(this)">
                <input style=" margin:13px;width:23px;" name="page" type="text" value="1"/>
                <input type="text" name="status" value="${status}" style="display: none"/>
                <input type="text" name="max" value="${max}" style="display: none"/>
                <input type="text" name="min" value="${min}" style="display: none"/>
                <input type="text" name="word" value="${word}" style="display: none"/>
                <input style="padding:0;" name="提交" type="submit" value="跳转"/>
            </form>
        </div>
    </div>
</div>

</body>
<script>
    function search_form_sumbit() {
        $("#search_form").submit;
    }

    function checkPrice(param) {
        //对输入的价格进行校验
        if (param.min.value == "" || param.max.value == "") {
            alert("请输入加个区间");
            return false;
        } else {
            var reg = /(^[1-9]([0-9]+)?(\.[0-9]{1,2})?$)|(^(0){1}$)|(^[0-9]\.[0-9]([0-9])?$)/;
            if (reg.test(param.max.value)) {
                return true;
            } else {
                alert("请输入正确的价格!");
                return false;
            }
        }
    }

    function checkPage(param) {
        //对输入的页数进行校验
        var page = param.page.value;
        if (page == "") {
            alert("请输入页数！");
            return false;
        } else {
            //输入必须是数字
            var reg = /^[0-9]+$/;
            if (reg.test(page)) {
                //判断是否超出总页数
                if (page > ${pageResult.pages}) {
                    alert("超出总页数，请重新输入!");
                    return false;
                } else {
                    return true;
                }
            }
        }
    }


</script>
</html>
