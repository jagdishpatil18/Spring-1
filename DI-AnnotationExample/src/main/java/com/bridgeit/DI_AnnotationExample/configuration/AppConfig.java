package com.bridgeit.DI_AnnotationExample.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.bridgeit.DI_AnnotationExample.bean.Communication;
import com.bridgeit.DI_AnnotationExample.implementing_class.ActiveMQMessaging;
import com.bridgeit.DI_AnnotationExample.implementing_class.RSAEncryption;
import com.bridgeit.DI_AnnotationExample.interfaces.Encryption;
import com.bridgeit.DI_AnnotationExample.interfaces.Messaging;

@Configuration
public class AppConfig {

	@Bean(name="communication")
	public Communication communication(){
		Communication communication = new Communication(encryption());
		communication.setMessaging(messaging());
        return communication;
	}

	@Bean(name = "encryption")
    @Description("This bean will be injected via setter injection")
    public Encryption encryption() {
        return new RSAEncryption();
    }
 
    @Bean(name = "messaging")
    @Description("This bean will be injected via setter injection")
    public Messaging messaging() {
        return new ActiveMQMessaging();
    }
}
