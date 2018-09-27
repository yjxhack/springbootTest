package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.UserEntity;
import com.example.service.UserService;

@RestController
public class userController {
   
    @Autowired
    private	UserService  service;
    
     
	
	
	@RequestMapping("/add")
	public   void   addService() {
		
		UserEntity  userEntity = new UserEntity();
		userEntity.setId(1);
		userEntity.setUserName("杨家兄");
		userEntity.setNickName("杭电小假胸");
		userEntity.setPassWord("123");
		userEntity.setUserSex("nan");
		
		service.addUser(userEntity);
	
		
	}
	
	
	
	
	
}
