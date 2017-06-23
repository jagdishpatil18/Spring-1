package com.bridgeit.spring.Spring4HelloWorld.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.bridgeit.spring.Spring4HelloWorld.domain.HelloWorld;
import com.bridgeit.spring.Spring4HelloWorld.domain.HelloWorldImpl;

@Configuration
public class HelloWorldConfig {
	@Bean(name = "beanConfigClass")
	@Description("Hello_World using Spring.")
	public HelloWorld hello(){
		return new HelloWorldImpl();
	}
}
