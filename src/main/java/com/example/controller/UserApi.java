package com.example.controller;

import java.util.List;

import org.apache.tomcat.util.http.ServerCookie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.UserEntity;
import com.example.mapper.UserMapper;
import com.example.service.UserService;

import io.swagger.annotations.Api;

@RestController
public class UserApi {
	

// private	 UserService  service;
    @Autowired
	UserMapper mapper;
	
	
	public static final String  API ="/api/";
	
	   @RequestMapping(value=API+"test")
	   public  Object    sayHello() {
		   
		   return  "hello";
		   
	   }
	   
	   @RequestMapping(value=API+"/user/")
	   public ResponseEntity<Object>  listUser(){
		  
		   List<UserEntity>  list = null;
		try {
			   list = mapper.getAll();
			   return  ResponseEntity.ok(list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		   return (ResponseEntity<Object>) ResponseEntity.status(500);
		   
	   }   

}
