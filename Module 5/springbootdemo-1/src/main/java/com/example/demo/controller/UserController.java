package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	UserService userSErvice;
	
	@RequestMapping("/")
	public String index(Model model)
	{
	
		model.addAttribute("user", new User());
		//model.addAttribute("users", userSErvice.viewAllUser());
		return "index";
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/reg")
	public String registration(@ModelAttribute("user") User u,Model model)
	{
		
		
		
		userSErvice.addorupdate(u);
		model.addAttribute("user", new User());
		//model.addAttribute("users", userSErvice.viewAllUser());
		return "index";
	}

	
	
}
