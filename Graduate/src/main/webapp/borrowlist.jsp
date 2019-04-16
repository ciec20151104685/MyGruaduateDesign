<%@ page import="java.util.ArrayList" %>
<%@ page import="Entity.Log" %><%--
  Created by IntelliJ IDEA.
  User: Creams
  Date: 2018/1/18
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<html>
<head>
    <title>待还图书列表</title>
</head>
<%
    request.setCharacterEncoding("utf-8");
    if(session.getAttribute("adminname") == null){
        response.sendRedirect("/Library/index.jsp");
    }
%>
<body>
<h1 align="center">欢迎进入图书馆管理系统</h1>
<%@ include file="nav.jsp" %>
<table class="table">
    <thead>
    <tr>
    <tr>
    <tr>
        <th>学号</th>
        <th>书号</th>
        <th>书名</th>
        <th>借书日期</th>
    </tr>
    </tr>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${borrowbookList}" var="borrowbook">
        <tr>
            <td>${borrowbook.studentid}</td>
            <td>${borrowbook.bookid}</td>
            <td>${borrowbook.bookname}</td>
            <td>${borrowbook.borrowdata}</td>

            <td><a>编辑</a>或<span onclick="deleteBorrowBook(${borrowbook.bookid})">还书</span></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
<script>
    console.log('${pageContext.request.contextPath}/js/jquery-3.3.1/jquery-3.3.1.js');
    function deleteBorrowBook(id) {
        $.post("${pageContext.request.contextPath}/book/return/book",{bookid:id},function (result) {
            layui.layer.msg("还书成功",function () {
                window.location.reload(true);
            })
        })
    }
</script>.