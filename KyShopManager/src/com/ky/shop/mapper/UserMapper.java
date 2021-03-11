package com.ky.shop.mapper;

import java.util.List;

import com.ky.shop.entity.User;

public interface UserMapper {

	List<User> selectUserByNameAndPwd(User user);

	int userRegist(User user);

}
