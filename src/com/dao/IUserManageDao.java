package com.dao;


import java.util.List;

import com.model.User;

public interface IUserManageDao {

	public void create(User user);
	
	public void update(User user);
	
	public void remove(User user);
	
	public List<User> findUser(String userID);
	
	
}
