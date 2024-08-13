package com.a138;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SecondEx implements ActionListener
{
	JFrame frame;
	JTextField tf1,tf2,tf3;
	JButton btnplus,btnminus;
	
	public SecondEx() 
	{
		frame = new JFrame();
		
		tf1 = new JTextField();
		tf1.setBounds(60, 11, 186, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(60, 42, 186, 20);
		
		tf3 = new JTextField();
		tf3.setBounds(60, 73, 186, 20);
		tf3.setEditable(false);
		
		btnplus = new JButton("+");
		btnplus.setBounds(60, 120, 68, 23);
		
		btnminus = new JButton("-");
		btnminus.setBounds(150, 120, 68, 23);
		
		btnplus.addActionListener(this);
		btnminus.addActionListener(this);
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(btnplus);
		frame.add(btnminus);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		new SecondEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		String a = tf1.getText().toString();
		String b = tf2.getText().toString();
		int c= 0;
		
		if(e.getSource()==btnplus)
		{
			
			c= Integer.parseInt(a)+Integer.parseInt(b);
		}
		if(e.getSource()==btnminus)
		{
			c= Integer.parseInt(a)-Integer.parseInt(b);
		}
		tf3.setText(String.valueOf(c));
	}
}
