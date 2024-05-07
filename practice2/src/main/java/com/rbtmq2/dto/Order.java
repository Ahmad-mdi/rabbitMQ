package com.rbtmq2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class Order {
    private String orderId;
    private String name;
    private int qty;
    private double price;
}
