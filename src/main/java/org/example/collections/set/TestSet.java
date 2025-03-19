package org.example.collections.set;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {

        Set<String> accounts = new HashSet<>();

        accounts.add("Savings Account");
        accounts.add("Checking Account");
        accounts.add("Payment Account");
        accounts.add("Savings Account");

        accounts.forEach(account -> {
            System.out.println("Account -> " + account + " | " + account.hashCode()) ;
        });



    }


}
