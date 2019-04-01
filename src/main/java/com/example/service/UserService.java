package com.example.service;

import com.example.bean.UserEntity;

import java.util.List;

public interface UserService {

	 void  addUser(UserEntity userEntity);
	public List<Object> getUserList();

}
