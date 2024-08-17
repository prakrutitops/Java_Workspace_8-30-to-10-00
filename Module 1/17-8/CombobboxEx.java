package com.a178;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class CombobboxEx 
{
	JFrame frame;
	JComboBox<String>cb;
	String city[]= {"Rajkot","Baroda","Surat"};
	JButton btn;
	
	public CombobboxEx() 
	{
		frame = new JFrame();
		
		cb = new JComboBox<>(city);
		cb.setBounds(120, 11, 150, 20);
		
		btn = new JButton("Submit");
		btn.setBounds(285, 11, 80, 20);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				System.out.println("Selected City is : "+cb.getItemAt(cb.getSelectedIndex()));
				
			}
		});
		
		frame.add(cb);
		frame.add(btn);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new CombobboxEx();
	}
}
