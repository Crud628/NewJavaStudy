package com.service;

import com.entity.User;

public interface UserService {
	/**
	 * 	注册
	 * @param user
	 * @return
	 */
	int registUser(User user);
	
	/**
	 * 註冊用户名校验
	 * @param name
	 * @return
	 */
	String nameCheck(String name);
	
	
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	String userLogin(User user);
}
