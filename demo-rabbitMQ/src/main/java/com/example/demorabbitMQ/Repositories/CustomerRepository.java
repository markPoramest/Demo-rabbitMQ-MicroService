package com.example.demorabbitMQ.Repositories;

import com.example.demorabbitMQ.Entites.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer,Long> {
}
