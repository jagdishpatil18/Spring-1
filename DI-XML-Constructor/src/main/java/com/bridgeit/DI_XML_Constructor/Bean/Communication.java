package com.bridgeit.DI_XML_Constructor.Bean;

import com.bridgeit.DI_XML_Constructor.Interface.Messaging;

public class Communication {
	private Messaging messaging;

	public Communication(Messaging messaging){
		this.messaging=messaging;
	}
	
	public void communicate(){
		messaging.sendMessage();
	}
}
