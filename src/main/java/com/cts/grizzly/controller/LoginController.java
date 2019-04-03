//package com.cts.grizzly.controller;
//
//import java.util.List;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.cts.grizzly.bean.Category;
//import com.cts.grizzly.bean.Login;
//import com.cts.grizzly.bean.Product;
//import com.cts.grizzly.bean.Profile;
//import com.cts.grizzly.service.CategoryService;
//import com.cts.grizzly.service.LoginService;
//import com.cts.grizzly.service.ProductService;
//
//@Controller
//public class LoginController {
//
//	@Autowired
//	private LoginService loginService;
//	
//	@Autowired
//	private CategoryService categoryService;
//	
//	@Autowired
//	private ProductService productService;
//	@RequestMapping(value="login.html", method=RequestMethod.GET)
//	
//	public String getLoginPage()
//	{
//		return "login";
//	}
//	
//	@RequestMapping(value="login.html", method=RequestMethod.POST)
//	public ModelAndView validateUser(@ModelAttribute Profile profile,  HttpSession httpSession) 
//	{
//		ModelAndView modelAndView = new ModelAndView();
//		
//		
//		Profile profile1 =loginService.authenticateUser(profile);
//		
//		
//	if(loginService.authenticateUser(profile)!=null)
//	{
//		if(loginService.getUserType(profile1).equals("A")  && loginService.getUserStatus(profile1)<=2)
//		{
//			loginService.resetStatus(profile1);
//			
//		//String username = profile.getUserName();
//		//httpSession.setAttribute("user", profile1);
//		List<Product> products = productService.getAllProducts();
//		List<Category> category = categoryService.getCategory();
//		modelAndView.addObject("products", products);
//		httpSession.setAttribute("user", profile1);
//		httpSession.setAttribute("category", category);
//		modelAndView.setViewName("Admin-ListProducts");
//		}
//		else if(loginService.getUserType(profile1).equals("V")  && loginService.getUserStatus(profile1)<=2)
//		{
//			loginService.resetStatus(profile1);
//			modelAndView.setViewName("Vendor-AddProduct");
//		//String username = profile.getUserName();
//		httpSession.setAttribute("user", profile1);
//		List<Category> category = categoryService.getCategory();
//		modelAndView.addObject("category", category);
//		}
//		else if(loginService.getUserType(profile1).equals("U")  && loginService.getUserStatus(profile1)<=2)
//		{
//			loginService.resetStatus(profile1);
//			modelAndView.setViewName("Admin-AddProduct");
//			httpSession.setAttribute("user", profile1);
//			List<Category> category = categoryService.getCategory();
//			modelAndView.addObject("category", category);
//		}
//	}
//	else
//	{
//		profile1= loginService.checkUser(profile.getUserName());
//		//System.out.print(profile.getUserName());
//		if( profile1!=null && loginService.getUserStatus(profile1)<=2)
//		{
//			
//			System.out.print(loginService.getUserStatus(profile1));
//			loginService.increaseAttempt(profile1);
//			//System.out.print(loginService.getUserStatus(profile1));
//			modelAndView.setViewName("login");
//			
//			
//		}
//		else
//			modelAndView.setViewName("loginError");
//		
//		
//	}
//
//	return modelAndView;
//	}
//	
//}
