package com.kennedy.emailservice.core.exceptions;

public class EmailServiceException extends RuntimeException {

    public EmailServiceException(String msg) {
        super(msg);
    }

    public EmailServiceException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
