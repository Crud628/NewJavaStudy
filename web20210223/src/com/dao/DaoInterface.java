package com.dao;

import java.util.ArrayList;

import com.pojo.Member;
import com.pojo.User;

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
}
