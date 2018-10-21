package com.example.service;

import static org.hamcrest.CoreMatchers.describedAs;

import java.nio.file.attribute.UserPrincipal;
import java.util.List;

import org.junit.validator.PublicClassValidator;
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
	@Override
	public Boolean  isUserEntity(String username ) {
		
		boolean is =false;
		
	   List<String>  list = userMapper.getallString();
	   System.out.println(list.size());
	   for (String  param : list) {
		   
		   if(username.equals(param)) {
		    System.out.println(param);
		     is = true;
			  
			  
		   }
		   
	}
		
		return  is;
		
	}
	
	
	

}
