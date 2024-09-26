import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		return con;
	}
	

	public static int savedata(Model m)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into info (username,email,password) values (?,?,?)");
			ps.setString(1,m.getUsername());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPassword());
			
			status = ps.executeUpdate();
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	
		return status;
	}
	
	
	public static Model logindata(Model m)
	{
		Model m2 = null;
		
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("Select * from info where email=? and password=?");
			
			ps.setString(1,m.getEmail());
			ps.setString(2,m.getPassword());
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id = set.getInt(1);
				String uname = set.getString(2);
				String email = set.getString(3);
				String pass = set.getString(4);
				
				
				m2 = new Model();
				m2.setId(id);
				m2.setUsername(uname);
				m2.setEmail(email);
				m2.setPassword(pass);
			}
			else
			{
				
			}
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	
		return m2;
	}
	
	public static int addproduct(ProductModel m)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into product (pname,pprice,pdes) values (?,?,?)");
			ps.setString(1,m.getPname());
			ps.setString(2,m.getPprice());
			ps.setString(3,m.getPdes());
			
			status = ps.executeUpdate();
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	
		return status;
	}
	public static List<ProductModel> viewdata()
	{
		List<ProductModel>list = new ArrayList<>();
		Connection con = Dao.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from product");
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pdes = set.getString(4);
				
				ProductModel pm  =new ProductModel();
				pm.setId(id);
				pm.setPname(pname);
				pm.setPprice(pprice);
				pm.setPdes(pdes);
				
				list.add(pm);
			}
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		return list;
	}
	
	
	public static int deletedata(int id)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("delete from product where id=?");
			ps.setInt(1,id);
			
			
			status = ps.executeUpdate();
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	
		return status;
	}
	
	public static ProductModel editdata(int id)
	{
		
		Connection con = Dao.getconnect();
		ProductModel pm=null;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from product where id=?");
			ps.setInt(1,id);
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id2 = set.getInt(1);
				String pname = set.getString(2);
				String pprice = set.getString(3);
				String pdes = set.getString(4);
				
				pm = new ProductModel();
				pm.setId(id2);
				pm.setPname(pname);
				pm.setPprice(pprice);
				pm.setPdes(pdes);
			}
			
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	
		return pm;
	}
	
	public static int updatedata(ProductModel pm)
	{
		int status = 0;
		
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("update product set pname=?,pprice=?,pdes=? where id=?");
			ps.setString(1,pm.getPname());
			ps.setString(2,pm.getPprice());
			ps.setString(3,pm.getPdes());
			ps.setInt(4,pm.getId());
			
			
			status = ps.executeUpdate();
			
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	
		return status;
	}
	
}