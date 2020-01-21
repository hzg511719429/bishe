<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/11/18
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            padding-top: 50px;
            height: 552px;
        }

        #regist .ipt {
            border: 2px solid #F08300;
            margin: 10px 0px;
            width: 220px;
            height: 26px;
        }

        #regist dt {
            float: left;
            font-size: 16px;
            width: 6em;
            text-align: center;
            line-height: 40px;
        }

        #regist .btn {
            float: left;
            border: none;
            height: 35px;
            width: 98px;
            background: url(../static/img/login.png) no-repeat 0 -56px;
            color: #FFF;
            font-size: 14px;
            font-weight: 700;
        }

        #regist .btn:hover {
            background: url(../static/img/login.png) no-repeat 0 -90px;
        }

        .treaty2 {
            display: block;
            width: 28px;
            height: 50px;
            margin-left: 80%;
            background: url(../static/img/UP.png);
            _background: none;
            _filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src="img/UP.png");
        }

        #regist {
            position: relative;
            z-index: 1;
        }

        .tipinfo {
            position: absolute;
            left: 100px;
            top: 85px;
            color: #F00;
        }

        #treaty {
            display: none;
            background: #c2eaed;
            height: 602px;
            text-align: center;
            z-index: 100;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript" src="static/js/jquery.js"></script>
    <script language="javascript" type="text/javascript" src="static/js/jquery.validate.js"></script>
    <script language="javascript" type="text/javascript" src="staticjs/validate_expand.js"></script>
    <script language="javascript" type="text/javascript" src="staticjs/validate.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            initValidator();
        });
    </script>
    <script type="text/javascript">
        $(document).ready(function () {
            $(".treaty1").click(function () {
                $("#treaty").slideDown(500);
                $("#treaty").animate({height: '602px'});
            });
        });
        $(document).ready(function () {
            $(".treaty2").click(function () {
                $("#treaty").slideToggle(500);
                $("#treaty").animate({height: '602px'});
            });
        });
    </script>
    <title>注册</title>
</head>
<body>

<%@include file="comment/head.jsp" %>

<div class="content">
    <div style=" width:400px;margin:auto; border:1px solid #eee; overflow:auto; zoom:1;">
        <form id="regist" action="mailEditPassword" name="regist" method="post">
            <h1>重置密码</h1>
            <dl style=" padding:30px 0;">
                <h1 style="color: red; margin-left: 110px">${semail}</h1>
                <dt> 登陆邮箱</dt>
                <dd><input class="ipt" type="text" name="email" id="email" onfocus="this.style.border='2px solid #f60';"
                           onblur="this.style.border='2px solid #F08300';"/>
                    <div class="tipinfo" style="margin-top: 20px"><font for="email" generated="true" class="error">请输入注册时填写的安全邮箱</font>
                    </div>
                    <br/>
                </dd>
            </dl>
            <dl style=" padding:0px 0px 0px 140px;">
                <button class="btn" type="submit"> 重置密码</button>
            </dl>
        </form>
    </div>
</div>
</body>
</html>
