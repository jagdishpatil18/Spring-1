package com.bridgeit.DI_AnnotationExample.implementing_class;

import com.bridgeit.DI_AnnotationExample.interfaces.Messaging;

public class ActiveMQMessaging implements Messaging{

	public void sendMessage() {
		// TODO Auto-generated method stub
		 System.out.println("Sending Message via Active MQ");
	}

}
