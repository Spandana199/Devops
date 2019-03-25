package com.dt13.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dt13.dao.Cartdao;
import com.dt13.dao.Productdao;
import com.dt13.model.Cart;
import com.dt13.model.Product4;

@Controller
public class CartController {
	@Autowired
	Cartdao daoimpl;
	
	@Autowired
	Productdao pdao;
	
	@GetMapping("/Cart")
	public ModelAndView goToCart(@RequestParam("proid") int Id,HttpSession session)
    {
   	 System.out.println("cart");
        Product4 p=pdao.getProducts(Id);
        ModelAndView mv=new ModelAndView("Cart");
        Cart c=new Cart();
        //String loginUser=(String)session.getAttribute("uname");
        String username=(String) session.getAttribute("uname");
        
        c.setCartId((int)(Math.random()*10000));
		c.setProductName(p.getProductName());
		c.setProductPrice(p.getProductPrice());
		c.setTotalPrice(p.getProductId());
		c.setQuantity(2);
		//c.setCartUser(loginUser);
		daoimpl.viewCart(username);
		daoimpl.addToCart(c);
	       return mv;
     
    }
	@RequestMapping("/cartlist")
    public ModelAndView getCartList()
    {
        List<Cart> cartList=daoimpl.getCartlist();
        ModelAndView mv=new ModelAndView("viewcart","pro",cartList);
        
    //get data from database and hold it in list
       
      // mv.addObject(cartList);
        System.out.println("cartList");
        return mv;

   	
}
	 
}