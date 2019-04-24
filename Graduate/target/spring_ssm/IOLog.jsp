<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  Created by IntelliJ IDEA.
  User: Creams
  Date: 2018/1/16
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

<html>
<head>
    <title>图书借进归还日志</title>
</head>
<body>
<h1 align="center">欢迎进入图书馆管理系统</h1>
<%@ include file="nav.jsp" %>
<table class="table">
    <thead>
    <tr>
        <th>书本编号</th>
        <th>书名</th>
        <th>借出时间</th>

        <th>是否归还</th>
        <th>借出人</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${bookIoList}" var="bookio">
        <th>${bookio.Bookid}</th>
        <th>${bookio.Bookname}</th>
        <th>${bookio.Borrowdata}</th>

       <c:if test="${Returndata!=null}">
        <th>${bookio.Returndata}</th>
       </c:if>
        <c:if test="${Returndata==null}">
            <th>未归还</th>
        </c:if>
        <th>${bookio.stuname}</th>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
<script>
    function deleteLog() {
        $.post("${pageContext.request.contextPath}/book/alllog/book",{bookid:id,},function (result) {
            layui.layer.msg("删除成功",function () {
                window.location.reload(true);
            })
        })
    }
</script>.
