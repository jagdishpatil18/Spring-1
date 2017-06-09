package com.bridgeit.DI_XML_Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.DI_XML_Constructor.Bean.Communication;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      Communication app = (Communication) context.getBean("communication");
      app.communicate();
    }
}
