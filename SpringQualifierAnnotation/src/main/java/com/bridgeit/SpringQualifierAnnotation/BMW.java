package com.bridgeit.SpringQualifierAnnotation;

import org.springframework.stereotype.Component;

@Component("BMW")
public class BMW implements Car{

	public void getCarName() {
		// TODO Auto-generated method stub
		System.out.println("This is BMW");
	}

}
