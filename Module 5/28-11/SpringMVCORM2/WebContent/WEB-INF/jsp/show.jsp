<%@page import="java.util.List"%>
<%@page import="com.bo.MyBo"%>
<%@page import="com.model.Person"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
	<tr><th>Id</th><th>Name</th><th>Surname</th><th>Edit</th><th>Delete</th></tr>
	
	<%
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		MyBo bo = (MyBo) acm.getBean("bo");
		List<Person>list = bo.view();
		
		for(Person p : list)
		{
			
		
	%>
		
		<tr><td><%=p.getId() %></td><td><%=p.getName() %></td><td><%=p.getSurname() %></td>
		<td>
			<form name="edit" method="post" action="edit">
					<input type="hidden" name="id" value="<%=p.getId()%>">
					<input type="submit" name="action" value="Edit">
			</form>
		</td>
		
		
		<td>
				<form name="delete" method="post" action="delete">
					<input type="hidden" name="id" value="<%=p.getId()%>">
					<input type="submit" name="action" value="Delete">
				</form>
			
		</td></tr>


	<%
		}
	%>
	
	</table>
</body>
</html>