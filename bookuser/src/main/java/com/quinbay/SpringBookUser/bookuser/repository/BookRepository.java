package com.quinbay.SpringBookUser.bookuser.repository;


import com.quinbay.SpringBookUser.bookuser.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
