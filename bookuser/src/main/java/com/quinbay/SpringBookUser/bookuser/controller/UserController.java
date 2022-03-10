package com.quinbay.SpringBookUser.bookuser.controller;

import com.quinbay.SpringBookUser.bookuser.entity.User;
import com.quinbay.SpringBookUser.bookuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/all-user")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/add-user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @PutMapping("/update-user")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @DeleteMapping("/delete-user")
    public void deleteUser(@RequestParam(value = "id") Long id){
        userService.deleteUser(id);
    }
}
