package com.ky.shop.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ky.shop.entity.User;
import com.ky.shop.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
		
	@Override
	public boolean selectUserByNameAndPwd(User user) {
		// TODO Auto-generated method stub
		List<User> u = userMapper.selectUserByNameAndPwd(user);
		if(u.size() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean userRegist(User user) {
		// TODO Auto-generated method stub
		user.setDel_flag("0");
		user.setCreate_time(new Date());
		user.setUpdate_time(new Date());
		user.setComments("审核中");
		int flag = userMapper.userRegist(user);
		if(flag >= 1) {
			return true;
		}
		return false;
	}

}
