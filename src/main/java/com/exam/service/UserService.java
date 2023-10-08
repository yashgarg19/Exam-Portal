package com.exam.service;

import com.exam.entity.User;
import com.exam.entity.UserRole;

import java.util.Set;

public interface UserService {

    // Creating user
    public User createUser(User user , Set<UserRole>userRoles) throws Exception;

    public User getUser(String username);

//    public Void deleteUsername(String username);

    public void deleteUser(Long userId);

}
