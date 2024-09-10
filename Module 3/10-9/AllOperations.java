import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AllOperations 
{
	JFrame insertframe,deleteframe,updateframe;
	JPanel jp,jp2;
	JTextField tname,tsurname,tid;
	JButton insert,delete,edit,update;
	int did=0;
	public void insertdata()
	{
		
		insertframe = new JFrame();
		
		tname = new JTextField(20);
		tsurname = new JTextField(20);
		insert = new JButton("ADD");
	
		insert.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String n = tname.getText().toString();
				String s = tsurname.getText().toString();	
			
				String dbname = "crud";
				String host="jdbc:mysql://localhost:3306/";
				String url= host+dbname;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");//package name
					Connection con = DriverManager.getConnection(url,"root","");
					
					
					String sql = "insert into myjdbc values(null,'"+n+"','"+s+"')";
					
					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						insertframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
					
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			
			}
		});
		
		insertframe.add(tname);
		insertframe.add(tsurname);
		insertframe.add(insert);
		
		insertframe.setSize(500,500);
		insertframe.setLayout(new FlowLayout());
		insertframe.setVisible(true);
	
	}
	
	public void viewdata()
	{
		String dbname = "crud";
		String host="jdbc:mysql://localhost:3306/";
		String url= host+dbname;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			String sql ="select * from myjdbc";
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(sql);
			
			System.out.println("ID"+" "+"\t NAME"+" "+"\t SURNAME");
			while(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
				
				System.out.println(id+"\t "+name+"\t "+surname);
			}
			
			
			
			
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	public void deletedata()
	{
		
		deleteframe = new JFrame();
		
		tid = new JTextField(15);
		delete = new JButton("DELETE");
		
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				String dbname = "crud";
				String host="jdbc:mysql://localhost:3306/";
				String url= host+dbname;
				
				String myid = tid.getText().toString();
				int id = Integer.parseInt(myid);
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					
					String sql = "delete from myjdbc where id='"+id+"'";
					
					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(sql);
				
					if(status>0)
					{
						deleteframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
					
					
					
				}
				catch (Exception e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		
		
		deleteframe.add(tid);
		deleteframe.add(delete);
		deleteframe.setSize(500,500);
		deleteframe.setLayout(new FlowLayout());
		deleteframe.setVisible(true);
		

		
	}
	
	public void updatedata()
	{
		updateframe = new JFrame();
		
		tid = new JTextField(10);
		tname = new JTextField(20);
		tsurname = new JTextField(20);
		edit = new JButton("EDIT");
		update = new JButton("UPDATE");
		
		jp = new JPanel();
		jp2 = new JPanel();
		
		
		jp.add(tid);
		jp.add(edit);
		
		edit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				String id = tid.getText().toString();
				did = Integer.parseInt(id);
				
				jp.setVisible(false);
				jp2.setVisible(true);
				
				String dbname = "crud";
				String host="jdbc:mysql://localhost:3306/";
				String url= host+dbname;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					String sql ="select * from myjdbc where id ='"+did+"'";
					Statement stmt = con.createStatement();
					
					ResultSet set = stmt.executeQuery(sql);
					
					
					if(set.next())
					{
						int id1 = set.getInt(1);
						String name1 = set.getString(2);
						String surname1 = set.getString(3);
						
						tname.setText(name1);
						tsurname.setText(surname1);
					}
					
					
					
					
				}
				catch (Exception e2) 
				{
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
				
				
			}
		});
		
		update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				String n = tname.getText().toString();
				String s = tsurname.getText().toString();	
			
				String dbname = "crud";
				String host="jdbc:mysql://localhost:3306/";
				String url= host+dbname;
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");//package name
					Connection con = DriverManager.getConnection(url,"root","");
					
					
					String sql = "update myjdbc set name='"+n+"',surname='"+s+"' where id='"+did+"'";
					
					Statement stmt = con.createStatement();
					int status = stmt.executeUpdate(sql);
					
					if(status>0)
					{
						updateframe.setVisible(false);
					}
					else
					{
						System.out.println("Error");
					}
					
				} 
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		
		
		jp2.add(tname);
		jp2.add(tsurname);
		jp2.add(update);
		jp2.setVisible(false);
		
		updateframe.add(jp);
		updateframe.add(jp2);
		updateframe.setSize(500,500);
		updateframe.setLayout(new FlowLayout());
		updateframe.setVisible(true);
	}
}
