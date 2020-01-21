<%--
  Created by IntelliJ IDEA.
  User: 51171
  Date: 2020/1/19
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <style type="text/css">
        html, body, div, span, applet, object, iframe,h1, h2, h3, h4, h5, h6, p, blockquote, pre,a, abbr, acronym, address, big, cite, code,del, dfn, em, font, img, ins, kbd, q, s, samp,small, strike, strong, sub, sup, tt, var,b, u, i, center,dl, dt, dd, ol, ul, li,fieldset, form, label, legend,table, caption, tbody, tfoot, thead, tr, th, td{margin:0; padding:0; border:0; outline: 0; font-size: 100%; font-size:12px; text-decoration:none; margin:0 auto; font-family:Verdana, Geneva, sans-serif;}
        a:link,a:visited,a:hover{color:#000;}
        a:hover{text-decoration: underline;color:#f40;}
        ol, ul { list-style: none;}
        body{ font-size:10px; color:#000; background:#eee;}
        .logo{height:75px; width:1100px; margin:auto; background: no-repeat left; }
        .nav{ position:absolute; float:left; width:0; height:0;}
        .menu{ position: relative; top:44px; left:280px;width:535px;height:31px;background:mediumseagreen;padding-left:7px;}
        .menu li{float:left;width:107px;height:27px;margin-top:4px;background:url(static/img/navline.gif) no-repeat right 3px;}
        .menu li span{display:block;width:98px;height:27px;margin-left:4px;text-align:center;line-height:27px;}
        .menu li span a,.menu .back a{color:#fff;text-decoration:none; display:block;}
        .menu li span a:hover,.menu .back a:hover{ text-decoration:underline; }
        .menu li.current span{background:url(static/img/tagbg.gif) no-repeat;}
        .menu li.current a{font-weight:bold;color:#00712E;}
        .header{ float:right; height:75px; width:180px;}
        .header ul li { float:left; padding-right:15px;}
        .header ul li a{ display:block; float:left; height:36px; line-height:36px;}
        .content {background:#C2EAED; height:500px; padding-top:150px; }
        .loginbar{ width:400px; height:235px; background:#F9F9F9; padding:13px 0px 0px 25px; border:#D8D8D8 1px solid;}
        #loginbar-form{margin-top:18px;  width:350px;}
        #loginbar-form dt{ float:left; font-size:14px; color:#EFA100; text-align: center; width:7em; line-height:26px; }
        #loginbar-form dl{ padding:10px 2px;}
        #loginbar-form input{height:26px; margin-left:10px; border:#F08300 1px solid; width:150px; line-height:26px;}
        .btn{ float:left;border:none; height:35px; width:98px; background:url(static/img/login.png) no-repeat 0 -56px; color:#FFF; font-size:14px;font-weight:700; }
        .btn:hover{ background:url(static/img/login.png) no-repeat 0 -91px;}
    </style>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>登陆</title>
    <script type="text/javascript" src="static/js/jquery.js"></script>
</head>
<body>


<%@ include file="comment/head.jsp" %>

<div class="content2"  style=" border-top:none;">
    <div class="menu-content" style="margin-top:50px; margin-left: 20%">
        <form action="messageOrder" onsubmit="return checkForm1()" method="post">
            <b> <div style="font-size: 18px;height: 30px;color: red">评价:</div></b>
            <input type="hidden" name="orderId" value="${id}">
            <input type="hidden" name="orderStatus" value="7">
            <textarea id="txs"  name="orderComments" rows="10" style="font-size: 16px" cols="100"
                    <c:if test="${action==2}">readonly</c:if>>${orders.orderComments}
            </textarea>
            <div>
                <c:if test="${action!=2}">
                    <button class="btn" type="submit">
                        <a  style="color:#fff;">提&nbsp;&nbsp;&nbsp;&nbsp;交</a></button>

                </c:if>
                <a  href="menu" style="color:#fff;">
                    <input type="button" class="btn" value="返&nbsp;&nbsp;&nbsp;&nbsp;回" style="margin-left: 10px"/></a>
            </div>
        </form>
    </div>

</div><!-- the content end-->
</body>
<script>
    function  checkForm1() {
        var text = $("#txs").val();
        if (text==null || text===""){
            alert("留言内容不能为空，亲");
            return false;
        }
    }
</script>
</html>
