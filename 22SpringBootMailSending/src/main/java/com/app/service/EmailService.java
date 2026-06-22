package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail() {

            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo("prasoon.bidua@regexsoftware.com");
            message.setSubject("Test Mail");
            message.setText("Hello Prasoon sir");

            mailSender.send(message);

            System.out.println("Mail Sent Successfully");

    }
}