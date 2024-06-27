package com.jeffreiljaustin.sample1.NotFoundException;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id){
        super("Could not found with " + id);
    }
}
