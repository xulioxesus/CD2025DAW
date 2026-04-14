package com.example;
import java.time.LocalDate;

public class Loan {

    private Book book;
    private User user;
    private LocalDate startDate;
    private LocalDate endDate;

    public Loan(Book book, User user) {
        this.book = book;
        this.user = user;
        this.startDate = LocalDate.now();
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void closeLoan() {
        this.endDate = LocalDate.now();
    }

    public boolean isActive() {
        return endDate == null;
    }
}