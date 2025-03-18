package org.example.anonymous;

public class TestAnonymousClass {
    public static void main(String[] args) {
        AccountWallet wallet = new AccountWallet();

        wallet.savingsAccount.printAccountType();
        wallet.checkingAccount.printAccountType();
    }
}
