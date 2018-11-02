package com.example.demo.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.extension.api.Assert;
import com.example.bean.UserInformation;
import com.example.mapper.UserInformationMapper;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SimpleTest {
	
	 @Autowired
	private UserInformationMapper userInformationMapper;
	 
	 
	 @Test
	 public void testUser() {
		 
		 System.out.println(("----- selectAll method test ------"));
	        List<UserInformation> userList = userInformationMapper.selectList(null);
	      for (UserInformation userInformation : userList) {
			
	    	  System.out.println(userList.size());
		}
	    }
	 }


