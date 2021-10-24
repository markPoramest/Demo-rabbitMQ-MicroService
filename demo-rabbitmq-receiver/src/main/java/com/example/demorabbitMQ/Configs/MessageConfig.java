package com.example.demorabbitMQ.Configs;

import com.example.demorabbitMQ.Beans.Constants;
import com.example.demorabbitMQ.Beans.MessageReceiver;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(Constants.CUSTOMER_TOPIC);
    }

    @Bean
    public Queue queue() {
        return new Queue(Constants.SENDER_CUSTOMER_QUEUE);
    }

    @Bean
    public Binding binding() {
        return BindingBuilder.bind(queue()).to(exchange()).with(Constants.KEY);
    }


    @Bean
    public MessageReceiver receiver() {
        return new MessageReceiver();
    }


}