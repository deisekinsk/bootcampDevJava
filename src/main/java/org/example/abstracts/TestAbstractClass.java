package org.example.abstracts;

public class TestAbstractClass {


    public static void main(String[] args){
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.printReport();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.printReport();

    }
}
