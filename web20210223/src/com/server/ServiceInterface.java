package com.server;

import java.util.ArrayList;

import com.pojo.Member;
import com.pojo.User;

public interface ServiceInterface{

	/**
	 * 	注册
	 * @param name  用户名
	 * @param pass  密码
	 * @return
	 */
	int addUser(User user);
	
	/**
	 * 	查询一个员工
	 * @param id
	 * @return
	 */
	Member queryOne(int id);
	
	
	
	/**
	 * 	查询所有员工
	 * @return
	 */
	ArrayList<Member> queryAll();
}
