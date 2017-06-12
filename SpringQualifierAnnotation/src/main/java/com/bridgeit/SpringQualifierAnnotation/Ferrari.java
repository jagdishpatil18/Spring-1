package com.bridgeit.SpringQualifierAnnotation;

import org.springframework.stereotype.Component;

@Component("Ferrari")
public class Ferrari implements Car{

	public void getCarName() {
		// TODO Auto-generated method stub
		System.out.println("This is Ferrari");
	}

}
