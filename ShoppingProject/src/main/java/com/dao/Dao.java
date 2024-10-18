package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.model.CartModel;
import com.model.ProductModel;
import com.model.SignupModel;
import com.model.WishlistModel;

public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingproject","root","");

		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	public static int signupdata(SignupModel m)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into signup(name,email,phone,password) values (?,?,?,?)");
			ps.setString(1,m.getName());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPhone());
			ps.setString(4,m.getPassword());
			
			status = ps.executeUpdate();
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static SignupModel signindata(SignupModel m)
	{
		
		
		Connection con = Dao.getconnect();
		
		SignupModel m2=null;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from signup where email=? and password=?");
			ps.setString(1,m.getEmail());
			ps.setString(2,m.getPassword());
			
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String name= set.getString(2);
				String email= set.getString(3);
				String phone= set.getString(4);
				String password= set.getString(5);
			
				m2 = new SignupModel();
				m2.setId(id);
				m2.setName(name);
				m2.setEmail(email);
				m2.setPhone(phone);
				m2.setPassword(password);
			}
			
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m2;
	}
	
	public static List<ProductModel>viewproducts()
	{
		List<ProductModel>list = new ArrayList<>();
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from products");
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				
				int id = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pdes = set.getString(4);
				//String pimage = set.getString(5);
				byte[] imgData = set.getBytes("p_image");
				
				ProductModel pm = new ProductModel();
				pm.setId(id);
				pm.setP_name(pname);
				pm.setP_price(pprice);
				pm.setP_des(pdes);
				//pm.setP_image(pimage);

				 // blob field 
		         String encode = Base64.getEncoder().encodeToString(imgData);
		         pm.setP_image(encode);
				
				
				list.add(pm);
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static ProductModel getproductindexwise(int id)
	{
		ProductModel pm = null;
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from products where id=?");
			ps.setInt(1, id);
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id1 = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pdes = set.getString(4);
				byte[] imgData = set.getBytes("p_image");
				
				pm = new ProductModel();
				pm.setId(id1);
				pm.setP_name(pname);
				pm.setP_price(pprice);
				pm.setP_des(pdes);
				String encode = Base64.getEncoder().encodeToString(imgData);
		        pm.setP_image(encode);
			}
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pm;
	}
	
	public static List<WishlistModel>wishlistbyemail(String email)
	{
		List<WishlistModel>list = new ArrayList<>();
		Connection con = Dao.getconnect();
		WishlistModel wm = null;
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from wishlist where email=?");
			ps.setString(1, email);
			
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id1 = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pdes = set.getString(4);
				byte[] imgData = set.getBytes("p_image");
				String email1 = set.getString(6);
				
				wm = new WishlistModel();
				wm.setId(id1);
				wm.setP_name(pname);
				wm.setP_price(pprice);
				wm.setP_des(pdes);
				
				String encode = Base64.getEncoder().encodeToString(imgData);
				wm.setP_image(encode);
				wm.setEmail(email1);
				
				list.add(wm);
			}
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	public static List<CartModel>cartbyemail(String email)
	{
		List<CartModel>list = new ArrayList<>();
		Connection con = Dao.getconnect();
		CartModel wm = null;
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from cart where email=?");
			ps.setString(1, email);
			
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id1 = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pdes = set.getString(4);
				byte[] imgData = set.getBytes("p_image");
				String email1 = set.getString(6);
				
				wm = new CartModel();
				wm.setId(id1);
				wm.setP_name(pname);
				wm.setP_price(pprice);
				wm.setP_des(pdes);
				
				String encode = Base64.getEncoder().encodeToString(imgData);
				wm.setP_image(encode);
				wm.setEmail(email1);
				
				list.add(wm);
			}
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static WishlistModel getitemindexwise(int id)
	{
		WishlistModel pm = null;
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from wishlist where id=?");
			ps.setInt(1, id);
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id1 = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pdes = set.getString(4);
				byte[] imgData = set.getBytes("p_image");
				
				pm = new WishlistModel();
				pm.setId(id1);
				pm.setP_name(pname);
				pm.setP_price(pprice);
				pm.setP_des(pdes);
				String encode = Base64.getEncoder().encodeToString(imgData);
		        pm.setP_image(encode);
			}
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pm;
	}
}
