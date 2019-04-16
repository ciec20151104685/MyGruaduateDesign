<%--
  Created by IntelliJ IDEA.
  User: yd
  Date: 2019/4/13
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="utf-8" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/addbook.css">
<script src="${pageContext.request.contextPath}/js/AddScript.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<html>
<head>
    <title>注册用户</title>
</head>
<body>

<div class="bookinfo">
    <div class="title">
        <span>注册信息</span>
    </div>
    <div>
        <span class="infotitle">用户名：</span><input name="bookid" class="required" id="username">
    </div>
    <div>
        <span class="infotitle">密码：</span><input class="required" name="bookname" id="password">
    </div>
    <div>
        <span class="infotitle">mail：</span><input class="required" name="bookauthor" id="mail">
    </div>
    <div>
        <span class="infotitle">手机号：</span><input class="required" name="bookpublisher" id="phonenum">
    </div>
    <div>
        <span class="infotitle">学生姓名：</span><input class="required" name="bookprice" id="stuname">
    </div>

    <div class="button">
        <button  onclick="register()">注册</button>
    </div>
</div>

</body>
</html>


<script>
    function register() {
        var username = $("#username").val();
        var password = $("#password").val();
        var mail = $("#mail").val();
        var phonenum = $("#phonenum").val();
        var stuname = $("#stuname").val();
        $.post("${pageContext.request.contextPath}/user/register", {
            username: username,
            password: password,
            mail: mail,
            phonenum: phonenum,
            stuname: stuname
        }, function (result) {
            if (result == "ok") {
                window.location.href = "${pageContext.request.contextPath}/user/login/get"
            } else {
                layui.layer.msg("err")
//                alert("err");
            }
        })

    }
</script>
