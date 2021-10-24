package com.example.demorabbitMQ.Beans;

import com.example.demorabbitMQ.Entites.Customer;
import com.example.demorabbitMQ.Services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

@RabbitListener(queues = Constants.SENDER_CUSTOMER_QUEUE)
public class MessageReceiver {
    @Autowired
    EmailService emailService;
    @RabbitHandler
    public void receive(Customer customer) {
        System.out.println(customer);
        emailService.sendMessageToCustomer(customer);
    }

}