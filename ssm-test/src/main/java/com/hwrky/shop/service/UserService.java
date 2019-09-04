package com.hwrky.shop.service;

import java.util.List;

import com.hwrky.shop.entity.User;

public interface UserService {
	boolean add(User user);
	User select(String user_name,String user_password);
	List<User> selectAll();
	List<User> selectUser(String user_name,String user_gender);
	
}
