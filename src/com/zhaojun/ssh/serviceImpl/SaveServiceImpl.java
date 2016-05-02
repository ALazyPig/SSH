package com.zhaojun.ssh.serviceImpl;

import com.zhaojun.ssh.dao.UserDao;
import com.zhaojun.ssh.daoImpl.UserDaoImpl;
import com.zhaojun.ssh.model.User;
import com.zhaojun.ssh.service.SaveService;

public class SaveServiceImpl implements SaveService {
	private UserDao userDao = new UserDaoImpl();
	@Override
	public void saveUser(User user) {		
		userDao.saveUser(user);

	}

}
