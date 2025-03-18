package org.example.anonyms;

public class TestAnonymsClass {
    public static void main(String[] args) {
        AccountWallet wallet = new AccountWallet();

        wallet.savingsAccount.printAccountType();
        wallet.checkingAccount.printAccountType();
    }
}
