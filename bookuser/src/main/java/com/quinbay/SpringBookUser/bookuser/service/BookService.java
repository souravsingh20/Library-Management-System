package com.quinbay.SpringBookUser.bookuser.service;

import com.quinbay.SpringBookUser.bookuser.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    void addBook(Book book);
}
