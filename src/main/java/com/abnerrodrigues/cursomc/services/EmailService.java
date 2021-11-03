package com.abnerrodrigues.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.abnerrodrigues.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
