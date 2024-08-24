package com.a248;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.*;

public class DigitalWatchEx implements Runnable
{
	JFrame f;  
	JButton b;  
	Thread t=null;  
	int hours=0, minutes=0, seconds=0;  
	String timeString = "";  
	
	public DigitalWatchEx() 
	{
		  f=new JFrame();  
	      
		  b=new JButton();  
	      b.setBounds(100,100,100,50);  
	
	      t = new Thread(this);  
	      t.start();  
	      
	      f.add(b);  
	      f.setSize(300,400);  
	      f.setLayout(null);  
	      f.setVisible(true);  
	}
	
	
	public static void main(String[] args) 
	{
		new DigitalWatchEx();
	}


	@Override
	public void run() 
	{
		
		try
		{
			while(true)
			{
				Calendar cal = Calendar.getInstance();
				//cal.getInstance();
//				cal.get(Calendar.DATE);
//				cal.get(Calendar.DAY_OF_MONTH);
//				cal.get(Calendar.YEAR);
				hours = cal.get(Calendar.HOUR_OF_DAY);  
				if ( hours > 12 ) hours -= 12; 
				minutes = cal.get( Calendar.MINUTE );  
	            seconds = cal.get( Calendar.SECOND );  
			
	            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
	           
	            Date date = cal.getTime();
	            timeString = formatter.format(date);
	              
	             
	            printTime();
	            
	            t.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void printTime()
	{  
		b.setText(timeString);  
	}  
}
