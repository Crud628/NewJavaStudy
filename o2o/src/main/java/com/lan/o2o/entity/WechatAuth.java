package com.lan.o2o.entity;

import java.util.Date;

/**
 * 微信账号权限
 * 表：tb_wechat_auth
 * @Descripton:TODO
 * @author KK
 * @version V1.0
 * @date 2021年2月28日下午7:27:43
 */
public class WechatAuth {
	
	/**
	 * 微信ID
	 */
	private Long wechatAuthId;
	
	/**
	 * open id
	 */
	private String openId;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 关联用户信息
	 */
	private PersonInfo personInfo;

	public Long getWechatAuthId() {
		return wechatAuthId;
	}

	public void setWechatAuthId(Long wechatAuthId) {
		this.wechatAuthId = wechatAuthId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}
	
}
