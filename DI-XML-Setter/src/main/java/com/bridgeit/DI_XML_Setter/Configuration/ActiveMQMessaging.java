package com.bridgeit.DI_XML_Setter.Configuration;

import com.bridgeit.DI_XML_Setter.Domain.Messaging;

public class ActiveMQMessaging implements Messaging {

	public void sendMessage() {
		System.out.println("Sending Messages via ActiveMQMessaging class which implements Messaging Interface.....");
	}

}
