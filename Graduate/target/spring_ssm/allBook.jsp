<%--
  Created by IntelliJ IDEA.
  User: yd
  Date: 2019/4/14
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1/jquery-3.3.1.js"></script>
<script src="${pageContext.request.contextPath}/js/layui/layui.all.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

<html>
<head>
    <title>图书管理</title>
</head>
<body>
<h1 align="center">欢迎进入图书馆管理系统</h1>
<%@ include file="nav.jsp" %>
<table class="table">
    <thead>
    <tr>
        <th>书名</th>
        <th>作者</th>
        <th>状态</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${bookList}" var="book">
        <tr>
            <td>${book.bookname}</td>
            <td>${book.bookauthor}</td>
            <c:if test="${book.bookstatus==1}">
                <td>可借</td>
            </c:if>
            <c:if test="${book.bookstatus!=1}">
                <td>已借</td>
            </c:if>
            <td><a>编辑</a>或<span onclick="deleteBook(${book.bookid})">删除</span></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
<script>
function deleteBook(id) {
    $.post("${pageContext.request.contextPath}/book/delete/book",{bookid:id},function (result) {
        layui.layer.msg("删除成功",function () {
            window.location.reload(true);
        })
    })
}
</script>