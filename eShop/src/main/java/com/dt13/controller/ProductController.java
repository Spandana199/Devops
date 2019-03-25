package com.dt13.controller;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dt13.dao.Productdao;
import com.dt13.model.Product4;

@Controller
public class ProductController {
	@Autowired
	Productdao daoImpl;
				@RequestMapping("/product")
		public ModelAndView goToForm()
				{
					ModelAndView mv=new ModelAndView("product");
				
		    mv.addObject("pr",new Product4());
		      return mv;

	   	   }
	@RequestMapping("/adminhome")
			public ModelAndView goTo()
			{
				ModelAndView m=new ModelAndView("product");
			
	    m.addObject("pr",new Product4());
	      return m;

   	    }

                                                        //formsub
         @RequestMapping(value="/addproduct",method=RequestMethod.POST)
           public String saveProduct(@ModelAttribute("pr")Product4 pro) 
           {
        	 System.out.println(""+pro.getProductId());
        	 System.out.println(""+pro.getProductName());
        	 System.out.println(""+pro.getProductPrice());
        	 pro.setProductId((int)(Math.random()*10000));
        	 try
        	 {
 			MultipartFile image=pro.getImage();
 		byte imageInbytes[];
		
			imageInbytes = image.getBytes();
		
 		
 		String path="E:/proj/eshop/src/main/webapp/resources/proimg/";
 		path=path+pro.getProductId()+".png";
 		System.out.println("img---------------"+image);
 		if(image!=null)
 		{
 			System.out.println("img---------------"+image);
 			File file=new File(path);
 			FileOutputStream  fos=new FileOutputStream(file);
 			BufferedOutputStream  bos=new BufferedOutputStream(fos);
 			bos.write(imageInbytes);
            bos.close();			
 			
 			image.transferTo(new File(path));
 			
 					
 		}
        	 }
 		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        	 daoImpl.addProduct((pro));
  			return "saveproduct";

        	
 			}
		
         
         @RequestMapping("/adminhome1")
         public String home()
         {
        	 return "adminhome";
         }
         
         @RequestMapping("/v")
         public ModelAndView getProducts()
         {
             List<Product4> productList=daoImpl.getProducts();
             ModelAndView mv=new ModelAndView("viewproducts","pro",productList);
             
             mv.addObject(productList);
             System.out.println("productList");
             return mv;
         }
         
         @GetMapping("/viewproduct")
         
        public ModelAndView showSingleProduct(@RequestParam("proid") int Id)
         {
        	 //List<Product4> productList=daoImpl.getProducts();
        	            //calling method
        	Product4 p1=daoImpl.getProducts(Id);
             ModelAndView mv=new ModelAndView("single","pro",p1);
             return mv;
         
         } 
         @RequestMapping("/getproducts")
         public ModelAndView getProduct()
         {
             List<Product4> productList=daoImpl.getProducts();
             ModelAndView mv=new ModelAndView("saveproduct","pro",productList);
             
             mv.addObject(productList);
             System.out.println("productList");
             return mv;
         }
         @RequestMapping("/adminproducts")
         public ModelAndView getAdminProduct()
         {
             List<Product4> productList=daoImpl.getProducts();
             ModelAndView mv=new ModelAndView("adminproduct","pro",productList);
             
             mv.addObject(productList);
             System.out.println("productList");
             return mv;
         }
}
         




