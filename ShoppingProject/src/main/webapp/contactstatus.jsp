<%@page import="com.model.ContactModel"%>
<%@page import="com.dao.Dao"%>
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
	String s1 = request.getParameter("status");
	String s2 = request.getParameter("id");
	int s3 = Integer.parseInt(s2);
	
	ContactModel cm = new ContactModel();
	cm.setId(s3);
	cm.setStatus(s1);
	
	int a = Dao.changestatus(cm);
	
	if(a>0)
	{
		response.sendRedirect("admincontacted.jsp");
	}
	else
	{
		out.print("fail");
	}

%>


</body>
</html>