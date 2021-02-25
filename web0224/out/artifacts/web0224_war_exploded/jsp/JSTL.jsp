<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="JspError.jsp" import="com.pojo.User" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	User u = new User();
	session.setAttribute("u", u);
%>
	JSTL(JSP Standard Tag Library)jsp标准标签库<br>
	特点&作用：JSTL标签中封装了jsp常用的核心功能 <br>
	
	使用需求<br>
	1.需要导入  standard jstl 两个jar<br>
	2.在jsp文件头中  开启taglib标签<br>
	<%session.setAttribute("demo", "ok"); %><br>
	<c:set var="UFO" scope="session">不明飞行物</c:set>
	<c:set var="demo2" scope="session" value="111" />
	<c:set target="${u}" property="username" value="张三" />
	<%-- <c:set target="${u}" property="userpass"></c:set> --%>
	
	<c:remove var="demo"/>
</body>
</html>