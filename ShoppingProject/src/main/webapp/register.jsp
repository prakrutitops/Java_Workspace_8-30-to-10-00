<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	
		String fname=request.getParameter("name");  
	    String email=request.getParameter("email");  
	    String phone=request.getParameter("phone");  
		String pass=request.getParameter("password");
		String repass = request.getParameter("repassword");
		
		if(email==null||email.trim().equals(""))
	    {  
	    	out.print("<p>Please enter Email!</p>");  
	    }
		if(phone==null||phone.trim().equals(""))
		{
			out.print("<p>Please enter Phone!</p>");  
		}
		
		if(pass==null||pass.trim().equals(""))
		{
			out.print("<p>Please enter Password!</p>");  
		}
		if(repass==null||fname.trim().equals(""))
		{
			out.print("<p>Please enter Repassword!</p>");  
		} 
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingproject","root","");  
    		PreparedStatement ps=con.prepareStatement("select * from signup where email=?");  
    		ps.setString(1, email);
    		ResultSet rs=ps.executeQuery(); 
    		
    		if(rs.next()) 
      		{      	
      			out.println("<h1>Email Id Already exits, try entering new Email Address.</h1>");   	
      		}
    		else
    		{
    			//random num	
    			int n1 = 1 + (int)(9* Math.random());
    			int n2 = 1 + (int)(9* Math.random());
    			int n3 = 1 + (int)(9* Math.random());
    			int n4 = 1 + (int)(9* Math.random());
    			
    		
    			
    			System.out.print(n1+" "+n2+" "+n3+" "+n4);
    			
    			RequestDispatcher rd = request.getRequestDispatcher("EmailSendingServlet");
    			request.setAttribute("e1", email);
	    		session.setAttribute("n1",n1);
	    		session.setAttribute("n2",n2);
	    		session.setAttribute("n3",n3);
	    		session.setAttribute("n4",n4);
	    		session.setAttribute("name",fname);
    			session.setAttribute("email",email);
    			session.setAttribute("phone",phone);
    			session.setAttribute("password",pass);
	    		rd.forward(request, response);
    			
    			
    			
    			/* 
    			int data = Dao.signupdata(m);
    			
    			if(data>0)
    			{
    				response.sendRedirect("signin.jsp");
    			}
    			else
    			{
    				out.print("fail");
    			}
    			*/
    		}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	
		
	%>


</body>
</html>