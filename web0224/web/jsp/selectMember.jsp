<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="JspError.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("uname",session.getAttribute("username"));
%>
	<form action="../MemberOne">
		<input type="text" name="ids">
		<button>查询</button>
	</form>
<c:if test="${not empty uname}">
	<c:out value="${uname}，已登录"></c:out>
	<input type="button" value="退出登录" onclick="login()">
</c:if>
<c:if test="${empty uname}">
	<c:out value="退出登录"></c:out>
</c:if>
<script src="../js/ExitLogin.js"></script>
</body>
</html>