package com.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TestTag extends SimpleTagSupport{

	@Override
	public void doTag() throws JspException, IOException {
	JspWriter out = getJspContext().getOut();
	out.print("This is a test");
	
	}
	
}
