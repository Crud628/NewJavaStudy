<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/2/26
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% session.removeAttribute("username");%>
<form action="">
    用户名<input type="text" name="username" id="username"><br>
    密码<input type="password" name="userpass" id="userpass"><br>
    <button id="btn" onclick="ajax_test()">登录</button>
    <script src="../js/loginAjax.js"></script>
</form>
</body>
</html>
