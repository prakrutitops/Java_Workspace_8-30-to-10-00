package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bo.MyBo;
import com.model.Person;

@Controller
public class MyController 
{

	@RequestMapping(value="/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public String insert(HttpServletRequest request,HttpServletResponse response,ModelMap map )
	{
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		
		Person p = new Person();
		p.setName(request.getParameter("name"));
		p.setSurname(request.getParameter("surname"));
		
		MyBo bo = (MyBo) acm.getBean("bo");
		bo.insert(p);
		
		return "show";
	}
	
	@RequestMapping(value="/show")
	public String show()
	{
		return "show";
	}
	
	@RequestMapping(value="/delete",method = RequestMethod.POST)
	public String delete(HttpServletRequest request,HttpServletResponse response,ModelMap map )
	{
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		
		Person p = new Person();
		p.setId(id2);
		
		MyBo bo = (MyBo) acm.getBean("bo");
		bo.delete(p);
		
		return "show";
	}
	
}
