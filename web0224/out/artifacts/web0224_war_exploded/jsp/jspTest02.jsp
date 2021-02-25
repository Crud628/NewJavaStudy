<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.Date" import="java.util.Enumeration"%>
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
<%=pageContext.getSession().getAttribute("session") %>
<% 
	Date a = new Date();
	out.print(a);
%>
<%-- pageContext.getResponse().setHeader("refresh","1"); --%>
<% 
	response.setHeader("refresh","1"); 
	
%>
<% 
	
	Enumeration e=session.getAttributeNames(); 
	while(e.hasMoreElements()){
		out.print(e.nextElement());
	}
%>
</body>
</html>