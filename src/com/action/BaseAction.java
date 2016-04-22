package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport{
	protected String token;
	protected String method;
	
	public Boolean CheckOnLine(){
		return true;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	

}
