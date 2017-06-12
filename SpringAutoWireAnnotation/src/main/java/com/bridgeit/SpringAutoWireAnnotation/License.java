package com.bridgeit.SpringAutoWireAnnotation;

import org.springframework.stereotype.Component;

@Component
public class License {

	private String number = "COQPK9314H";

	@Override
	public String toString() {
		return "License Nnumber = " + number + "]";
	}
}
