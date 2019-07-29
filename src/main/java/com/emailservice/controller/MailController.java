package com.emailservice.controller;

import com.emailservice.model.EmailModel;
import com.emailservice.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/sendEmail")
public class MailController {

    @Autowired
    IEmailService sendService;

    @PostMapping
    public ResponseEntity sendMail(@RequestBody @Valid EmailModel emailModel) {
        String response = sendService.send(emailModel);
        return ResponseEntity.ok(response);
    }
}
