<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="JspError.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Jsp(Java server page 动态网页技术)</h1>
	Jsp本质   Servlet
	
	jsp的输出:<br>
	method 1<br>
	<%
		String str = "Jsp测试";
		out.print(str);
	%>
	<br>
	method 2<br>
	<%="Jsp测试02" %><br>
	
	jsp的注释<br>
	<!-- 第一段文字 -->
	<%-- 第二段文字 --%>
	<br>
	<%=5/5 %>
	
	jsp的拼接
	<jsp:include page="jspTest02.jsp"></jsp:include>
	<jsp:include page="jspTest02.jsp"></jsp:include>
	<jsp:include page="jspTest02.jsp"></jsp:include>
	<jsp:include page="jspTest02.jsp"></jsp:include>
	
	jsp 内置对象<br>
	out 输出<br>
	exception  异常处理<br>
	
	<% session.setAttribute("session", "session"); %>
	<% application.setAttribute("application", "application"); %>
	<form action="jspTest02.jsp">
		<input type="text" name="form">
		<button>jsp02</button>
	</form>
	
	
</body>
</html>