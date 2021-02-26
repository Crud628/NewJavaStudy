<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
</head>
<body>
<% session.removeAttribute("username");%>
<form action="../LoginUserServlet">
    用户名<input type="text" name="username"><br>
    密码<input type="password" name="userpass"><br>
    <button>登录</button>
</form>
</body>
</html>
