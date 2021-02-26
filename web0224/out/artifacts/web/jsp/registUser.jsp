<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="../RegisUserServlet">
		<span>用户名</span>
		<input type="text" name="username" id="username"><span id="show"></span><br/>
		<span>用户密码</span>
		<input type="password" name="userpass" id="userpass"><br/>
		<button id="registBtn">注册</button>
<%--		<input type="text" id="registBtn">--%>
	</form>
<script src="../js/UserRegist.js"></script>
</body>
</html>