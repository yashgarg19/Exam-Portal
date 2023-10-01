package com.exam.controller;

import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    // Creating user
    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        Set<UserRole> roles = new HashSet<>();
        roles.add(new )
        return this.userService.createUser(user,userset);

    }
}
