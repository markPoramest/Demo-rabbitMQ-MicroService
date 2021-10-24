package com.example.demorabbitMQ.Services;

import com.example.demorabbitMQ.Beans.MessageSender;
import com.example.demorabbitMQ.Entites.Customer;
import com.example.demorabbitMQ.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    MessageSender sender;
    @Autowired
    CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer){
        Customer result = customerRepository.save(customer);
        sender.sendEmail(customer);
        return result;
    }
}
