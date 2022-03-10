package com.quinbay.SpringBookUser.bookuser.service;

import com.quinbay.SpringBookUser.bookuser.entity.UserBookHistory;

import java.util.List;

public interface UserBookHistoryService {
//    List<UserBookHistory> getAllUserBookHistory();
    void issueABook(com.quinbay.SpringBookUser.bookuser.dto.UserBookHistory userBookHistory);
    void returnABook(com.quinbay.SpringBookUser.bookuser.dto.UserBookHistory userBookHistory);
    Object getPopularBook();
}
