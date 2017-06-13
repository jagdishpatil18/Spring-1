package com.bridgeit.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeit.dao.PersonDAO;
import com.bridgeit.model.Person;

public class AppMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		PersonDAO dao = (PersonDAO) context.getBean("personDAO");
		
		Person person = new Person();
		person.setName("Sunil");
		person.setCountry("India");
		
		dao.save(person);		
		System.out.println("Person::"+person);
		
		List<Person> list = dao.list();
		for(Person p:list){
			System.out.println("Person List::"+p);
		}
		context.close();
	}
}
