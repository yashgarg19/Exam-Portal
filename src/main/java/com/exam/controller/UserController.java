package com.exam.controller;

import com.exam.entity.Role;
import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //Creting user
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {

        Set<UserRole> roles = new HashSet<>();

        Role role = new Role();
        role.setRoleName("NORMAL");
        role.setRoleId(45L);

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        roles.add(userRole);

        return this.userService.createUser(user,roles);
    }
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {

        return this.userService.getUser(username);
    }

//    @DeleteMapping("/{username}")
//    public Void deleteUser(@PathVariable("username") String username ) {
//        return this.userService.deleteUsername(username);
//    }
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId ) {
            this.userService.deleteUser(userId);
    }

}
