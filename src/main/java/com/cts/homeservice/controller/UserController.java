package com.cts.homeservice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.homeservice.bean.Services;
import com.cts.homeservice.bean.User;
import com.cts.homeservice.service.ServiceDetails;
import com.cts.homeservice.service.ServiceDetailsImpl;


@Controller
public class UserController {
	
	@Autowired
	private ServiceDetails serviceDetailsImpl;

	
	@RequestMapping(value="userPanelProfile.html", method=RequestMethod.GET)
	public String getUserPanelProfile()
	{
		return "userPanelProfile";
	}
	
	
	
	@RequestMapping(value="userRequestStatus.html", method=RequestMethod.GET)
	public String getUserRequestStatus()
	{
		return "userRequestStatus.html";
	}
	

	@RequestMapping(value="request.html", method=RequestMethod.GET)
	public String getRequest()
	{
		return "request.html";
	}
	
	@RequestMapping(value="ElectricianServiceDetails.html", method=RequestMethod.GET)
	public ModelAndView electricianServiceDetails(Model model, HttpSession httpSession) 
	{
		ModelAndView modelAndView = new ModelAndView();
Services service = serviceDetailsImpl.serviceDesc("Electrician");
modelAndView.addObject("services", service);
modelAndView.setViewName("userPanel");
return modelAndView;
		
	}
	
}
