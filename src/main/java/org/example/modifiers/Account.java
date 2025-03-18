package org.example.modifiers;

public class Account {

    private Double balance;
    private String accountNameOwner;

    public Account(double value) {
        this.balance = value;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance += balance;
    }



}
