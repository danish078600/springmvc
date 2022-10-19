<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>HomePage</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>
	
	<%
		String name=(String) request.getAttribute("name");
		List<String> friends=(List<String>)request.getAttribute("f");
		
	%>
	<h1>name is <%=name %> <br>
		my friends are
		<%
			for(String s:friends)
			{
		%>
				<h1>
					<%=s %>
				</h1>
		<% 		
			}
		%>
	</h1>
	
</body>
</html>