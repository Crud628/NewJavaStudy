<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<table border="0" cellspacing="0" cellpadding="0">
	<%
		out.print("<tr>");
		for(int i = 1;i <= 9;i++){
			for(int j = 1; j <= i;j++){
				out.print("<td style='border:1px'>");
				out.print(i+"*"+j+"="+i*j+" ");
				out.print("</td>");
			}
			out.print("</tr>");
		}
	%>
</table>
<table border="1" cellspacing="0">
		<%
			for (int i = 1; i <= 9; i++) {
		%>
		<tr>
			<%
				for (int j = 1; j <= i; j++) {
			%>
                <td><%=j+"*"+i+"="+i*j %></td>
			<%
				}
			%>

		</tr>
		<%
			}
		%>
	</table>


<table>
	

</table>
</body>
</html>