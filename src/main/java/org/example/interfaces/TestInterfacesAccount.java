package org.example.interfaces;

public class TestInterfacesAccount {

    public static void main (String[] args){
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.deposit(8000.00);
        System.out.println(checkingAccount.getBalance());


        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(17000.00);
        System.out.println(savingsAccount.getBalance());
    }
}
