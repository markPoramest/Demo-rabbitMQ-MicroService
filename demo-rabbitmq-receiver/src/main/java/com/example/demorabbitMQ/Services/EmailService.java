package com.example.demorabbitMQ.Services;

import com.example.demorabbitMQ.Entites.Customer;

public interface EmailService {
    void sendMessageToCustomer(Customer customer);
}
