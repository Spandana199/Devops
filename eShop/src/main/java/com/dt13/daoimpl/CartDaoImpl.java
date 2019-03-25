package com.dt13.daoimpl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dt13.dao.Cartdao;
import com.dt13.model.Cart;
import com.dt13.model.Product4;
@Component
public class CartDaoImpl implements Cartdao {
	@Autowired
	SessionFactory sessionFactory;
   Product4 p=new Product4();
	public void addToCart(Cart c) {
		
		System.out.println("SessionFactory"+sessionFactory);
		
		Session session=sessionFactory.openSession();
		//c.setCartId((int)(Math.random()*10000));
		session.save(c);
	 Transaction transaction=session.beginTransaction();
		
		transaction.commit();
		session.close();
	}
	public List<Cart> getCartlist() {
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("from Cart");
		List<Cart> cartList= query.list();   
		//List viewCart(String username)
		session.close();
		return cartList;
			
		
		}
	public List viewCart(String username) {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Cart where cartUser = ? ");
		query.setString(0, username);
		List<Cart> cartList=query.list();
		session.close();
		return cartList;
		
	}
	
		
		
}
	
				

	
	

	

	

		
	

		

	
	
	

