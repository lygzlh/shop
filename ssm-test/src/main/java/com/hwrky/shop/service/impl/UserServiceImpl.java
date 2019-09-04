package com.hwrky.shop.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hwrky.shop.dao.UserMapper;
import com.hwrky.shop.entity.User;
import com.hwrky.shop.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	private UserMapper userMapper;
	@Resource(name="userMapper")
	
	 public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
	
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
	@Override
	public boolean add(User user) {
		//把数据插入数据库
		return userMapper.insertOne(user)>0;
	}

	@Override
	public User select(String user_name, String user_password) {
		return userMapper.select(user_name, user_password);
	}

	@Override
	public List<User> selectAll() {
		
		return userMapper.selectAll();
	}

	@Override
	public List<User> selectUser(String user_name, String user_gender) {
		
		return userMapper.selectUser(user_name,user_gender);
	}
	
}
