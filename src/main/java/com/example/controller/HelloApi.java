package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
public class HelloApi {
	
	
	public static final String  API ="/api/";
	
	   @RequestMapping(value=API+"test")
	   public  Object    sayHello() {
		   
		   return  "hello";
		   
	   }
   

}
