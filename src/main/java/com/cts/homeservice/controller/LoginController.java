package com.cts.homeservice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.homeservice.bean.Admin;
import com.cts.homeservice.bean.User;
import com.cts.homeservice.service.AdminService;
import com.cts.homeservice.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private UserService userService;

@RequestMapping(value="index.html", method=RequestMethod.GET)
	public String getLoginPage()
	{
		return "index";
	}

@RequestMapping(value="loginUser.html", method=RequestMethod.GET)
public String getUserLogin()
{
	return "loginUser";
}


@RequestMapping(value="loginWorker.html", method=RequestMethod.GET)
public String getWorkerLogin()
{
	return "loginWorker";
}

@RequestMapping(value="loginAdmin.html", method=RequestMethod.GET)
public String getAdminLoginPage()
{
	return "loginAdmin";
}

@RequestMapping(value="AdminLogin.html", method=RequestMethod.POST)
public ModelAndView validateAdmin(@ModelAttribute Admin login,  HttpSession httpSession) 
{
	ModelAndView modelAndView = new ModelAndView();
	Admin admin1 = adminService.authenticateAdmin(login);
	if(adminService.authenticateAdmin(admin1)!=null)
	{
		modelAndView.setViewName("loginAdmin");
	}
	return modelAndView;
}

@RequestMapping(value="UserLogin.html", method=RequestMethod.POST)
public ModelAndView validateUser(@ModelAttribute User login,  HttpSession httpSession) 
{
	ModelAndView modelAndView = new ModelAndView();
	User user1 = userService.authenticateUser(login);
	if(user1.getEmail()!=null)
	{
		httpSession.setAttribute("userId", login.getEmail());
		modelAndView.setViewName("userPanel");
	}
	return modelAndView;
}

@RequestMapping(value="registerUser.html", method=RequestMethod.GET)
public String registerUser()
{
	return "registerUser";
}


}
