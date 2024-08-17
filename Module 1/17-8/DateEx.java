package com.a178;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import net.sourceforge.jdatepicker.JDatePicker;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class DateEx 
{
	JFrame frame;
	
	
	public DateEx() 
	{
		frame = new JFrame();
		
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		datePicker.setBounds(169, 11, 100, 50);
		
		
		frame.add(datePicker);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new DateEx();
	}
}
