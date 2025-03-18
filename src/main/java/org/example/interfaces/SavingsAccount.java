package org.example.interfaces;

public class SavingsAccount  implements  Account{

    private Double balance = 0.0;

    @Override
    public void deposit (Double value){
        this.balance += value;
    }

    @Override
    public void withdraw (Double value){
        this.balance -= value;
    }


    public Double getBalance() {
        return this.balance;
    }
}
