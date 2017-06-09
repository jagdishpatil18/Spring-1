package com.bridgeit.DI_XML_Setter.Bean;

import com.bridgeit.DI_XML_Setter.Domain.Messaging;

public class Communication {
	private Messaging messaging;

	/*
	 * DI via Setter
	 */
	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
	}

	public void communicate() {
		messaging.sendMessage();
	}
}
