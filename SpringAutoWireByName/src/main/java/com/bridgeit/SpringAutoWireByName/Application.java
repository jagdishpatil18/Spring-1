package com.bridgeit.SpringAutoWireByName;

public class Application {

	/*
	 * This property is a bean with same name.
	 */
	private ApplicationUser applicationUser;

	public ApplicationUser getApplicationUser() {
		return applicationUser;
	}

	public void setApplicationUser(ApplicationUser applicationUser) {
		this.applicationUser = applicationUser;
	}

	@Override
	public String toString() {
		return "Application called ApplicationUser-->" + applicationUser;
	}
}
