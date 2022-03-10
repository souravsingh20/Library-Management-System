package com.quinbay.SpringBookUser.bookuser.controller;


import com.quinbay.SpringBookUser.bookuser.entity.Book;
import com.quinbay.SpringBookUser.bookuser.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/get-all-books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("/add-book")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }
}
