package com.example.GlobalExceptionHandler.controller;

import com.example.GlobalExceptionHandler.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/users/{id}")
    public String getUser(@PathVariable long id){
        if (id ==0) {
            throw  new ResourceNotFoundException("Id is 0" + id);
        }
        return "Testing Github desktop checking out the branch with User id: " + id;
    }
}
