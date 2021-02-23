package com.server;

import com.dao.DaoInterface;
import com.pojo.User;

public interface ServiceInterface{

	/**
	 * 	注册
	 * @param name
	 * @param pass
	 * @return
	 */
	int addUser(User user);
	
}
