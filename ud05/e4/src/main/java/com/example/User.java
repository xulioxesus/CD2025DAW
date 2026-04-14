package com.example;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String id;
    private String name;
    private List<Loan> loans;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.loans = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void addLoan(Loan loan) {
        if (loans.size() >= 3) {
            throw new IllegalStateException("Max loans reached");
        }
        loans.add(loan);
    }

    public void removeLoan(Loan loan) {
        loans.remove(loan);
    }
}