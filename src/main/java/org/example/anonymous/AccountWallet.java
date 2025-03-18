package org.example.anonymous;

public class AccountWallet {

    Account checkingAccount = new Account(){
        @Override
        public void printAccountType() {
            System.out.println("Checking Account");
        }
    };

    //anonymous class
    Account savingsAccount = new Account(){
        @Override
        public void printAccountType() {
            System.out.println("Savings Account");
        }
    };

}

