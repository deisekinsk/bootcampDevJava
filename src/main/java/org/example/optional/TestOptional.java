package org.example.optional;

import org.example.collections.set.Account;

import java.util.Optional;

public class TestOptional {

    public static void main(String[] args) {

        //Optional<Account> optAccount = getAccountWithoutError();

        Optional<Account> optAccount = Optional.ofNullable(Account.builder().accountNumber(2156L).balance(525.88).build());

        if(optAccount.isPresent())
        {
            System.out.println("Balance: " + optAccount.get().getBalance());
            System.out.println("Account Number: " + optAccount.get().getAccountNumber());

        }else{
            System.out.println("Account not find!");
        }

    }

    public static Account getAccount(){
        return null;
    }

    public static Optional<Account> getAccountWithoutError(){

        return Optional.ofNullable(null);
    }
}
