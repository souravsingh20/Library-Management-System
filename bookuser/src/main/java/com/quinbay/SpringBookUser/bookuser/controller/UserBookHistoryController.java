package com.quinbay.SpringBookUser.bookuser.controller;

import com.quinbay.SpringBookUser.bookuser.entity.UserBookHistory;
import com.quinbay.SpringBookUser.bookuser.service.UserBookHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user-book")
public class UserBookHistoryController {
    @Autowired
    UserBookHistoryService userBookHistoryService;

//    @GetMapping("/userbook")
//    public List<UserBookHistory> getAllUserBookHistory(){
//        return userBookHistoryService.getAllUserBookHistory();
//    }

    @PostMapping("/issue-book")
    public void addUserBookHistory(@RequestBody com.quinbay.SpringBookUser.bookuser.dto.UserBookHistory userBookHistory){
        userBookHistoryService.issueABook(userBookHistory);
    }

    @PutMapping("/return-book")
    public void returnABook(@RequestBody com.quinbay.SpringBookUser.bookuser.dto.UserBookHistory userBookHistory){
        userBookHistoryService.returnABook(userBookHistory);
    }

    @GetMapping("/popular-book")
    public Object popularBook(){
        return userBookHistoryService.getPopularBook();
    }
}
