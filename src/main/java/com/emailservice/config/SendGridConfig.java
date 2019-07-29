package com.emailservice.config;

import com.sendgrid.SendGrid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("sendgrid")
@Configuration
@PropertySource(value = "sendgrid.properties")
public class SendGridConfig {

    @Value("${api_key}")
    private String apiKey;

    @Bean("sendGrid")
    public SendGrid getSendGridSender() {
        return new SendGrid(apiKey);
    }
}
