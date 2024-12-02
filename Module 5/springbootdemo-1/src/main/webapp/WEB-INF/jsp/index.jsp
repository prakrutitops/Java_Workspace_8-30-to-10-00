<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>WELCOME</h1>
	
	<form:form action="reg" method="post" modelAttribute="user">
	
	<form:label path="uname">Username</form:label>
	<form:input path="uname"/><br><br>
	<form:label path="email">Email</form:label>
	<form:input path="email"/><br><br>
	<form:label path="password">Password</form:label>
	<form:input path="password"/><br><br>
	<input type="submit">
	
	</form:form>
	
	
	
	
	

</body>
</html>