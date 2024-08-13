package com.a138;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstEx1 implements ActionListener
{
	//declaration
	JFrame frame;
	JLabel label;
	JButton btn1,btn2,btn3,btn4;
	
	public FirstEx1() 
	{
		//initialization
		frame = new JFrame("Welcome to tops");
		
		label = new JLabel("Tops Technologies");
		label.setBounds(172, 11, 120, 23);
		
		
		btn1 = new JButton("Java");
		btn1.setBounds(53, 60, 89, 23);
		
		btn2 = new JButton("Php");
		btn2.setBounds(157, 60, 89, 23);
		
		btn3 = new JButton(".Net");
		btn3.setBounds(53, 94, 89, 23);
		
		btn4 = new JButton("Python");
		btn4.setBounds(157, 94, 89, 23);
		
		//click event of button
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(label);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) 
	{
		new FirstEx1();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==btn1)
		{
			System.out.println("Java Called");
		}
		if(e.getSource()==btn2)
		{
			System.out.println("Php Called");
		}
		if(e.getSource()==btn3)
		{
			System.out.println(".Net Called");
		}
		if(e.getSource()==btn4)
		{
			System.out.println("Python Called");
		}
	}

	
}
