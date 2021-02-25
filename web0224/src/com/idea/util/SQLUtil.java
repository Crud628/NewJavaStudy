package com.idea.util;

public class SQLUtil {
	public static String add_one_user="insert into user_list(user_name,user_pass) values(?,?)";
	public static String select_one_member = "SELECT id, name, sex, salary, department, age FROM member where id = ?";
	public static String select_all_members = "SELECT id, name, sex, salary, department, age FROM member";
	public static String USER_LOGIN = "SELECT user_id, user_name, user_pass FROM mytest.user_list WHERE user_name=? and user_pass=?";
}
