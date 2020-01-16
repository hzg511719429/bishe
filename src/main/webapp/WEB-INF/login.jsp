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
            background: #C2EAED;
            height: 500px;
            padding-top: 150px;
        }

        .loginbar {
            width: 400px;
            height: 235px;
            background: #F9F9F9;
            padding: 13px 0px 0px 25px;
            border: #D8D8D8 1px solid;
        }

        #loginbar-form {
            margin-top: 18px;
            width: 350px;
        }

        #loginbar-form dt {
            float: left;
            font-size: 14px;
            color: #EFA100;
            text-align: center;
            width: 7em;
            line-height: 26px;
        }

        #loginbar-form dl {
            padding: 10px 2px;
        }

        #loginbar-form input {
            height: 26px;
            margin-left: 10px;
            border: #F08300 1px solid;
            width: 150px;
            line-height: 26px;
        }

        #loginbar-form .btn {
            float: left;
            border: none;
            height: 35px;
            width: 98px;
            background: url(../static/img/login.png) no-repeat 0 -56px;
            color: #FFF;
            font-size: 14px;
            font-weight: 700;
        }

        #loginbar-form .btn:hover {
            background: url(../static/img/login.png) no-repeat 0 -91px;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>登陆</title>
    <script type="text/javascript" src="static/js/jquery.js"></script>
</head>
<body>
<%@include file="comment/head.jsp" %>

<div class="content">
    <div class="loginbar">
        <h3 style="font: '新宋体'; font-size:18px;line-height:20px; color:#EFA100;">馋嘴猫请登陆</h3>
        <form id="loginbar-form" action="login" onsubmit="return checkForm()" method="post">
            <h1 id="hs1" style="color: red;margin-left: 110px">${message}</h1>
            <dl>
                <dt>请输入用户名：</dt>
                <dd>
                    <input type="text" id="user_name" name="userEmail" class="text"
                           onfocus="this.style.border='1px solid #f60';"
                           onblur="this.style.border='1px solid #F08300';"
                           title="3-20位字符，可由英文、数字”@”组成"/>
                </dd>
            </dl>
            <dl>
                <dt>请输入密码：</dt>
                <dd>
                    <input type="password" id="password" name="userPassword" class="text"
                           onfocus="this.style.border='1px solid #f60';"
                           onblur="this.style.border='1px solid #F08300';"
                           title="6-16位字符，可由英文、数字及标点符号组成"/>
                    &nbsp;&nbsp;<a style="color:#F00;" href="mailEditPassword">忘&nbsp;记&nbsp;密&nbsp;码&nbsp;!</a>
                </dd>
            </dl>
            <dl>
                <dd style="margin-left:35px; margin-top:18px;">
                    <button class="btn" type="submit"><a style="color:#fff;text-decoration: none">登&nbsp;&nbsp;&nbsp;&nbsp;录</a>
                    </button>
                    <p style="padding:15px 0px 0px 200px;">
                        <a href="regist" style="color:#0CF;">马&nbsp;上&nbsp;注&nbsp;册</a>
                    </p>
                </dd>
            </dl>
        </form>
    </div><!--the regsiter end-->
</div><!-- the content end-->
</body>
<script>
    function checkForm() {
        var name = $("#user_name").val();
        var password = $("#password").val();
        //非空校验
        if (name == "" || name == null) {
            clean();
            $("#hs1").html("用户名不能为空！");
            return false;
        } else if (password == "" || password == null) {
            clean();
            $("#hs1").html("密码不能为空！");
            return false;
        }
        return true;
    }

    //清空信息
    function clean() {
        $("#hs1").html();
    }
</script>
</html>
