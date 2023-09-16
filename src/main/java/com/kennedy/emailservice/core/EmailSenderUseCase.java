package com.kennedy.emailservice.core;

public interface EmailSenderUseCase {

    void senderEmail(String to, String subject, String body);
}
