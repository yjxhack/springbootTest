package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring4all.swagger.EnableSwagger2Doc;


@EnableSwagger2Doc
@SpringBootApplication
@MapperScan("com.example.mapper")
public class SpringBootTestApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootTestApplication.class, args);
		
	}
}
