package com.idea.server;

import java.util.ArrayList;

import com.idea.pojo.Member;
import com.idea.pojo.User;

public interface ServiceInterface{

	/**
	 * 	注册
	 * @param user  用户名
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
