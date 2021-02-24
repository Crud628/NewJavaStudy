package com.server;

import java.util.ArrayList;

import com.dao.DaoImpl;
import com.pojo.Member;
import com.pojo.User;

public class ServiceImpl implements ServiceInterface{
	private DaoImpl userDao = new DaoImpl();

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	@Override
	public Member queryOne(int id) {
		// TODO Auto-generated method stub
		return userDao.queryOne(id);
	}

	@Override
	public ArrayList<Member> queryAll() {
		// TODO Auto-generated method stub
		return userDao.queryAll();
	}

}
