package com.example.service;

import com.example.bean.UserEntity;

public interface UserService {

	 void  addUser(UserEntity userEntity);
	 Boolean  isUserEntity(String username );
}
