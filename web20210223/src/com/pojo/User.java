package com.pojo;



public class User {
	private String username;
	private String userpass;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String userpass) {
		super();
		this.username = username;
		this.userpass = userpass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", userpass=" + userpass + "]";
	}
	
}
