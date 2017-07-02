package com.aartekhotel.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.models.Login;
@Controller
public class DeshboardController {
	
	@RequestMapping(value = "/hostels", method = RequestMethod.GET)
	public String allHostel(ModelMap map, HttpSession seHttpSession) {
		// seHttpSession.invalidate();
		/*System.out.println("login  controller");
		Login login = new Login();
		map.put("Login", login);*/
		return "hostels";
	}
	
	@RequestMapping(value = "/hostelsboys", method = RequestMethod.GET)
	public String boysHostel(ModelMap map, HttpSession seHttpSession) {
		// seHttpSession.invalidate();
		/*System.out.println("login  controller");
		Login login = new Login();
		map.put("Login", login);*/
		return "hostels";
	}
	
	@RequestMapping(value = "/hostelsgirls", method = RequestMethod.GET)
	public String girlsHostel(ModelMap map, HttpSession seHttpSession) {
		// seHttpSession.invalidate();
		/*System.out.println("login  controller");
		Login login = new Login();
		map.put("Login", login);*/
		return "hostels";
	}

}
