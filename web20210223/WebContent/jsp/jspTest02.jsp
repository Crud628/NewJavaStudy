<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>另外一个jsp页面</h1>
<%=session.getAttribute("session") %>
<%=application.getAttribute("application") %>
<%=request.getParameter("form") %>
</body>
</html>