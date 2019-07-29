package com.emailservice.service;

import com.emailservice.model.EmailModel;

public interface IEmailService {

    public String send(EmailModel emailModel);
}
