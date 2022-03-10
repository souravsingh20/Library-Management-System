package com.quinbay.SpringBookUser.bookuser.service;

import com.quinbay.SpringBookUser.bookuser.entity.User;
import com.quinbay.SpringBookUser.bookuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        for (User user : userRepository.findAll()) {
            User u1 = new User();
            u1.setUserId(user.getUserId());
            u1.setUserName(user.getUserName());
            u1.setAddress(user.getAddress());
            u1.setPhoneNumber(user.getPhoneNumber());
            users.add(u1);
        }
        return  users;
    }

    @Override
    public void addUser(User user) {
        User user1 = new User();
        user1.setUserId(user.getUserId());
        user1.setUserName(user.getUserName());
        user1.setAddress(user.getAddress());
        user1.setPhoneNumber(user.getPhoneNumber());
        userRepository.save(user1);
    }

    @Override
    public User updateUser(User user){
        Iterable<User> users = userRepository.findAll();
        for(User user1 : users){
            if(user1.getUserId() == user.getUserId()){
                user1.setUserName(user.getUserName());
                user1.setAddress(user.getAddress());
                user1.setPhoneNumber(user.getPhoneNumber());
                userRepository.save(user1);
            }
        }
        return user;
    }

    @Override
    public void deleteUser(Long userId){
        for(User user : userRepository.findAll()){
            if(user.getUserId()==userId){
                userRepository.deleteById(userId);
                break;
            }
        }
    }
}
