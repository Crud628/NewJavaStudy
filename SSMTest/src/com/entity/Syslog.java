package com.entity;

import java.util.Date;

public class Syslog {
	private Integer id;
	private Date action_time;
	private String action_name;
	private String action_exception;
	@Override
	public String toString() {
		return "Syslog [id=" + id + ", action_time=" + action_time + ", action_name=" + action_name
				+ ", action_exception=" + action_exception + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getAction_time() {
		return action_time;
	}
	public void setAction_time(Date action_time) {
		this.action_time = action_time;
	}
	public String getAction_name() {
		return action_name;
	}
	public void setAction_name(String action_name) {
		this.action_name = action_name;
	}
	public String getAction_exception() {
		return action_exception;
	}
	public void setAction_exception(String action_exception) {
		this.action_exception = action_exception;
	}
	public Syslog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Syslog(Integer id, Date action_time, String action_name, String action_exception) {
		super();
		this.id = id;
		this.action_time = action_time;
		this.action_name = action_name;
		this.action_exception = action_exception;
	}
	
}
