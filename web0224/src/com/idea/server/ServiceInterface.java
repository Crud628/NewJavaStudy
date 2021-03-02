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



    /**
     *  分页查询member列表
     * @param page  页数
     * @return
     */
    ArrayList<Member> queryMemberPage(int page);


	/**
	 * 得到员工数量
	 * @return
	 */
	int getMemberTotal();
}
