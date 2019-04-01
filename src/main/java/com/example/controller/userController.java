package com.example.controller;

import com.example.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import com.example.bean.UserEntity;
import com.example.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api("用户接口")
public class userController {

    @Autowired
    private	UserService  userService;

    @Autowired
    private RedisService redisService;

	@ApiOperation(value="新增一个用户")
	@RequestMapping(value = "/add",method= RequestMethod.POST)
	public   void   addService(@RequestBody UserEntity userEntity) {
		userService.addUser(userEntity);
	}


	@ApiOperation(value = "查询所有用户的信息")
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	@ResponseBody
	public List<Object> getUser(){
		return  userService.getUserList();
	}

}
