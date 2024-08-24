package com.a248;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionEx 
{
	JFrame f;  
	public OptionEx() 
	{
		f = new JFrame();
		String name=JOptionPane.showInputDialog(f,"Enter Name");     
		System.out.println(name);
	}
	public static void main(String[] args)
	{
		new OptionEx();
	}
}
