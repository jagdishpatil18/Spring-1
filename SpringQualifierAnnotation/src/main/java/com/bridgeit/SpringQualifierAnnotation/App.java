package com.bridgeit.SpringQualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  context = new AnnotationConfigApplicationContext(Appconfig.class);
        CarImplement obj = (CarImplement) context.getBean("car");
        obj.showCar();
    }
}
