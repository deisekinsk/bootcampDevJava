package org.example.interfaces;

public class CheckingAccount implements Account{

    private Double balance = 0.0;
    private final Double operationFee = 0.60;

    @Override
    public void deposit (Double value){
        this.balance += value;
    }

    @Override
    public void withdraw(Double value){
        this.balance -= value;
    }


    public Double getBalance() {
        return this.balance;
    }


}
