package org.example.switchCase;

public class TestSwitchCase {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount();
        Account checkingAccount = new CheckingAccount();

        printAccountType(savingsAccount);
    }

    private static void printAccountType(Account account){
        switch (account.getAccountType()){
            case "Savings Account":
                System.out.println("Type: Savings");
            case "Checking Account":
                System.out.println("Type: Checking");
            default:
                System.out.println("Not find");
        }
    }

}
