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
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.cts.grizzly.bean.Category;
//import com.cts.grizzly.bean.Product;
//import com.cts.grizzly.service.CategoryService;
//import com.cts.grizzly.service.ProductService;
//
//@Controller
//public class ProductController {
//	 @Autowired
//	  private ProductService productService; 
//	 
//	 @Autowired
//	 private CategoryService categoryService;
//	 
//
//	@RequestMapping(value="Admin-AddProduct.html", method=RequestMethod.GET)
//	
//	public String geProductPage()
//	{
//		return "Admin-AddProduct";
//	}
//	
//	@RequestMapping(value="Admin-AddProduct.html", method=RequestMethod.POST)
//	public ModelAndView validateUser(@ModelAttribute Product product, HttpSession httpSession) 
//	{
//		ModelAndView modelAndView = new ModelAndView();
//		if("success".equals(productService.addProduct(product))){
//
//			List<Product> products = productService.getAllProducts();
////			List<Category> category = categoryService.getCategory();
////			modelAndView.addObject("category", category);
//			httpSession.setAttribute("products", products);
//			modelAndView.setViewName("Admin-ListProducts");
//			
//		
//		}
//		
//		
//		
//	return modelAndView;
//	}
//	
//	@RequestMapping(value="viewProduct.html", method=RequestMethod.GET)
//	public ModelAndView getProductInfo(@RequestParam("id") String id) 
//	{
//		ModelAndView mav = new ModelAndView();
//		Product pro = productService.findProduct(id);
//		mav.addObject("products",pro);
//		mav.setViewName("Admin-ViewProduct");
//		return mav;
//		
//
//	}
//	
//	@RequestMapping(value="deleteProduct.html", method=RequestMethod.GET)
//	public ModelAndView deleteProductInfo(@RequestParam("id") String id) 
//	{
//		ModelAndView mav = new ModelAndView();
//		productService.deleteProduct(id);
//		mav.setViewName("Admin-ListProducts");
//		List<Product> pro = productService.getAllProducts();
//		mav.addObject("products",pro);
//		
//		return mav;
//		
//
//	}
//	@RequestMapping(value="SortByRating.html")
//	public ModelAndView sortProducts(@RequestParam("order") String order)
//	{
//		ModelAndView modelAndView = new ModelAndView();
//		List<Product> pr = productService.filterProducts(order);
//		modelAndView.addObject("products",pr);
//		modelAndView.setViewName("Admin-ListProducts");
//		return modelAndView;
//		
//	}
//	
//	@RequestMapping(value="logout.html")
//	public ModelAndView logout(HttpSession httpSession)
//	{
//		ModelAndView modelAndView = new ModelAndView();
//		httpSession.removeAttribute("user");
//		httpSession.invalidate();
//		modelAndView.setViewName("login");
//		return modelAndView;
//		
//	}
//}
//	