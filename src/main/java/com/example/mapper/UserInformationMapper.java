package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bean.UserInformation;


//继承基础baseMapper（mybatis plus 框架）
@Mapper
public interface UserInformationMapper extends BaseMapper<UserInformation> {

}
