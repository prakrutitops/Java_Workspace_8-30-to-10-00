<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Hello -->
	 <form action="update" name="update" method="post">
	
		<p>
			<input type="hidden" name="id" value="${tops.id}">
		</p>	
	
		<p>
		Enter Name: <input type="text" name="name" value="${tops.name}">
		</p>	
		
		<p>
		Enter Surname: <input type="text" name="surname" value="${tops.surname}">
		</p>	
		
		<p>
			<input type="submit" value="update" value="">
		</p>
	</form>
	
	
 

</body>
</html>