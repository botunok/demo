package com.example.demo.service;

import com.example.demo.controller.dto.User;
import com.example.demo.controller.dto.UserCreate;
import lombok.Generated;

@Generated
public interface UserService {
    User createUser(UserCreate userCreate);

}
