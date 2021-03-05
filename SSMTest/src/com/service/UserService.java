package com.service;

import java.util.List;

import com.entity.User;

public interface UserService {

	
	/**
	 * 	注册
	 * @param user
	 * @return
	 */
	int registUser(User user);

	boolean transactionTest(List<User> list);

	boolean insertUsers(List<User> list);

}
