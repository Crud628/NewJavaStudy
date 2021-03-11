package com.ky.shop.service;

import org.springframework.stereotype.Service;

import com.ky.shop.entity.User;


public interface UserService {
	/**
	 * 根据用户名和密码查询用户   用于登录
	 * @param user
	 * @return
	 */
	boolean selectUserByNameAndPwd(User user);
	
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	boolean userRegist(User user);

}
