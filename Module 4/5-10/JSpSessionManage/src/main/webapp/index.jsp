<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		if(session.getAttribute("project")!=null)
		{
			response.sendRedirect("dashboard.jsp");
		}
		else
		{
			
		
	%>
	

	<form action="logincheck.jsp">
		<p>
			Enter Your name:<input type="text" name="name">
		</p>
		<p>
			Enter Your Password:<input type="text" name="password">
		</p>
		<p>
			<input type="submit" value="Login">
		</p>
	</form>

<%
		}
%>
</body>
</html>