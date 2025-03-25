package org.example.exceptions;


import lombok.*;

@Data
public class Account {

    private String accountType;
    private Double balance;
    private Double transactionFee;

    public void setBalance(Double balance){
        this.balance = balance;
    }

    public void setTransactionFee(Double transactionFee){
        this.transactionFee = transactionFee;
    }

    public Double getBalance(){
        return balance;
    }


    public void withdraw(Double value) throws Exception{
        Double totalWithdraw = value + this.transactionFee;

        if(this.balance <=0 || this.balance < totalWithdraw){
            throw new Exception("Insufficient balance");
        }

        if (value == 0){
            throw new ExceptionWithdrawZero();
        }

        this.balance -= totalWithdraw;

    }


}
