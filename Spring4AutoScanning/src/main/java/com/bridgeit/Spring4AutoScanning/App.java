package com.bridgeit.Spring4AutoScanning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bridgeit.Spring4AutoScanning.configuration.Appconfig;
import com.bridgeit.Spring4AutoScanning.model.Employee;
import com.bridgeit.Spring4AutoScanning.service.EmployeeService;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
       
    	/*If you don't wanna write XML file as well as Appconfig.java Class. 
       AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
       context.scan("com.bridgeit.Spring4AutoScanning"); 
       context.refresh();*/
       
       EmployeeService service = (EmployeeService) context.getBean("employeeService");
       
       /*
        * Register employee using service
        */
       Employee employee = new Employee();
       employee.setName("Sunil Kumar");
       service.registerEmployee(employee);
        
    }
}
