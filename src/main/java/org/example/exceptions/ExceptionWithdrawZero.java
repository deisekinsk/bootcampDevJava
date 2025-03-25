package org.example.exceptions;

public class ExceptionWithdrawZero extends Exception{

    public ExceptionWithdrawZero() {
        super("Withdrawal amount cannot be zero.");
    }
}
