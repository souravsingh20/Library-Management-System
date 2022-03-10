package com.quinbay.SpringBookUser.bookuser.service;

import com.quinbay.SpringBookUser.bookuser.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    User updateUser(User user);
    void deleteUser(Long userId);
}
