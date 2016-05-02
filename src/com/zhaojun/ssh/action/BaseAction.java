package com.zhaojun.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zhaojun.ssh.model.User;
import com.zhaojun.ssh.service.SaveService;
import com.zhaojun.ssh.serviceImpl.SaveServiceImpl;

public class BaseAction extends ActionSupport{
	private User user;
	private SaveService saveService = new SaveServiceImpl();
	@Override
	public String execute(){
		return SUCCESS;
	}
	public String register(){	
		saveService.saveUser(user);
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
