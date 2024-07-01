package com.jeffreiljaustin.sample1.NotFoundException;

public class OrderItemNotFoundException extends RuntimeException {
    public OrderItemNotFoundException(Long id) {
        super("Could not find order item " + id);
    }
}