package com.service;

import java.util.List;

import com.model.User;

public interface IUserManageService {
	
	public int create(User user);
	
	public int update(User user);
	
	public List<User> findUser(String userID);
	 
	public int remove(String userID);
}
