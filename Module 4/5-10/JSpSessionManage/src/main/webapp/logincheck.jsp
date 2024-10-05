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
		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		
		if(name.equals("tops") && pass.equals("1234"))
		{
			session.setAttribute("project", true);
			session.setAttribute("n", name);
			response.sendRedirect("dashboard.jsp");
		}
		else
		{
			out.print("Login Fail");
		}
	%>

</body>
</html>