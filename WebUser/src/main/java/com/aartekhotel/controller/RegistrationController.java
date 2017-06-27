package com.aartekhotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.models.Login;
import com.aartek.repository.RegistrationRepository;
import com.aartek.service.RegistrationService;

@Controller
public class RegistrationController {
	
	
	@Autowired
	RegistrationService registrationService; 

	@RequestMapping(value = "/Registration", method = RequestMethod.GET)
	public String registration(ModelMap map) {
		// seHttpSession.invalidate();
		System.out.println("registation  controller");
		Login login = new Login();
		map.put("Registration", login);
		return "Registration";
	}

	@RequestMapping(value = "/registrationSubmmit", method = RequestMethod.POST)
	public String RegistrationSubmmit(@ModelAttribute("Registration") Login login, BindingResult result) {
		        
		
		       if(registrationService.saveRegistrationform(login))
		       {
		    	   return "save";
		       }
		       else
		    	   return "does not save";
		        
	}

}
