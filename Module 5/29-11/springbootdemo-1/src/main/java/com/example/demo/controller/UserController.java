package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.model.User;


@Controller
public class UserController {
	
	
	@RequestMapping("/")
	public String index(Model model)
	{
	
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
}
