package com.example.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.UserInformation;
import com.example.mapper.UserInformationMapper;
import sun.awt.SunHints;

@RestController
public class UserInformationController {
	
	@Autowired
	UserInformationMapper  userInfoMapper;
	
	
	
	
	@RequestMapping("/mybatis/insert")
	public Object  insertinfo() {
	   	
	      int result = 0;
		UserInformation userinformation = new UserInformation();
		userinformation.setId(7L);
		userinformation.setAge(23);
		userinformation.setEmail("232323@");
		userinformation.setName("yjx");
	
	    result = userInfoMapper.insert(userinformation);
				
		
	   return result;
	}
	
	@RequestMapping("/mybatis/delete")
	public Object  insertinfoList() {
		  
				userInfoMapper.deleteById(1l);
	           return userInfoMapper.deleteById(1l);
	}
	

}
