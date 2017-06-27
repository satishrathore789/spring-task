package com.aartekhotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.models.Login;

@Controller
public class RegistrationController {

	@RequestMapping(value = "/Registration", method = RequestMethod.GET)
	public String registration(ModelMap map) {
		// seHttpSession.invalidate();
		System.out.println("registation  controller");
		Login login = new Login();
		map.put("Registration", login);
		return "Registration";
	}
	@RequestMapping(value="/loginSubmmit",method = RequestMethod.POST)
	public String RegistrationSubmmit(@ModelAttribute("Registration") Login login,BindingResult result) {
		//seHttpSession.invalidate();
		System.out.println("login  controller");
		//Login login=new Login();
		//map.put("Login", login);
		return null;
	}
	
}
