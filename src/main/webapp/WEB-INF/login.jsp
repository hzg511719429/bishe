<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/11/7
  Time: 21:57
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
            background: url(static/img/navline.gif) no-repeat right 3px;
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
            background: url(static/img/tagbg.gif) no-repeat;
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
            background: linear-gradient(to bottom right,#145fd7,#41b2f1);
            height: 500px;
            padding-top: 150px;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>登陆</title>
    <script type="text/javascript" src="static/js/jquery.js"></script>
    <link rel="stylesheet"  type="text/css" href="static/css/style1.css">
    <link rel="stylesheet" type="text/css" href="static/css/reset.css"/>
</head>
<body>

<div class="content" id="particles-js">
    <div class="login">
        <div class="login-top">
            登录
        </div>
        <form action="login" method="post">
            <div class="login-center clearfix">
                <div class="login-center-img"><img src="static/img/name.png"/></div>
                <div class="login-center-input">
                    <input id="username" type="text" name="userEmail" value="" placeholder="请输入您的用户名" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的用户名'"/>
                    <div class="login-center-input-text">用户名</div>
                </div>
            </div>
            <div class="login-center clearfix">
                <div class="login-center-img"><img src="static/img/password.png"/></div>
                <div class="login-center-input">
                    <input id="password" type="password" name="userPassword"value="" placeholder="请输入您的密码" onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的密码'"/>
                    <div class="login-center-input-text">密码</div>
                    <p style="text-align: left;color:#F00;padding-top: 10px">${message}</p>
                </div>
            </div>
            <p style="text-align: right;padding-right: 50px;"><a style="color:#F00;" href="mailEditPassword">忘&nbsp;记&nbsp;密&nbsp;码&nbsp;!</a></p>
            <button class="login-button-left" type="submit">
                登录
            </button>
            <a class="login-button-right" href="regist">
                注册
            </a>
        </form>
    </div>
    <div class="sk-rotating-plane"></div>
</div><!-- the content end-->
</body>
<script>
    function hasClass(elem, cls) {
        cls = cls || '';
        if (cls.replace(/\s/g, '').length == 0) return false; //当cls没有参数时，返回false
        return new RegExp(' ' + cls + ' ').test(' ' + elem.className + ' ');
    }

    function addClass(ele, cls) {
        if (!hasClass(ele, cls)) {
            ele.className = ele.className == '' ? cls : ele.className + ' ' + cls;
        }
    }

    function removeClass(ele, cls) {
        if (hasClass(ele, cls)) {
            var newClass = ' ' + ele.className.replace(/[\t\r\n]/g, '') + ' ';
            while (newClass.indexOf(' ' + cls + ' ') >= 0) {
                newClass = newClass.replace(' ' + cls + ' ', ' ');
            }
            ele.className = newClass.replace(/^\s+|\s+$/g, '');
        }
    }
    document.querySelector(".login-button").onclick = function(){
        addClass(document.querySelector(".login"), "active")
        setTimeout(function(){
            addClass(document.querySelector(".sk-rotating-plane"), "active")
            document.querySelector(".login").style.display = "none"
        },800)
        setTimeout(function(){
            removeClass(document.querySelector(".login"), "active")
            removeClass(document.querySelector(".sk-rotating-plane"), "active")
            document.querySelector(".login").style.display = "block"
            alert("登录成功")

        },5000)
    }
</script>
</html>
