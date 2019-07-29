package com.emailservice.service;

public interface IEmailServiceProvider {

    boolean sendEmail(String to, String subject, String body);
}
