package com.a158;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CheckboxEx2 implements ActionListener
{
	JFrame frame;
	JCheckBox chk1,chk2,chk3;
	JLabel l1;
	JButton btn1;
	
	public CheckboxEx2() 
	{
		frame = new JFrame();
		
		l1 = new JLabel("Cafe Ordering System");
		l1.setBounds(182, 11, 146, 14);
		
		chk1 = new JCheckBox("Pizza @ Rs. 100");
		chk1.setBounds(169, 35, 150, 30);

		chk2 = new JCheckBox("Burger @ Rs. 70");
		chk2.setBounds(169, 75, 150, 30);
		
		chk3 = new JCheckBox("Coffee @ Rs. 120");
		chk3.setBounds(169, 115, 150, 30);
		
		btn1 = new JButton("Order");
		btn1.setBounds(169, 175, 100, 30);
		btn1.addActionListener(this);
		
		frame.add(l1);
		frame.add(chk1);
		frame.add(chk2);
		frame.add(chk3);
		frame.add(btn1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new CheckboxEx2();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		int total=0;
		int amount =0;
		String data="";
		
		if(e.getSource()==btn1)
		{
			if(chk1.isSelected())
			{
				amount+=100;
				data+="\n Pizza @ Rs.100";
			}
			if(chk2.isSelected())
			{
				amount+=70;
				data+="\n Burger @ Rs.70";
			}
			if(chk3.isSelected())
			{
				amount+=120;
				data+="\n Coffee @ Rs.120";
			}
			
			total = amount;
			//System.out.println(data+"\n Total: "+amount);
			JOptionPane.showMessageDialog(frame,data+"\n Total: "+amount);
		}
	}
	
}
