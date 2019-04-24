<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="utf-8" %>
<html>
<body>
<link rel="stylesheet" href="css/login.css"  type="text/css" />
<link rel="stylesheet" href="css/bootstrap.min.css"  type="text/css" />
<script language="JavaScript" src="js/jquery-3.2.1.min.js"></script>
<script language="JavaScript" src="js/popper.min.js"></script>
<nav class="navbar navbar-expand-md bg-dark navbar-dark">
    <a class="navbar-brand" href="#">Library</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="main.jsp">首页</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="" id="navbardrop" data-toggle="dropdown">
                    图书管理
                </a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/book/all/book">查看图书总表</a>
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/book/add/book/get">添加书本</a>
                    <%--<a class="dropdown-item" href="BookAction?action=gettemp">查看预添加书本列表</a>--%>
                </div>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="" id="navbardrop" data-toggle="dropdown">
                    借书与还书
                </a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/book/borrow/book/get">借书</a>
                    <a class="dropdown-item" href="${pageContext.request.contextPath}/book/return/book/get">还书</a>
                </div>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/book/alllog/book">图书进出记录</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/user/all/user">用户管理</a>
            </li>
            <li class="nav-item dropdown" align="right">
                <a class="nav-link dropdown-toggle" href="" id="navbardrop" data-toggle="dropdown">
                    管理员
                </a>
                <div class="dropdown-menu">
                    <a class="dropdown-item" href="LoginAction?action=logout">注销</a>
                </div>
            </li>
        </ul>
        <li class="nav-item">
            <strong id="rightsize">Copyright &copy; 2018 <a href="#">Creams</a></strong>
        </li>

    </div>
</nav>
</body>
</html>