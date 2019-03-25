package com.dt13.dao;

import java.util.List;


import com.dt13.model.UserDetails;

public interface Userdao {
	public  void addUser(UserDetails userDetails);
	
	List<UserDetails> getuser();
	
}
