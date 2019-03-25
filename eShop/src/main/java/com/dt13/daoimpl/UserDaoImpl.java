package com.dt13.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dt13.dao.Userdao;

import com.dt13.model.UserDetails;
@Component
public class UserDaoImpl implements Userdao{
	@Autowired
	SessionFactory sessionFactory;
	public void addUser(UserDetails userDetails) {
		
		// TODO Auto-generated method stub

        System.out.println("SessionFactory"+sessionFactory);
        Session Session=sessionFactory.openSession();
        Session.save(userDetails);
        Transaction t=Session.beginTransaction();
        t.commit();	
	}
	public List<UserDetails> getuser() {
		Session session=sessionFactory.openSession();
		Query query = session.createQuery("from UserDetails");
		List<UserDetails> userDetails= query.list();
		return userDetails;
	}


	
		
	}
	
		
	
	


