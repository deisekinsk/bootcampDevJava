package org.example.modifiers;

public class CheckingAccount {

    public static void main(String[] args){

        Account account = new Account(5000.00);

        account.setBalance(100.59);
        System.out.println(account.getBalance());
    }

}
