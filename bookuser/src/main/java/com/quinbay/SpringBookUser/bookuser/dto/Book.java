package com.quinbay.SpringBookUser.bookuser.dto;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Book implements Serializable {

    public Book(Long bookId, String bookName, String writer, String summary, String category) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.writer = writer;
        this.summary = summary;
        this.category = category;
    }

    public Book(){}

    public Long bookId;

    @NotBlank(message = "Book Name cannot be null")
    private String bookName;

    @NotBlank(message = "Writer cannot be null")
    private String writer;
    private String summary;
    private String category;


    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
