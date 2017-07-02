package com.adminController;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.models.AdminLogin;
import com.adminService.AdminLoginService;

@Controller
public class AdminController {
	
	@Autowired
	private AdminLoginService adminLoginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap map, HttpSession seHttpSession) {
		// seHttpSession.invalidate();
		System.out.println("login  controller");
		AdminLogin adminLogin = new AdminLogin();
		map.put("adminLogin", adminLogin);
		return "login";
	}

	@RequestMapping(value = "/loginSubmmit", method = RequestMethod.POST)
	public String loginSubmmit(@ModelAttribute("adminLogin") AdminLogin login , ModelMap model  ) {
		// seHttpSession.invalidate();
		       List list= adminLoginService.findAdmin(login);
		       if(!list.isEmpty())
		
		return "redirect:/adminBoard.do";
		       else
		       {
		    	   return "login";
		       }
	}

}
