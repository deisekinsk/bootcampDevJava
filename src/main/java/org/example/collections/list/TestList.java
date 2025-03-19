package org.example.collections.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {

        List<String> accounts = new ArrayList<>();

        accounts.add("Savings Account");
        accounts.add("Checking Account");
        accounts.add("Payment Account");
        accounts.add("Savings Account");


        System.out.println("Account 1: " + accounts.get(0));
        System.out.println("Account 2: " + accounts.get(1));
        System.out.println("Account 3: " + accounts.get(2));



    }


}
