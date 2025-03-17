package org.example;

public class TestAbstractClass {


    public static void main(String[] args){
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.printExtract();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.printExtract();

    }
}
