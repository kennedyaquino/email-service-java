package com.kennedy.emailservice.application;

import com.kennedy.emailservice.adapters.EmailSenderGateway;
import com.kennedy.emailservice.core.EmailSenderUseCase;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void senderEmail(String to, String subject, String body) {
        this.emailSenderGateway.senderEmail(to, subject, body);
    }
}
