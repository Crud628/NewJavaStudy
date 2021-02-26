package com.idea.dao;

import java.util.ArrayList;

import com.idea.pojo.Member;
import com.idea.pojo.User;

public interface DaoInterface {

	/**
	 *  	注册
	 * @param user 用户实体类  
	 * @return  1：成功    0：失败
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

	/**
	 *    登录
	 * @param user
	 * @return
	 */
	boolean queryUser(User user);



	/**
	 *   查找用户是否存在
	 * @param username
	 * @return
	 */
	boolean queryUserName(String username);
}
