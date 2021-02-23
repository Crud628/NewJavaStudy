package com.server;

import com.pojo.User;

public interface ServiceInterface{

	/**
	 * 	注册
	 * @param name  用户名
	 * @param pass  密码
	 * @return
	 */
	int addUser(User user);
	
}
