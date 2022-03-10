package com.quinbay.SpringBookUser.bookuser.dto;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;


public class User implements Serializable {

    public Long userId;

    @NotBlank(message = "User Name cannot be null")
    private String userName;

    private String address;
    private Long phoneNumber;

    public User(){}

    public User(Long userId, String userName,String address, Long phoneNumber){
        this.userId = userId;
        this.userName = userName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
