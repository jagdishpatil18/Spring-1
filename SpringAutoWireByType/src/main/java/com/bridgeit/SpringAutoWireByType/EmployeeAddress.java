package com.bridgeit.SpringAutoWireByType;

public class EmployeeAddress {
	private String streat;
	private String city;
	private String state;
	
	public String getStreat() {
		return streat;
	}
	public void setStreat(String streat) {
		this.streat = streat;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [Streat=" + streat + ", City=" + city + ", State=" + state + "]";
	}
}
