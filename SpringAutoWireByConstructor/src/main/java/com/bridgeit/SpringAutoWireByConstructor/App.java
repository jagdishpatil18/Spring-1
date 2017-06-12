package com.bridgeit.SpringAutoWireByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("appconfig.xml");
        
      //autowire=constructor
        Performer p = (Performer) context.getBean("performer");
        System.out.println("Main called Performer--> "+p);
    }
}
