<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>Jsp出错了</h1>
<h2>
	异常的类型是<%=exception.getClass().getName() %><br>
	异常的内容是<%=exception.getMessage() %>
</h2>
</body>
</html>