package com.example.controller;

import com.example.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.bean.UserEntity;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
@Api("用户接口")
public class userController {

    @Autowired
    private	UserService  service;

    @Autowired
    private RedisService redisService;


	@ApiOperation(value="新增一个用户")
	@RequestMapping(value = "/add",method= RequestMethod.POST)
	public   void   addService(@RequestBody UserEntity userEntity) {
		service.addUser(userEntity);
		redisService.set("yjx","12312");
	}







}
