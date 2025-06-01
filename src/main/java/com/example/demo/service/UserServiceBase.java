package com.example.demo.service;

import com.example.demo.controller.dto.User;
import com.example.demo.controller.dto.UserCreate;
import org.springframework.transaction.annotation.Transactional;

public class UserServiceBase implements UserService {

    @Transactional
    @Override
    public User createUser(UserCreate userCreate) {
        return null;
    }
}
