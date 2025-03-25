package org.example.switchCase;


public class CheckingAccount implements Account {

    private final String accountType;

    public CheckingAccount(){
        this.accountType = "Checking Account";
    }

    @Override
    public String getAccountType(){
        return this.accountType;
    }


}
