package com.example.demorabbitMQ.Services.Impl;

import com.example.demorabbitMQ.Entites.Customer;
import com.example.demorabbitMQ.Services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
    @Autowired
    public JavaMailSender emailSender;

    @Override
    public void sendMessageToCustomer(Customer customer) {
        StringBuilder subject = new StringBuilder("Created User ");
        SimpleMailMessage message = new SimpleMailMessage();

        subject.append(customer.getFirstName()).append(" ");
        subject.append(customer.getLastName());
        System.out.println(subject);

        message.setTo(customer.getEmail());
        message.setSubject(subject.toString());
        message.setText(customer.toString());
        emailSender.send(message);
    }
}
