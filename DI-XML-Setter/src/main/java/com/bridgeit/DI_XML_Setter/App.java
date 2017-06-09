package com.bridgeit.DI_XML_Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.DI_XML_Setter.Bean.Communication;

public class App {
    public static void main( String[] args )   {
        ApplicationContext context = new ClassPathXmlApplicationContext("springcontext.xml");
        Communication app = (Communication) context.getBean("communication");
        app.communicate();
    }
}
