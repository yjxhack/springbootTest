package com.example.controller;

import java.util.List;
import java.util.Map;

import org.apache.tomcat.util.http.ServerCookie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.UserEntity;
import com.example.mapper.UserMapper;
import com.example.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api("swaggerDemoController相关的api")
public class UserApi {
	

// private	 UserService  service;
    @Autowired
	UserMapper mapper;
    
    @Autowired
    UserService userService;
	
	
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
	   
	   @GetMapping(value=API+"/user/{username}")
	   @ApiOperation(value="判断user的用户名是否存在")
	   public  ResponseEntity<Boolean>  isHaveUserName(@ApiParam(value="用户名")  @PathVariable String username) {
		   
		  return  ResponseEntity.ok(userService.isUserEntity(username));
		   
		   
	   }
	   
	   @GetMapping(value=API+"/list")
	   @ApiOperation(value="判断user的用户名是否存在")
	   public  ResponseEntity<List<Map<String, Object>>>  listAll( ) {
		  System.out.println(mapper.getAllByCount().size()); 
		  return  ResponseEntity.ok(mapper.getAllByCount());
		   
		   
	   }

}
