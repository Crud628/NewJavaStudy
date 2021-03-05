package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	
	@Transactional
	@Override
	public boolean transactionTest(List<User> list) {
		// TODO Auto-generated method stub
		int result = 0;
		for (User user : list) {
			result+=userMapper.registUser(user);
		}
		if(result==list.size()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insertUsers(List<User> list) {
		// TODO Auto-generated method stub
		return userMapper.insertUsers(list);
	}
	
	
	
}
