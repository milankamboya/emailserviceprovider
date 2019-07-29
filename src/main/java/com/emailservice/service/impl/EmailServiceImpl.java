package com.emailservice.service.impl;

import com.emailservice.model.EmailModel;
import com.emailservice.service.IEmailService;
import com.emailservice.service.IEmailServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailServiceImpl implements IEmailService {

    @Autowired
    Environment env;

    @Autowired
    private List<IEmailServiceProvider> emailServiceProviders;

    @Override
    public String send(EmailModel emailModel) {
        String finalResponse = "Error while sending email";
        for (int i = 0; i < emailServiceProviders.size(); i++) {
            IEmailServiceProvider emailServiceProvider = emailServiceProviders.get(i);
            //boolean isWorking = emailServiceProvider.sendEmail(emailModel.getTo(), "Test Mail", "This is testing mail");
            boolean isWorking = emailServiceProvider.sendEmail(emailModel.getTo(), emailModel.getSubject(), emailModel.getBody());
            if (isWorking) {
                finalResponse = "Mail has been sent successfully";
                break;
            }
        }
        return finalResponse;
    }
}
