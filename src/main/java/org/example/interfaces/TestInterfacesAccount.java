package org.example.interfaces;

public class TestInterfacesAccount {

    public static void main (String[] args){
        ChenkingAccount chenkingAccount = new ChenkingAccount();
        chenkingAccount.deposit(8000.00);
        System.out.println(chenkingAccount.getBalance());


        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(17000.00);
        System.out.println(savingsAccount.getBalance());
    }
}
