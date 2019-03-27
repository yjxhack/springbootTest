package com.example.mapper;

import java.util.List;
import java.util.Map;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bean.UserEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<UserEntity>{

}

