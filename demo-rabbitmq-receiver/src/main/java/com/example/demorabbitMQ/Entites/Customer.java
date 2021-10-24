package com.example.demorabbitMQ.Entites;

import lombok.*;

import java.io.Serializable;

@Data
public class Customer implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
