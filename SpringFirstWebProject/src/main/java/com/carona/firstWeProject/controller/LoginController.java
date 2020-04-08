package com.carona.firstWeProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.carona.firstWeProject.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/logink")
	@ResponseBody
	public String LoginMessage()
	{
		return "Hello World";
		
	}
	
	@RequestMapping(value= "/login", method=RequestMethod.GET)
	public String LoginFormMessage()
	{
		return "loginForm";
		
	}
	
	@RequestMapping(value= "/login", method=RequestMethod.POST)
	public String welcomeMessage(@RequestParam String username, @RequestParam String password, ModelMap model)
	{
		System.out.println("myuser Name : " + username);
		
		if (!loginService.validate(username, password))
		{
			model.put("errorMessage", "Invalid Credentials!");
			return "loginForm";
		}
		model.put("username", username);
		return "welcome";
	}

}
