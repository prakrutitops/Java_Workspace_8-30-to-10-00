package com;

import java.io.IOException;
import java.io.InputStream;
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

@WebServlet("/ProductSaveAdmin")
@MultipartConfig(maxFileSize=16177216)
public class ProductSaveAdmin extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
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
		
		int r = 0;
		Connection con = null;
		
		
		if(p!=null)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(usl, user, pass);
				
				PreparedStatement ps = con.prepareStatement("insert into products(p_name,p_price,p_des,p_image) values(?,?,?,?)");
				
				InputStream io = p.getInputStream();
				
				ps.setString(1, name);
				ps.setString(2, price);
				ps.setString(3, description);
				ps.setBlob(4,io);
				
				
				int status = ps.executeUpdate();
				
				if(status>0)
				{
					System.out.println("done");
					resp.sendRedirect("adminviewproducts.jsp");
				}
				else
				{
					System.out.println("error");
				}
				
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			
		}
		
		
		
		}
		else
		{
			
		}
	}
}
