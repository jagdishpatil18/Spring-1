package com.bridgeit.DI_AnnotationExample.bean;

import com.bridgeit.DI_AnnotationExample.interfaces.Encryption;
import com.bridgeit.DI_AnnotationExample.interfaces.Messaging;

public class Communication {

	private Messaging messaging;
    
    private Encryption encryption;
     
    /*
     * DI via Constructor Injection
     */
    public Communication(Encryption encryption){
        this.encryption = encryption;
    }
 
    /*
     * DI via Setter
     */
    public void setMessaging(Messaging messaging){
        this.messaging = messaging;
    }
 
    public void communicate(){
        encryption.encryptData();
        messaging.sendMessage();
    }
}
