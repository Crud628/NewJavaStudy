<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="JspError.jsp" import="com.idea.pojo.Member,java.util.List,java.util.ArrayList,com.idea.server.ServiceImpl"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		ServiceImpl	ss = new ServiceImpl();
		ArrayList<Member> members = ss.queryAll();
		request.setAttribute("ms", members);
	%>
	<table border="1" cellspacing ="0" cellpadding="0">
	<tr>
		<th>ID</th>
		<th>姓名</th>
		<th>性别</th>
		<th>薪资</th>
		<th>部门</th>
		<th>年龄</th>
	</tr>
		<%
			for(int i = 0;i < members.size();i++){
				out.print("<tr><td>"
							+members.get(i).getId()+"</td><td>"
							+members.get(i).getName()+"</td><td>"
							+members.get(i).getSex()+"</td><td>"
							+members.get(i).getSalary()+"</td><td>"
							+members.get(i).getDepartment()+"</td><td>"
							+members.get(i).getAge()+"</td></tr>");
			}
			
		%>
		
		
	</table>
		<table border="1" cellspacing ="0" cellpadding="0">
	<tr>
		<th>ID</th>
		<th>姓名</th>
		<th>性别</th>
		<th>薪资</th>
		<th>部门</th>
		<th>年龄</th>
	</tr>
	<c:forEach items="${ms}" var="m">
		<tr>
			<td><c:out value="${m.id}" /></td>
			<td><c:out value="${m.name}" /></td>
			<td><c:out value="${m.sex}" /></td>
			<td><c:out value="${m.salary}" /></td>
			<td><c:out value="${m.department}" /></td>
			<td><c:out value="${m.age}" /></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>