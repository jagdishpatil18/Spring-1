package com.bridgeit.SpringAutoWireByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("appconfig.xml");
        
        /*This will autowite-byType to EmployeeAddress with Employee*/
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Main called to Employee: "+employee);
    }
}
