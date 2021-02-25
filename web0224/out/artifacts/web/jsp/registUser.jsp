<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="../Servlet/RegisUserServlet">
		<span>用户名</span>
		<input type="text" name="username"><br/>
		<span>用户密码</span>
		<input type="password" name="userpass"><br/>
		<button>注册</button>
	</form>
</body>
</html>