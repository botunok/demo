package com.example.demo.controller;

import com.example.demo.controller.dto.User;
import com.example.demo.controller.dto.UserCreate;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> createUser(
            @RequestBody(required = true)
            UserCreate userCreate){
        User createdUser=userService.createUser(userCreate);

        return null;
    }


}
