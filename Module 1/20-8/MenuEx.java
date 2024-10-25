package com.a208;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MenuEx extends WindowAdapter implements ActionListener
{
	JFrame frame;
	JTextArea ta;
	JMenuBar mb;
	JMenu File,Edit,Help;
	JMenuItem cut,copy,paste,selectall;	
	
	public MenuEx() 
	{
		frame = new JFrame("");
		
		ta = new JTextArea();
		
		mb = new JMenuBar();
		
		File = new JMenu("File");
		Edit = new JMenu("Edit");
		Help = new JMenu("Help");
		
		cut = new JMenuItem("cut");
		copy = new JMenuItem("copy");
		paste = new JMenuItem("paste");
		selectall = new JMenuItem("select all");
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectall.addActionListener(this);
	
		Edit.add(cut);
		Edit.add(copy);
		Edit.add(paste);
		Edit.add(selectall);
		
		mb.add(File);
		mb.add(Edit);
		mb.add(Help);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.add(ta);
		frame.addWindowListener(this);
		frame.setSize(500,500);
		frame.setJMenuBar(mb);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new MenuEx();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==cut)
		{
			ta.cut();
		}
		if(e.getSource()==copy)
		{
			ta.copy();
		}
		if(e.getSource()==paste)
		{
			ta.paste();
		}
		if(e.getSource()==selectall)
		{
			ta.selectAll();
		}
		
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		// TODO Auto-generated method stub
		//super.windowClosing(e);
		int a = JOptionPane.showConfirmDialog(frame,"Are you sure you want to exit?");
	
		if(a== JOptionPane.YES_OPTION)
		{
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		if(a== JOptionPane.NO_OPTION)
		{
			
		}

		if(a== JOptionPane.CANCEL_OPTION)
		{
			
		}
		
	}
	
	
}
