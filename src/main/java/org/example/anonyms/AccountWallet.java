package org.example.anonyms;

public class AccountWallet {

    Account checkingAccount = new Account(){
        @Override
        public void printAccountType() {
            System.out.println("Checking Account");
        }
    };


    Account savingsAccount = new Account(){
        @Override
        public void printAccountType() {
            System.out.println("Savings Account");
        }
    };

}

