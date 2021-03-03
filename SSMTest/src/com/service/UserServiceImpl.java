package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	
	@Override
	public int registUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.registUser(user);
	}
	
	
	
}
