package com.bridgeit.spring.Spring4HelloWorld;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.bridgeit.spring.Spring4HelloWorld.configuration.HelloWorldConfig;
import com.bridgeit.spring.Spring4HelloWorld.domain.HelloWorld;

public class App {
	
    public static void main( String[] args )   {
    	
    	AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld bean = (HelloWorld) context.getBean("beanConfigClass");
        bean.sayHello("Sunil");
//        context.close();
    }
}
