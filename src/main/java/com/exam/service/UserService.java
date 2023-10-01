package com.exam.service;

import com.exam.entity.User;
import com.exam.entity.UserRole;

import java.util.Set;

public interface UserService {

    // Creating user
    public User createUser(User user , Set<UserRole>userRoles) throws Exception;
}
