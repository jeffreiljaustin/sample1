package com.jeffreiljaustin.sample1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jeffreiljaustin.sample1.Model.UserModel;

@RestController
public class UserController {

    @GetMapping("/user")
    public UserModel getUser(){
        return new UserModel(0, null, null, null)
    }
}