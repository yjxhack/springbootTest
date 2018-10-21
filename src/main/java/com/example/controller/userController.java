package com.example.controller;

import java.util.Map;

import org.junit.validator.PublicClassValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.UserEntity;
import com.example.mapper.UserMapper;
import com.example.mapper.UserTjMapper;
import com.example.service.UserService;

@RestController
public class userController {
   
    @Autowired
    private	UserService  service;
    
    @Autowired
    UserTjMapper userTjMapper;
	
	
	@RequestMapping("/add")
	public   void   addService() {
		
		UserEntity  userEntity = new UserEntity();
		userEntity.setId(3);
		userEntity.setUserName("杨家兄");
		userEntity.setNickName("杭电小假胸");
		userEntity.setPassWord("123");
		userEntity.setUserSex("nan");
		
		service.addUser(userEntity);
	
		
	}
	
   @RequestMapping("/user")
   @ResponseBody
	public Boolean isHaveString(UserEntity userEntity ){
	   String name= "yangjiaxiong";
		
		Boolean isBoolean =service.isUserEntity(name);
	   
	  
	   return   isBoolean;
		
		
	}
	
	
   @RequestMapping("/list")
   @ResponseBody
   public Map<String,Integer> getaddByUserSex(){
	   
	  System.out.println(userTjMapper.getAllByUserSex()); 
	  System.out.println(userTjMapper.getAllByUserSex().size());
	  System.out.println(userTjMapper.getAllByUserSex().get("nv"));
	  return   userTjMapper.getAllByUserSex();
	   
   }
   
   
	
	
}
