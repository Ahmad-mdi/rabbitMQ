package com.rbtmq2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class OrderStatus {
    public Order order;
    public String status;//progress,completed
    private String message;
}
