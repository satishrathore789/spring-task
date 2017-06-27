package com.aartekhotel.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.models.Login;

@Controller
public class WelcomeController {
	
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String login(ModelMap map, HttpSession seHttpSession) {
		// seHttpSession.invalidate();
		return "welcome";
	}
	

}
