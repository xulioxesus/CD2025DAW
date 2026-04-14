package com.example;

import java.util.HashMap;
import java.util.Map;

public class LibraryService {

    private Map<String, Book> books = new HashMap<>();
    private Map<String, User> users = new HashMap<>();

    public void addBook(Book book) {
        if (books.containsKey(book.getIsbn())) {
            throw new IllegalArgumentException("Book already exists");
        }
        books.put(book.getIsbn(), book);
    }

    public void addUser(User user) {
        if (users.containsKey(user.getId())) {
            throw new IllegalArgumentException("User already exists");
        }
        users.put(user.getId(), user);
    }

    public Loan borrowBook(String isbn, String userId) {
        Book book = books.get(isbn);
        User user = users.get(userId);

        if (book == null || user == null) {
            throw new IllegalArgumentException("Invalid data");
        }

        book.borrow();

        Loan loan = new Loan(book, user);
        user.addLoan(loan);

        return loan;
    }

    public void returnBook(Loan loan) {
        if (!loan.isActive()) {
            throw new IllegalStateException("Loan already closed");
        }

        loan.closeLoan();
        loan.getBook().giveBack();
        loan.getUser().removeLoan(loan);
    }
}