package com.quinbay.SpringBookUser.bookuser.service;

import com.quinbay.SpringBookUser.bookuser.entity.Book;
import com.quinbay.SpringBookUser.bookuser.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            Book b1 = new Book();
            b1.setBookId(book.getBookId());
            b1.setBookName(book.getBookName());
            b1.setWriter(book.getWriter());
            b1.setSummary(book.getSummary());
            b1.setCategory(book.getCategory());
            books.add(b1);
        }
        return  books;
    }

    @Override
    public void addBook(Book book) {
            Book book1 = new Book();
            book1.setBookId(book.getBookId());
            book1.setBookName(book.getBookName());
            book1.setWriter(book.getWriter());
            book1.setSummary(book.getSummary());
            book1.setCategory(book.getCategory());
            bookRepository.save(book1);
        }
    }

