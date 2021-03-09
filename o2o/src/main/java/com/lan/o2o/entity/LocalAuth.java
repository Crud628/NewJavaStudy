package com.lan.o2o.entity;

import java.util.Date;

/**
 * 本地账号权限
 * 表:tb_loacl_auth
 * @Descripton:TODO
 * @author KK
 * @version V1.0
 * @date 2021年2月28日下午7:31:09
 */
public class LocalAuth {
	
	/**
	 * 本地账号ID
	 */
	private Long localAuthId;
	
	/**
	 * 用户名
	 */
	private String username;
	
	/**
	 * 密码
	 */
	private String password;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 最后操作时间
	 */
	private Date lastEditTime;
	
	/**
	 * 关联账号信息
	 */
	private PersonInfo personInfo;
	
}
