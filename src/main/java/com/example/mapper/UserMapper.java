package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.bean.UserEntity;


@Mapper
public interface UserMapper {
	List<UserEntity> getAll();
	
	UserEntity getOne(Integer id);
 
	void insert(UserEntity user);
 
	void update(UserEntity user);
 
	void delete(Integer id);
}
