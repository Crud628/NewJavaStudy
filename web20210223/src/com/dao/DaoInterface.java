package com.dao;

import com.pojo.User;

public interface DaoInterface {

	/**
	 *  	注册
	 * @param user  实体类
	 * @return
	 */
	int addUser(User user);
}
