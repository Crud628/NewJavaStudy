package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int registUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.registUser(user);
	}

	@Override
	public String nameCheck(String name) {
		// TODO Auto-generated method stub
		return userMapper.nameCheck(name);
	}

	@Override
	public String userLogin(User user) {
		// TODO Auto-generated method stub
		return userMapper.userLogin(user);
	}

}
