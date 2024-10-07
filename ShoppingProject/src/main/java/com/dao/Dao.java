package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.SignupModel;

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
	
}
