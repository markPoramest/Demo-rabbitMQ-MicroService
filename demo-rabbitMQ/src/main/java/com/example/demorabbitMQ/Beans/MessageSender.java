package com.example.demorabbitMQ.Beans;

import com.example.demorabbitMQ.Entites.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
public class MessageSender {
    @Autowired
    private TopicExchange topic;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendEmail(Customer customer){
        rabbitTemplate.convertAndSend(topic.getName(),Constants.KEY,customer);
    }
}
