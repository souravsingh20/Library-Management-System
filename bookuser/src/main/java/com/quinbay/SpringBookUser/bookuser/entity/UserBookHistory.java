package com.quinbay.SpringBookUser.bookuser.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_book_history")
public class UserBookHistory {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startDate;
    private String endDate;

    @ManyToOne
    @JoinColumn(name = "bookId", referencedColumnName = "bookId")
    Book book;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    User user;

    public UserBookHistory(){}

    public UserBookHistory(String startDate, String endDate, Long book, Long user) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.book.bookId  = book;
        this.user.userId = user;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


}

