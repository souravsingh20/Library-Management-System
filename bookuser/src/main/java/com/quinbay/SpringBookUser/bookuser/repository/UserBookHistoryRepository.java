package com.quinbay.SpringBookUser.bookuser.repository;


import com.quinbay.SpringBookUser.bookuser.entity.UserBookHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBookHistoryRepository extends CrudRepository<UserBookHistory, Long> {
}
