package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.impl.UserManageService;

public class UserManageAction extends BaseAction {
	private UserManageService usermanageService;
	private User user;
	
	@Override
	public String execute() throws Exception {
		System.out.println("user action========");
		
		
		return "none";
	}
	
	public String create() throws Exception{
		System.out.println("create User "+user.getName());
		int res = usermanageService.create(user);
		if(res==0)
			return "createSuccess";
		return "createFail";
	}
	
	public UserManageService getUsermanageService() {
		return usermanageService;
	}

	public void setUsermanageService(UserManageService usermanageService) {
		this.usermanageService = usermanageService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
