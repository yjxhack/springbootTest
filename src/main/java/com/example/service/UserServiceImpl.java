package com.example.service;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.UserEntity;
import com.example.mapper.UserMapper;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

	@Autowired
	private  UserMapper userMapper;



	@Override
	 public  void  addUser(UserEntity userEntity) {

	  userMapper.insert(userEntity);

	}

	@Autowired
   public List<Object> getUserList(){
		return  userMapper.selectObjs(null);
   }


}
