package com.mapper;

import java.util.List;

import com.entity.User;

public interface UserMapper {
	/**
	 * 	注册
	 * @param user
	 * @return
	 */
	int registUser(User user);

	boolean insertUsers(List<User> list);
}
