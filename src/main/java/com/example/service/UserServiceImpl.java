package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.UserEntity;
import com.example.mapper.UserMapper;

@Service
public class UserServiceImpl implements  UserService{

	@Autowired
	private  UserMapper userMapper;



	@Override
	 public  void  addUser(UserEntity userEntity) {

	  userMapper.insert(userEntity);

	}





}
