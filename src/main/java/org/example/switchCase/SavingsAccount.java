package org.example.switchCase;

public class SavingsAccount implements Account{

    private final String accountType;

    public SavingsAccount(){
        this.accountType = "Savings Account";
    }

    @Override
    public String getAccountType(){
        return this.accountType;
    }

}
