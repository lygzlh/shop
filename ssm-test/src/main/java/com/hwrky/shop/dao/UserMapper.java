package com.hwrky.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hwrky.shop.entity.User;

public interface UserMapper {
	Integer insertOne(@Param("user") User user);
	User select(@Param("user_name") String user_name,@Param("user_password") String user_password);
	List<User> selectAll();
	List<User> selectUser(@Param("user_name") String user_name,@Param("user_gender") String user_gender);
}
