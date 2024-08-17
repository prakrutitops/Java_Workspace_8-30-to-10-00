package com.a178;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class RadioButtonEx implements ItemListener
{
	JFrame frame;
	JRadioButton rb1,rb2;
	JPasswordField pass;
	public RadioButtonEx() 
	{
		// TODO Auto-generated constructor stub
	
		frame = new JFrame();
		
		pass = new JPasswordField();
		pass.setBounds(169, 125, 100, 50);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(169, 11, 100, 50);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(169, 75, 100, 50);
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		rb1.addItemListener(this);
		rb2.addItemListener(this);
		
		frame.add(rb1);
		frame.add(rb2);
		frame.add(pass);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
	
	
	public static void main(String[] args) 
	{
		new RadioButtonEx();
	}


	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
//		if(e.getSource()==rb1)
//		{
//			JOptionPane.showMessageDialog(frame,"You are Male");
//		}
//		else if(e.getSource()==rb2)
//		{
//			JOptionPane.showMessageDialog(frame,"You are Female");
//
//		}
//	}
		
		if(rb1.isSelected())
		{
			JOptionPane.showMessageDialog(frame,"You are Male");
		}
		else if(rb2.isSelected())
		{
			JOptionPane.showMessageDialog(frame,"You are Female");
		}
		
	}
}
