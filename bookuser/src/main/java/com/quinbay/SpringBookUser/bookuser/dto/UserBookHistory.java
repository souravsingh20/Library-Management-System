package com.quinbay.SpringBookUser.bookuser.dto;


import javax.persistence.*;
import java.io.Serializable;

public class UserBookHistory implements Serializable {


    private Long id;

    public UserBookHistory(Long id, String startDate, String endDate, Long bid, Long uid) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.id = id;
        this.bid = bid;
        this.uid = uid;
    }

    private String startDate;
    private String endDate;
    private Long bid;
    private Long uid;


    public UserBookHistory(){}

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {

        this.startDate = startDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
