package com.dao;

import com.pojo.User;

public interface DaoInterface {

	/**
	 *  	注册
	 * @param user 用户实体类  
	 * @return  1：成功    0：失败
	 */
	int addUser(User user);
}
