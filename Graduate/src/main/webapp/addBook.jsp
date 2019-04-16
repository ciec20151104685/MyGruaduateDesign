<%--
  Created by IntelliJ IDEA.
  User: Creams
  Date: 2018/1/11
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="utf-8"%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/addbook.css">
<script src="${pageContext.request.contextPath}/js/AddScript.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<html>
<head>
    <title>书本添加</title>
</head>
<body>
<h1 align="center">欢迎进入图书馆管理系统</h1>
<jsp:include page="nav.jsp"/>
<form action="BookAction?action=addtemp" onsubmit="return errorsubmit()" method="post">
    <div class="bookinfo">
        <div class="title">
            <span>请输入书本信息</span>
        </div>

        <div>
            <span class="infotitle">书本名称：</span><input class="required" name="bookname"><span id="booknamecheck" class="error"></span>
        </div>
        <div>
            <span class="infotitle">书本作者：</span><input class="required" name="bookauthor"><span id="bookauthorcheck" class="error"></span>
        </div>
        <div>

            <span class="infotitle">书本详情：</span><textarea name="bookdesc"></textarea><span id="bookdesccheck" class="error"></span>
        </div>
        <div class="button">
            <button type="submit"  class="btn btn-default" name="over" value="1 " onclick="getback()">完成添加</button>
            <button type="submit" class="btn btn-default" name="over" value="0" id="send" onclick="addbook()">继续添加</button>
        </div>
    </div>
</form>
</body>
</html>

<script>
    function  addbook() {
        var bookname = $("#booknameinput").val();
        var bookauthor = $("#bookauthor").val();
        //        url   参数  回掉
        $.post("${pageContext.request.contextPath}/book/add/book", {bookname: bookname, bookauthor:bookauthor}, function (result) {
            if (result == "ok"){
                window.location.href = "${pageContext.request.contextPath}/book/add/book"
            }else{
                layui.layer.msg("添加失败")
//                alert("err");
            }
        })

    }
    function  getback() {
        window.location.href = "${pageContext.request.contextPath}/book/add/book"

    }
</script>
    
