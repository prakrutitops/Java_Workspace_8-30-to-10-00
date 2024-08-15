package com.a158;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEx implements ActionListener
{
	JFrame frame;
	JButton btn1,btn2;
	
	public MyEx() 
	{
		frame = new JFrame();
		
		btn1 = new JButton("Submit");
		btn1.setBounds(169, 11, 100, 50);
		btn1.addActionListener(this);
		
		btn2 = new JButton("Submit2");
		btn2.setBounds(169, 75, 100, 50);
		btn2.addActionListener(this);
		
		frame.add(btn1);
		frame.add(btn2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new MyEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btn1)
		{
			System.out.println("Clicked");
		}
		if(e.getSource()==btn2)
		{
			System.out.println("Clicked2");
		}
		
	}
}
