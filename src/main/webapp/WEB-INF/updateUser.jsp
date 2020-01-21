<%--
  Created by IntelliJ IDEA.
  User: guang
  Date: 2018/11/19
  Time: 1:19
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
            font-style: normal;
        }

        a:link, a:visited, a:hover {
            color: #000;
        }

        a:hover {
            text-decoration: none;
            color: #f40;
            cursor: pointer
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
            padding-top: 50px;
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

        .regsiter-msg {
            margin-left: 50px;
            vertical-align: middle;
            color: #03F;
            ime-mode: disabled
        }

        .regsiter-add {
            margin-left: 50px;
            vertical-align: middle;
            color: #03F;
            ime-mode: disabled
        }

        .regsiter-add1 {
            vertical-align: middle;
            color: #03F;
            ime-mode: disabled
        }

        .coll {
            background: white
        }
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script type="text/javascript" src="static/js/jquery.js"></script>
    <script type="text/javascript" src="static/js/regist.js"></script>
    <script type="text/javascript">

        $(document).ready(function () {


            $(".regsiter-msg").click(function () {
                if ($(this).siblings().attr("readonly")) {
                    $(this).siblings().removeAttr("readonly", "readonly");
                    $(this).children("em").html("保存")
                    $(this).prev().attr("style", "background:white");
                } else {
                    $(this).siblings().attr("readonly", "readonly");
                    $(this).children("em").html("修改")
                    $(this).prev().attr("style", "background:gainsboro")
                }
            });
            bindListener();
            $(".regsiter-add").click(function () {
                $("#joinus").append("<dl class='joinus'><dt>配送地址</dt><dd><input class='ipt' type='text'  name='hpmename' id='homename'/><a onclick='s(this)' class='regsiter-msg'><em>保存</em></a><a>丨</a><a class='regsiter-add1'>取消</a></dd></dl>");
                bindListener();
            });

            function bindListener() {
                $(".regsiter-add1").unbind().click(function () {
                    $(this).parent().parent().remove();
                });
            };
        });
    </script>
    <title>修改信息</title>
</head>
<body>
<%@ include file="comment/head.jsp" %>

<div class="content">
    <h1 style="text-align:center; height:35px; line-height:35px; font-size:35px;">我的资料</h1>
    <div style=" width:500px;margin:auto; border:1px solid #eee;">
        <form id="regist" name="regist" action="updateUser" method="post">
            <dl>
                <dt> 登陆邮箱</dt>
                <dd>
                    <input class="ipt" type="hidden" value="${sessionScope.user.userId}" name="userId"/>
                    <input class="ipt" type="text" name="userEmail" id="email" value="${sessionScope.user.userEmail}"
                           readonly="readonly" onfocus="this.style.border='2px solid #f60';"
                           onblur="this.style.border='2px solid #F08300';"/>
                    <a class="regsiter-msg" style="margin-left: 50px"><em>修改</em>邮箱</a>
                </dd>
            </dl>
            <dl>
                <dt> 密码</dt>
                <dd>
                    <input class="ipt" type="password" name="userPassword" id="pwd"
                           value="${sessionScope.user.userPassword}" readonly="readonly"
                           onfocus="this.style.border='2px solid #f60';"
                           onblur="this.style.border='2px solid #F08300';"/>
                    <a class="regsiter-msg"><em>修改</em>密码</a>
                    <span style="color: red">${errss1}</span>
                </dd>
            </dl>
            <dt>昵称</dt>
            <dd>
                <input class="ipt" type="hidden" name="userRol" value="${sessionScope.user.userRol}"/>
                <input class="ipt" type="text" name="userNickname" id="username"
                       value="${sessionScope.user.userNickname}" readonly="readonly"
                       onfocus="this.style.border='2px solid #f60';"
                       onblur="this.style.border='2px solid #F08300';"/>
                <a class="regsiter-msg"><em>修改</em>昵称</a>
                <span style="color: red">${errss3}</span>
            </dd>
            </dl>
            <dl>
                <dt>性别:</dt>
                <dd style="padding:5px 0px 0px 130px; font-size:24px;">
                    <a>男</a>
                    <input type="radio" name="userSex" value="1" checked="checked"/>
                    <a>女</a>
                    <input type="radio"
                           <c:if test="${sessionScope.user.userSex == '0'}">checked="checked"</c:if> name="userSex"
                           value="0" id="sex"/>
                </dd>
            </dl>
            <dl style=" text-align:center; color:#f00; font-size:15px; border-top:2px #666 dashed; padding-top:45px; margin-top:10px; ">
                配送资料（请如实填写,不建议修改）
            </dl>
            <dl>
                <dt>真实姓名</dt>
                <dd>
                    <input class="ipt" type="text" name="userRealname" id="realname"
                           value="${sessionScope.user.userRealname}" readonly="readonly"
                           onfocus="this.style.border='2px solid #f60';"
                           onblur="this.style.border='2px solid #F08300';"/>
                    <a class="regsiter-msg"><em>修改</em>姓名</a>
                    <span style="color: red">${errss4}</span>
                </dd>
            </dl>
            <dl>
                <dt>手机号码</dt>
                <dd>
                    <input class="ipt" type="text" name="userPhone" id="phone" value="${sessionScope.user.userPhone}"
                           readonly="readonly" onfocus="this.style.border='2px solid #f60';"
                           onblur="this.style.border='2px solid #F08300';"/>
                    <a class="regsiter-msg"><em>修改</em>手机号码</a>
                    <span style="color: red">${errss5}</span>
                </dd>
            </dl>
            <c:forEach items="${addressList}" var="address">
                <dl id="joinus" class="joinus"
                    <c:if test="${sessionScope.user.userRol == '1'}">style="display: none" </c:if>>
                    <c:if test="${address.addressIsDefault==1}">
                        <dt>默认配送地址</dt>
                    </c:if>
                    <c:if test="${address.addressIsDefault!=1}">
                        <dt style="color: black">配送地址</dt>
                    </c:if>
                    <dd>
                        <input class="ipt" type="hidden" name="addressId" value="${address.addressId}">
                        <input class="ipt" type="text" value="${address.addressAddress}" name="addressAddress"
                               id="homename" readonly="readonly" onfocus="this.style.border='2px solid #f60';"
                               onblur="this.style.border='2px solid #F08300';"/>
                        <a class="regsiter-msg"><em>修改</em></a>
                        <a>丨</a>
                        <c:if test="${address.addressIsDefault!=1}">
                            <a class="regsiteradd" style="color:#ff2323;margin:0px;"
                               onclick="deleteAddress(this,${address.addressId})">删除</a>
                            <a>丨</a>
                            <a class="regsiteradd" style="color:#0d1dff;margin:0px;"
                               href="updateDefaultAddress?id=${address.addressId}">设默认</a>

                        </c:if>
                        <c:if test="${address.addressIsDefault==1}">
                            <a class="regsiter-add" style="margin:0px;" onclick="appender">添加</a> <a>丨(默认)</a>
                            ${errss6}

                        </c:if>
                    </dd>
                </dl>
            </c:forEach>
            <dl style=" padding:50px 0px 0px 67px;">
                <button class="btn"> 确认修改</button>
                <dd style="padding-top:10px;">
                            <span style="padding-left:110px; vertical-align:middle;">
                               <a style="color:#03F;" href="index.html">返回主页</a>
                            </span>
                </dd>
            </dl>
        </form>
    </div>
</div>


</body>
<script>
    function deleteAddress(obj, id) {
        $.ajax({
            type: "get",
            url: "${pageContext.request.contextPath}/deleteAddress",
            data: {id: id},
            async: false,
            dataType: "text",
            success: function (data) {
                $(obj).parent().parent().remove()
            }, error: function (data) {
                alert("error")
            }
        });
    }
</script>
</html>
