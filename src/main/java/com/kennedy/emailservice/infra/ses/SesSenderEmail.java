package com.kennedy.emailservice.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.kennedy.emailservice.adapters.EmailSenderGateway;
import com.kennedy.emailservice.core.exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SesSenderEmail implements EmailSenderGateway {

    @Value("${emailsource}")
    private String emailSource;

    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public SesSenderEmail(AmazonSimpleEmailService amazonSimpleEmailService) {
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }

    @Override
    public void senderEmail(String to, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest()
                .withSource(emailSource)
                .withDestination(new Destination().withCcAddresses(to))
                .withMessage(new Message()
                        .withSubject(new Content(subject))
                        .withBody(new Body().withText(new Content(body)))
                );

        try {
            this.amazonSimpleEmailService.sendEmail(request);
        } catch (AmazonServiceException exception) {
            throw new EmailServiceException("Failure while sent email", exception);
        }
    }
}
