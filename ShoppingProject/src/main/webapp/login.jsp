<%@page import="com.model.SignupModel"%>
<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="m" class="com.model.SignupModel"/>
<jsp:setProperty property="*" name="m"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		SignupModel m2 = Dao.signindata(m);
		
		if(m2!=null)
		{
			session.setAttribute("project",true);
			session.setAttribute("name",m2.getName());
			session.setAttribute("email",m2.getEmail());
			session.setAttribute("phone",m2.getPhone());
			session.setAttribute("pass",m2.getPassword());
			response.sendRedirect("dashboard.jsp");
		}
		else
		{
			out.print("fail");
		}
		
	%>


</body>
</html>