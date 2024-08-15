package com.a158;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckboxEx implements ItemListener
{
	JFrame frame;
	JCheckBox chk1,chk2;
	
	public CheckboxEx() 
	{
		frame = new JFrame();
		
		chk1 = new JCheckBox("Java");
		chk1.setBounds(169, 11, 100, 50);

		chk2 = new JCheckBox("Php");
		chk2.setBounds(169, 75, 100, 50);
		
		
		chk1.addItemListener(this);
		chk2.addItemListener(this);

		frame.add(chk1);
		frame.add(chk2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new CheckboxEx();
	}
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==chk1)
		{
			System.out.println("Checked");
		}
		if(e.getSource()==chk2)
		{
			System.out.println("Checked");
		}
			
	}
}
