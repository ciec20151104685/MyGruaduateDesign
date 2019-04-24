<%@ page import="java.util.ArrayList" %>

<%--
  Created by IntelliJ IDEA.
  User: Creams
  Date: 2018/1/23
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<html>

<head>
    <title>读者列表</title>
</head>
<body>
<h1 align="center">欢迎进入图书馆管理系统</h1>
<jsp:include page="nav.jsp"/>

<table class="table">
    <thead>
    <tr>
        <th>读者ID</th>
        <th>读者姓名</th>
        <th>读者邮箱</th>
        <th>读者电话</th>
        <th>信用</th>
    </tr>
    <button  class="btn btn-default" name="over" value="1 " onclick="returnback()">返回上层</button>
    </thead>
    <tbody>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.username}</td>
            <td>${user.stuname}</td>
            <td>${user.mail}</td>
            <td>${user.phonenum}</td>
            <td>${user.credit}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
<script>
 function returnback() {

     window.location.href = "${pageContext.request.contextPath}/user/all/user";


 }
</script>
