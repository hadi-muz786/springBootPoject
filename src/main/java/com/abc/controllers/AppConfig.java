 package com.abc.controllers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abc.service.EmailService;
import com.abc.service.NotificationService;
import com.abc.service.TextService;

@Configuration
public class AppConfig {
	@Bean
	public EmailService emailService() {
		return new EmailService();
	}
	
	@Bean
	public TextService textService() {
		return new TextService();
	}
	
	@Bean
	public NotificationService notification() {
		NotificationService ns = new NotificationService();
		ns.setEmailService(emailService());
		ns.setTextService(textService());
		return ns;

}
}