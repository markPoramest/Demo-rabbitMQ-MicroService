package com.example.demorabbitMQ.Configs;

import com.example.demorabbitMQ.Beans.Constants;
import com.example.demorabbitMQ.Beans.MessageSender;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Envelope;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.MessagePropertiesConverter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.amqp.support.converter.SimpleMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MessageConfig {


    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(Constants.CUSTOMER_TOPIC);
    }

//    @Bean
//    public Jackson2JsonMessageConverter  converter(){
//        return new Jackson2JsonMessageConverter ();
//    }
//
//    @Bean
//    public AmqpTemplate template(ConnectionFactory connectionFactory) {
//        final RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
//        rabbitTemplate.setMessageConverter(converter());
//        return rabbitTemplate;
//    }

    @Bean
    public MessageSender sender() {
        return new MessageSender();
    }

}
