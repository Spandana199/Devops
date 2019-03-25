package com.dt13.dao;



import java.util.List;

import com.dt13.model.Cart;

public interface Cartdao {
	public  void addToCart(Cart c);
	List<Cart> getCartlist();
	public List viewCart(String username);
	
    
    

}
