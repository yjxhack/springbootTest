package com.example.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.bean.UserEntity;


@Mapper
public interface UserMapper {
	List<UserEntity> getAll();
	
	UserEntity getOne(Integer id);
 
	void insert(UserEntity user);
 
	void update(UserEntity user);
 
	void delete(Integer id);
	
	List<String>  getallString();
	
    List<Map<String, Object>> getAllByCount();
} 
