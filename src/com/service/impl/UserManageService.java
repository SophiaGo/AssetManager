package com.service.impl;

import java.util.List;

import com.dao.impl.UserManageDao;
import com.model.User;
import com.service.IUserManageService;

public class UserManageService implements IUserManageService{
	private UserManageDao usermanageDao;
	
	@Override
	public int create(User user) {
		try {
			usermanageDao.create(user);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		}
	}

	@Override
	public int update(User user) {
		try {
			usermanageDao.update(user);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		}		
	}

	@Override
	public List<User> findUser(String userID) {
		try {
			return usermanageDao.findUser(userID);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	

	@Override
	public int remove(String userID) {
		try {
			User user = new User();
			user.setId(Integer.parseInt(userID));
			if(user.getId()<=0)
				return 1;
			usermanageDao.remove(user);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 2;
	}

	public UserManageDao getUsermanageDao() {
		return usermanageDao;
	}

	public void setUsermanageDao(UserManageDao usermanageDao) {
		this.usermanageDao = usermanageDao;
	}

}
