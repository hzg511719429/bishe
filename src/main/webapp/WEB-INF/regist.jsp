<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/11/8
  Time: 2:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
            height: 26x;
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

        #regist dl {
            position: relative;
            z-index: 1;
        }

        #regist dl dd p {
             color: red;
             text-indent: 100px;
         }

        .tipinfo {
            position: absolute;
            left: 100px;
            top: 35px;
            color: #F00;
        }

        #treaty {
            position: relative;
            display: none;
            background: #c2eaed;
            height: 602px;
            text-align: center;
            z-index: 100;
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript" src="static/js/jquery.js"></script>
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
    <div style="position:absolute;top:75px; left:0; width:100%;">
        <div id="treaty">
            <h1>用户协议</h1>
            <p>1:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>2:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>3:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>4:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>5:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>6:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>7:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>8:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>9:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>10:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>1:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>2:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>3:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>4:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>5:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>6:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>7:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>8:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>9:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
            <p>10:xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
        </div>
        <p class="treaty2"></p>
    </div>
    <div style=" width:400px; height:500px; margin:auto; border:1px solid #eee;">
        <form id="regist" action="regist" onsubmit="return checkFormRegist()" name="regist" method="post">
            <dl>
                <dt> 登陆邮箱</dt>
                <dd>
                    <input class="ipt" type="text" value="${user_regist.userEmail}" name="userEmail" id="email"
                           onfocus="this.style.border='2px solid #f60';"
                           onblur="this.style.border='2px solid #F08300';"/>
                    <span>*</span><p>${msg_email}</p>
                    <div class="tipinfo"></div>
                </dd>

            </dl>
            <dl>
                <dt> 密码</dt>
                <dd>
                    <input class="ipt" type="password" name="userPassword" id="passWord"
                           onfocus="this.style.border='2px solid #f60';"
                           onblur="this.style.border='2px solid #F08300';"/>
                    <span>*</span><p>${msg_password}</p>
                    <div class="tipinfo"></div>
                </dd>
            </dl>
            <dl>
                <dt>确认密码</dt>
                <dd>
                    <input class="ipt" type="password" name="passwordAgain" id="passWordAgain"
                           onfocus="this.style.border='2px solid #f60';"
                           onblur="this.style.border='2px solid #F08300';"/>
                    <span>*</span><p>${msg_password2}</p>
                    <div class="tipinfo"></div>
                </dd>
            </dl>
            <dl>
                <dt>昵称</dt>
                <dd>
                    <input class="ipt" type="text" value="${user_regist.userNickname}" name="userNickname"
                           id="userNickname" onfocus="this.style.border='2px solid #f60';"
                           onblur="this.style.border='2px solid #F08300';"/>
                    <span>*</span><p>${msg_nickname}</p>
                </dd>
            </dl>

            <dl>
                <dt>性别:</dt>
                <dd style="padding:5px 0px 0px 130px; font-size:24px;">
                    <a>男</a>&nbsp;
                    <input type="radio" name="userSex" value="1" checked="checked"/>&nbsp; &nbsp; &nbsp;
                    <a>女</a>&nbsp;
                    <input type="radio" name="userSex" value="0"
                           <c:if test="${user_regist.userSex=='0'}">checked="checked"</c:if> id="sex"/>
                </dd>
            </dl>
            <br/>
            <dl>
                <dt>身份:</dt>
                <dd style="padding:5px 0px 0px 130px; font-size:24px;">

                    <input type="checkbox" name="userRol" id="checkbox" value="1" onclick="rol()"
                           <c:if test="${user_regist.userRol == 1}">checked="checked"</c:if>/>
                    <a>是否为卖家</a>
                </dd>
            </dl>
            <dl style=" text-align:center; color:#f00; font-size:15px; border-top:2px #666 dashed; padding-top:45px; margin-top:10px; ">
                配送资料（请如实填写，以方便您订餐）
            </dl>
            <dl>
                <dt>真实姓名</dt>
                <dd>
                    <input class="ipt" type="text" value="${user_regist.userRealname}" name="userRealname" id="userName"
                           onfocus="this.style.border='2px solid #f60';"
                           onblur="this.style.border='2px solid #F08300';"/>
                    <span>*</span><p>${msg_realname}</p>
                    <div class="tipinfo"></div>
                </dd>
            </dl>
            <dl>
                <dt>手机号码</dt>
                <dd>
                    <input class="ipt" type="text" value="${user_regist.userPhone}" name="userPhone" id="sms"
                           onfocus="this.style.border='2px solid #f60';"
                           onblur="this.style.border='2px solid #F08300';"/>
                    <span>*</span><p>${msg_phone}</p>
                    <div class="tipinfo"></div>
                </dd>
            </dl>
            <dl id="if_address">
                <dt>配送地址</dt>
                <dd>
                    <input class="ipt" type="text" value="${addressr}" name="addressAddress" id="homename"
                           onfocus="this.style.border='2px solid #f60';"
                           onblur="this.style.border='2px solid #F08300';"/>
                    <span>*</span><p>${msg_address}</p>
                </dd>
            </dl>
            <dl style=" padding:50px 0px 0px 67px;">
                <button class="btn" type="submit"> 注册</button>
                <dd style="padding-top:10px;">
                 <span>
                      <label style="padding-left:50px;">
                         <input name="" id="mustChecked" type="checkbox" checked="checked" value="客户协议"/>
                      </label> 已同意<a class="treaty1" style="color:#03F;" href="#">用户协议</a>
                  </span>
                </dd>
            </dl>
        </form>
    </div>
</div>

</body>
<script>

    $(function () {
        rol();
    });

    function rol() {
        var ch = $("#checkbox").attr("checked");
        if (ch == "checked") {
            $("#if_address").hide();
        } else {
            $("#if_address").show();
        }
    }

    function checkFormRegist() {
        var check = $("#mustChecked").attr("checked");
        if (check == "checked") {
            return true;
        } else {
            alert("请同意用户协议！");
            $("#mustChecked").focus();
            return false;
        }
    }

</script>
</html>
