package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.example.mapper")
@EnableSwagger2
public class SpringBootTestApplication {
             
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootTestApplication.class, args);
		
	}
}
