package com.rabbitmq.dto;

import lombok.Data;

@Data
public class User {
    private long id;
    private String firstname;
    private String lastname;
}
