package com.dt13.dao;

import java.util.List;

import com.dt13.model.Product4;


public interface Productdao 
{
	public  void addProduct(Product4 p);
	List<Product4> getProducts();
	
     Product4 getProducts(int Id);
}
