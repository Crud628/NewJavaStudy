package com.ky.shop.entity;

import java.util.Date;

public class User {
	 private Integer id;
	 private String name;
	 private String pwd;
	 /**
	  * 是否可用  0：可用 1：禁用
	  */
	 private String del_flag;//
	 private Date create_time;//创建时间
	 private Date update_time;//更新时间
	 private String comments;//备注
	 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDel_flag() {
		return del_flag;
	}
	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, String pwd, String del_flag, Date create_time, Date update_time,
			String comments) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.del_flag = del_flag;
		this.create_time = create_time;
		this.update_time = update_time;
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", pwd=" + pwd + ", del_flag=" + del_flag + ", create_time="
				+ create_time + ", update_time=" + update_time + ", comments=" + comments + "]";
	}
}
