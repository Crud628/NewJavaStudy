<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" errorPage="JspError.jsp" import="com.pojo.Member,java.util.List,java.util.ArrayList,com.server.ServiceImpl"%>
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
</body>
</html>