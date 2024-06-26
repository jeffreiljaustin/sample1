package com.jeffreiljaustin.sample1.NotFoundException;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id){
        super("Could not found with " + id);
    }
}
