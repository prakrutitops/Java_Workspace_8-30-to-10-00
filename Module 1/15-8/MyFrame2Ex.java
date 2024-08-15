package com.a158;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MyFrame2Ex implements ActionListener
{
	JFrame frame;
	JTextArea ta;
	JButton btncount; 
	JLabel l1,l2;
	
	public MyFrame2Ex() 
	{
		frame = new JFrame();
		
		ta = new JTextArea();
		ta.setBounds(63, 11, 288, 140);
		
		btncount = new JButton("Count");
		btncount.setBounds(164, 174, 89, 23);
		
		btncount.addActionListener(this);
		
		l1 = new JLabel("");
		l1.setBounds(79, 216, 150, 14);

		l2 = new JLabel("");
		l2.setBounds(252, 216, 100, 14);
		
		frame.add(ta);
		frame.add(btncount);
		frame.add(l1);
		frame.add(l2);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new MyFrame2Ex();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		if(e.getSource()==btncount)
		{
			String data = ta.getText().toString();
			String words[]=data.split("\\s");
			
			
			l1.setText("Characters are :"+data.length());
			l2.setText("Words are :"+words.length);
		}
	}
}
