package com.exam.entity;

import jakarta.persistence.*;

@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleID;

    //user
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    @ManyToOne
    private Role role;

    public Long getUserRoleID() {
        return userRoleID;
    }

    public void setUserRoleID(Long userRoleID) {
        this.userRoleID = userRoleID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public UserRole() {

    }
}
