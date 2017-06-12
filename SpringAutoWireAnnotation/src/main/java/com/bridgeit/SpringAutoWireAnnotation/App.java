package com.bridgeit.SpringAutoWireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Driver driver = (Driver) context.getBean("driver");
        System.out.println("Driver Details : " + driver);
    }
}
