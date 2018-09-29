package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


import com.example.handle.LoginInterCeptor;



@Configuration
public class WebAppConfig  extends  WebMvcConfigurationSupport{
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		 
	  //拦截器注册
		registry.addInterceptor(new LoginInterCeptor()).addPathPatterns("/*");
		
		
	}
	    

}
