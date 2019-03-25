package com.dt13.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dt13.dao.Userdao;
//import com.dt13.model.Product4;
import com.dt13.model.UserDetails;



	@Controller
	public class HomeController
	{
		@Autowired
		Userdao userdao;
		
		//@Autowired
		//Productdao productdao;
		
		
		public  HomeController()
		 {
			System.out.println("done");
		 }
		
		//@RequestMapping("/home")
	   //public  String gotoAdmin()
	    
	    //{
			
			//ProductDaoImpl productimpl=new ProductDaoImpl();
			//productdao.addProduct(new Product4());
			//System.out.println("hello");
	        //return "adminhome";  
	   // }
		//@RequestMapping("/registe")
				//public String gotopage()
				//{
			     // return "register";
				//}
				
		
		@RequestMapping("/register")
        public ModelAndView gotoregister()
        {
            
        ModelAndView mv=new ModelAndView("register","user",new UserDetails());
         System.out.println("at reg");
		return mv;  
		}
		
		
		@RequestMapping(value="/adduser" , method = RequestMethod.POST)
		public String addUser(@ModelAttribute("user")UserDetails userDetails)
		{
			System.out.println(""+userDetails.getEmail());
			System.out.println(""+userDetails.getMobile());
			userdao.addUser(userDetails);
			return "redirect:/";
	}
		@RequestMapping("/login")
		public ModelAndView login()
		{
		  ModelAndView mv=new ModelAndView("login");
		  mv.addObject("User",new UserDetails());
		  System.out.println("loginpage");
		   return mv;
		}       
}
		
		
		
		
			
	