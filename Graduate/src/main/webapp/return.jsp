<%--
  Created by IntelliJ IDEA.
  User: Creams
  Date: 2018/1/17
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/returnpage.css">
<script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/return.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<html>
<head>
    <title>图书归还</title>
</head>
<body>
<h1 align="center">欢迎进入图书馆管理系统</h1>
<jsp:include page="nav.jsp"/>
</body>
<div class="returninfo">
    <div class="title">
        请输入读者学号
    </div>
    <form action="ReaderAction?action=GetBorrowListById" onsubmit="return errorsubmit()" method="post">
        <div>
            <span class="infotitle">读者学号：</span><input type="text" onkeyup="readercheck()" name="studentid" id="readerid"><span id="readeridcheck" class="error"></span>
        </div>
    <div>
        <span class="infotitle">书本编号：</span><input type="text" name="bookid" onkeyup="bookcheck()" id="bookid"><span id="bookidcheck" class="error"></span>
    </div>
        <div class="button">
            <button type="submit" class="btn btn-success" onclick="returnbook()">提交</button>
            <button type="reset" class="btn btn-default" onclick="getback()">重填</button>
        </div>
    </form>
</div>
</html>
<script>
    function  returnbook() {
        var studentid = $("#studentid").val();
        var bookid = $("#bookid").val();
        //        url   参数  回掉
        $.post("${pageContext.request.contextPath}/book/return/book", {bookname: bookname, bookauthor:bookauthor}, function (result) {
            if (result == "ok"){
                window.location.href = "${pageContext.request.contextPath}/book/return/book"
            }else{
                layui.layer.msg("删除失败失败")
//                alert("err");
            }
        })

    }
    function  getback() {
        window.location.href = "${pageContext.request.contextPath}/book/borrow/book"

    }
</script>

