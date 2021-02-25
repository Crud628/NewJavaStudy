<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.server.ServiceImpl,com.pojo.Member"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${not empty member}">
		<c:out value="${member.id}"></c:out>
		<c:out value="${member.name}"></c:out>
		<c:out value="${member.sex}"></c:out>
	</c:if>
	<c:if test="${empty member}">
		<c:out value="该id无员工"  />
	</c:if>
	
</body>
</html>