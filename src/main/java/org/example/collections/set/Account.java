package org.example.collections.set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {

    private Long accountNumber;
    private Double balance;

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }



    @Override
    public int hashCode(){
        return accountNumber.hashCode();
    }

    @Override
    public boolean equals (Object obj){
        Account account = (Account) obj;
        //lombok:  getAccountNumber
        return this.accountNumber.equals(account.accountNumber);
    }

}
