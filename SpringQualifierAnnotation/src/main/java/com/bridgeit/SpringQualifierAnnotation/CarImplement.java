package com.bridgeit.SpringQualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("car")
public class CarImplement {
	@Autowired
	@Qualifier("BMW")
	private Car car;
	
	public void showCar() {
		// TODO Auto-generated method stub
		car.getCarName();
	}
}
