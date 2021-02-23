package com.server;

import com.dao.DaoImpl;
import com.pojo.User;

public class ServiceImpl implements ServiceInterface{
	private DaoImpl userDao = new DaoImpl();

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}




}
