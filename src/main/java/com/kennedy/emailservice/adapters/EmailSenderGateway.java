package com.kennedy.emailservice.adapters;

public interface EmailSenderGateway {

    void senderEmail(String to, String subject, String body);
}
