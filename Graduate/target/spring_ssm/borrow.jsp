<%--
  Created by IntelliJ IDEA.
  User: Creams
  Date: 2018/1/15
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/borrow.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/InfoScript.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>


<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<html>
<head>
    <title>书本借出记录登记表</title>
</head>
<body>
<h1 align="center">欢迎进入图书馆管理系统</h1>
<jsp:include page="nav.jsp"/>
<div class="borrowinfo">
    <div class="title">
        书本借出记录登记表
    </div>

        <div>
            <span class="infotitle">读者学号：</span><input type="text" onkeyup="readercheck()" name="studentid" id="studentid"><span id="readeridcheck" class="error"></span>
        </div>

        <div>
            <span class="infotitle">书本编号：</span><input type="text" name="bookid" onkeyup="bookcheck()" id="bookid"><span id="bookidcheck" class="error"></span>
        </div>
        <div class="button">
            <button class="btn btn-success" onclick="submit()">提交</button>
            <button type="reset" class="btn btn-default" onclick="getback">重填</button>
        </div>

</div>
</body>
</html>
<script>
    function submit() {

        var bookid = $("#bookid").val();
        var studentid = $("#studentid").val();
        var borrowdata = "";


        //        url   参数  回掉
        $.post("${pageContext.request.contextPath}/book/borrow/book", {bookid: bookid, studentid:studentid}, function (result) {
            if (result == "ok"){
                window.location.href = "${pageContext.request.contextPath}/book/borrow/book/get"
            }else{
                layui.layer.msg("借书失败")
//                alert("err");
            }
        })


    }
    function  getback() {
        window.location.href = "${pageContext.request.contextPath}/book/borrow/book/get"

    }
</script>
