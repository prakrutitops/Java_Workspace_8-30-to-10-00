package com.a248;

import java.awt.*;
import java.awt.Image;


import javax.swing.*;

public class DisplayImgEx extends Canvas
{
	@Override
	public void paint(Graphics g) 
	{
		 Toolkit t=Toolkit.getDefaultToolkit();  
	     Image i=t.getImage("D:\\photos\\a.jpg");  
	     g.drawImage(i, 120,100,this);  
	}
	public static void main(String[] args) 
	{
		DisplayImgEx m=new DisplayImgEx();  
	    JFrame f=new JFrame();  
	    f.add(m);  
	    f.setSize(400,400);  
	    f.setVisible(true);  
	}
}
