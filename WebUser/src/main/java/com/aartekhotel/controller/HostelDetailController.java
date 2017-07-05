package com.aartekhotel.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.models.HostelInfo;
import com.loginservices.HostelDetailService;

@Controller
public class HostelDetailController {

  @Autowired
  private HostelDetailService hostelDetailService;
	
	@RequestMapping(value = "/hostelDetails/{hostelInfoId}", method = RequestMethod.GET)
	public String allHostel( @PathVariable("hostelInfoId") Integer hostelInfoId ,ModelMap map, HttpSession seHttpSession) {
		HostelInfo listfind=hostelDetailService.findHosteldetails(hostelInfoId);
		 System.out.println(listfind.getDetails().getRoomtype());
		  List<HostelInfo> hostelList = new ArrayList<HostelInfo>();
		  hostelList.add(listfind);
		  Set<String> sets=new HashSet<String>();
		  map.addAttribute("setList", sets);
		  map.addAttribute("findlist",hostelList);
		return "hostelDetails";
	}
	
	
}
