package com.bridgeit.SpringAutoWireByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("appconfig.xml");
    	
    	/*This will autowire-byName to Application with ApplicationUser.*/
    	Application application = (Application) context.getBean("application");
    	System.out.println("Application Called by Main : "+application);
    }
}
