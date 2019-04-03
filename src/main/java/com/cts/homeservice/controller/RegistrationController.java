package com.cts.homeservice.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.homeservice.bean.Admin;
import com.cts.homeservice.bean.User;
import com.cts.homeservice.bean.Worker;
import com.cts.homeservice.service.RegisterUserService;
import com.cts.homeservice.service.UserService;
import com.cts.homeservice.service.WorkerService;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private WorkerService workerService;
	
	@Autowired
	private RegisterUserService registerUserService;
	
	@RequestMapping(value="registerWorker.html", method=RequestMethod.GET)
	public String getRegisterWorker()
	{
		return "registerWorker";
	}
	
	@RequestMapping(value="RegisterUser.html", method=RequestMethod.POST)
	public ModelAndView validateAdmin(@ModelAttribute User register,  HttpSession httpSession) 
	{
		ModelAndView modelAndView = new ModelAndView();
//		String str = registerUserService.registerUser(register);
		if(registerUserService.registerUser(register).equals("success"))
		{
			modelAndView.setViewName("loginUser");
		}
		return modelAndView;
	}
	
	@RequestMapping(value="workerRegistration.html", method=RequestMethod.POST)
	public ModelAndView workerRegistration(@ModelAttribute Worker worker,  HttpSession httpSession,@RequestParam(value="skills")String skills ) 
	{
		ModelAndView modelAndView = new ModelAndView();
		if(!workerService.checkUser(worker.getEmail())){
			int id = workerService.getLastId();
			worker.setUserId(id+"");
			worker.setSkills(skills);
		if("success".equals(workerService.addUser(worker)))
			modelAndView.setViewName("userDashboard");
		}
		else	
		{
			modelAndView.addObject("error", "EmailId Already Exists!!");
			modelAndView.addObject("worker", worker);
			modelAndView.setViewName("userRegistration");
		}
		return modelAndView;
	}


}
