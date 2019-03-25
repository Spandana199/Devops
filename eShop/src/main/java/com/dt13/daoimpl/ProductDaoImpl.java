package com.dt13.daoimpl;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



import com.dt13.dao.Productdao;
import com.dt13.model.Product4;


@Component
public  class ProductDaoImpl implements Productdao {
@Autowired
SessionFactory sessionFactory;

public void addProduct(Product4 p) {
	
	System.out.println("SessionFactory"+sessionFactory);
	
	Session session=sessionFactory. openSession();
	
	session.save(p);
 Transaction transaction=session.beginTransaction();
	
	transaction.commit();
	session.close();
}

public List<Product4> getProducts() {
	
Session session=sessionFactory.openSession();
Query query = session.createQuery("from Product4");
List<Product4> productList= query.list();        
return productList;
	
}
public Product4 getProducts(int Id) {
	Session session=sessionFactory. openSession();
	Product4 p=new Product4();
	p=session.get(Product4.class,Id);
	//session.save(p);
	 Transaction transaction=session.beginTransaction();
		transaction.commit();
         return p;
}
}






	




