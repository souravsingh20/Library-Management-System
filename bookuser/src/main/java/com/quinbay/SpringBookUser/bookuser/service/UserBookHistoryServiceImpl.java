package com.quinbay.SpringBookUser.bookuser.service;

import com.quinbay.SpringBookUser.bookuser.entity.Book;
import com.quinbay.SpringBookUser.bookuser.entity.UserBookHistory;
import com.quinbay.SpringBookUser.bookuser.entity.User;
import com.quinbay.SpringBookUser.bookuser.entity.UserBookHistory;
import com.quinbay.SpringBookUser.bookuser.repository.BookRepository;
import com.quinbay.SpringBookUser.bookuser.repository.UserBookHistoryRepository;
import com.quinbay.SpringBookUser.bookuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserBookHistoryServiceImpl implements UserBookHistoryService {
    @Autowired
    UserBookHistoryRepository userBookHistoryRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    BookRepository bookRepository;

//    @Override
//    public List<UserBookHistory> getAllUserBookHistory() {
//        List<UserBookHistory> userBookHistories = new ArrayList<>();
//        for (UserBookHistory userBookHistory : userBookHistoryRepository.findAll()) {
//            UserBookHistory userBookHistory1 = new UserBookHistory();
//            userBookHistory1.setUser(userBookHistory.getUser());
//            userBookHistory1.setBook(userBookHistory.getBook());
//            userBookHistory1.setEndDate(userBookHistory.getEndDate());
//            userBookHistory1.setStartDate(userBookHistory.getStartDate());
//            userBookHistories.add(userBookHistory1);
//        }
//        return  userBookHistories;
//    }

    @Override
    public void issueABook(com.quinbay.SpringBookUser.bookuser.dto.UserBookHistory userBook){
        UserBookHistory userBookHistory = new UserBookHistory();

        Optional<User> byId=userRepository.findById(userBook.getUid());
        Optional<Book> byId1=bookRepository.findById(userBook.getBid());

        if(byId.isPresent() && byId1.isPresent()){
            userBookHistory.setBook(byId1.get());
            userBookHistory.setUser(byId.get());
            userBookHistory.setStartDate(userBook.getStartDate());
            userBookHistory.setEndDate(userBook.getEndDate());
            userBookHistoryRepository.save(userBookHistory);
        }

    }

    @Override
    public void returnABook(com.quinbay.SpringBookUser.bookuser.dto.UserBookHistory userBookHistory){
        for(UserBookHistory userBookHistory1 : userBookHistoryRepository.findAll()){
            if(userBookHistory1.getId()==userBookHistory.getId() && StringUtils.isEmpty(userBookHistory1.getEndDate())){
                userBookHistory1.setEndDate(userBookHistory.getEndDate());
                userBookHistoryRepository.save(userBookHistory1);
            }
        }
    }

    @Override
    public Object getPopularBook(){
        List<Long> bookList = new ArrayList<>();

        for(UserBookHistory userBookHistory1 : userBookHistoryRepository.findAll()){
            bookList.add(userBookHistory1.getId());
        }
        Object[] arr = bookList.toArray();

        int maxCounter = 0;
        Object element = arr[0];
        for (int i = 0; i <arr.length; i++) {
            int counter =1;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    counter++;
                }
            }
            if(maxCounter<counter){
                maxCounter=counter;
                element = arr[i];
            }
        }
        return element;

    }
}
