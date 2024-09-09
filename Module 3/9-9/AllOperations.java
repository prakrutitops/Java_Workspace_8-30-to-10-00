import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AllOperations 
{
	JFrame insertframe;
	
	JTextField tname,tsurname;
	JButton insert;
	
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
}
