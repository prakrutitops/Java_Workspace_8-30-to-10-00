<%@page import="com.model.ProductModel"%>
<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

	.swd-button 
			{
				background: #f2db18;
				border: 1px solid white;
				border-radius: 5px;
				color: white;
				display: inline-block;
				font: bold 12px Arial, Helvetica, sans-serif;
				padding: 10px 15px;
				text-decoration: none;
				text-transform: uppercase;
				margin-top: 15px;
			}
</style>
</head>
<body>

	<jsp:include page="header.jsp"/>

	<%
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		System.out.print(id2);
		
		ProductModel pm = Dao.getproductindexwise(id2);
	
	
		
	%>
	
	<center>
		<img src="data:image/jpeg;base64,<%=pm.getP_image()%>" width="150px" height="200px" style="margin-top: 30px;" />
		
		<h2><%=pm.getP_name() %></h2>
		<h2><%=pm.getP_price() %></h2>
		
		<form action="WishlistSave" method="post" enctype="multipart/form-data">
			
			<input type="hidden" name="id" value="<%=pm.getId()%>">
			<input type="hidden" name="p_name" value="<%=pm.getP_name()%>">
			<input type="hidden" name="p_price" value="<%=pm.getP_price()%>">
			<input type="hidden" name="p_des" value="<%=pm.getP_des()%>">
			<input type="hidden" name="p_image" value="<%=pm.getP_image()%>">
			<input type="hidden" name="email" value="<%=session.getAttribute("email")%>">
			<input type="submit" value="Add to Wishlist" class="swd-button">
			
		</form>
		
	</center>
	<jsp:include page="footer.jsp"/>
</body>
</html>