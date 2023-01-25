package com.ms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.models.EmailModel;
import com.ms.repositories.EmailRepository;

@Service

public class EmailService {
	
	@Autowired
	EmailRepository emailRepository;

	public void sendEmail(EmailModel emailModel) {
		
	}
}
