package com.dt13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dt13.model.Category;

@Controller
public class CategoryControl {
@RequestMapping("/Category")
public ModelAndView gotoCategory()
{
	ModelAndView mv=new ModelAndView("Category");
	mv.addObject("cg",new Category());
	return mv;
	
}
public CategoryControl()
{
	System.out.println("Constructor");
}
@RequestMapping(value="/addCategory",method=RequestMethod.POST)
public String saveProduct(@ModelAttribute("cg") Category cate)
{
	System.out.println(""+cate.getCategoryId());
	System.out.println(""+cate.getCategoryName());
	System.out.println(""+cate.getCategoryDescription());
	
	 return "saveproduct";
	
}
}
