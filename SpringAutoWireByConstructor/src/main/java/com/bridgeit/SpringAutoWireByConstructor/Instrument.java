package com.bridgeit.SpringAutoWireByConstructor;

public class Instrument {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instrument Name= [ " + name + "]";
	}
}
