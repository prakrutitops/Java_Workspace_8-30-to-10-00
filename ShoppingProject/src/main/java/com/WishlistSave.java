package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet("/WishlistSave")
@MultipartConfig(maxFileSize=16177216)
public class WishlistSave extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		HttpSession ss = req.getSession(false);
		
		if(ss != null)
		{
			String usl = "jdbc:mysql://localhost:3306/shoppingproject";
			String user = "root";
			String pass = "";
		
			Part p = req.getPart("p_image");
			String name = req.getParameter("p_name");
			String price = req.getParameter("p_price");
			String description = req.getParameter("p_des");
			String email = req.getParameter("email");
			
			int r = 0;
			Connection con = null;
			
			if(p!=null)
			{
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection(usl, user, pass);
					
					PreparedStatement ps = con.prepareStatement("insert into wishlist(p_name,p_price,p_des,p_image,email) values(?,?,?,?,?)");
				
					InputStream io = p.getInputStream();
					
					ps.setString(1, name);
					ps.setString(2, price);
					ps.setString(3, description);
					ps.setBlob(4,io);
					ps.setString(5, email);
					
					r = ps.executeUpdate();
					
					if(r>0)
					{
						System.out.println("done");
						resp.sendRedirect("wishlist.jsp");
					}
					else
					{
						System.out.println("error");
					}
					
					
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
			else
			{
				out.print("Not Able to Fetch Image");
			}
			
			
			
		}
	}
}
