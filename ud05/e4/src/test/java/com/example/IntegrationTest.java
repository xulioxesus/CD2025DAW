package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceIntegrationTest {

    @Test
    void shouldBorrowBookCorrectly() {
        LibraryService service = new LibraryService();

        Book book = new Book("123", "Clean Code");
        User user = new User("u1", "Ana");

        service.addBook(book);
        service.addUser(user);

        Loan loan = service.borrowBook("123", "u1");

        assertNotNull(loan);
        assertEquals(book, loan.getBook());
        assertEquals(user, loan.getUser());
        assertFalse(book.isAvailable());
        assertEquals(1, user.getLoans().size());
        assertTrue(user.getLoans().contains(loan));
        assertTrue(loan.isActive());
    }
}