package com.bridgeit.SpringAutoWireByConstructor;

public class Performer {
	
	private Instrument instrument;

	public Performer(Instrument instrument) {
//		super();
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Performer called Instrument =>" + instrument;
	}
	
}
