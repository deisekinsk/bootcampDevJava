package org.example.collections.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamList {

    public static void main(String[] args) {

        List<String> accounts = new ArrayList<>();

        accounts.add("Savings Account");
        accounts.add("Checking Account");
        accounts.add("Payment Account");
        accounts.add("Savings Account");

        //STREAM
        accounts.stream()
                .filter(account -> getFilterList(account))
                .forEach(account -> System.out.println("Account" + account));

        long totalSavings = accounts.parallelStream()
                .filter(account -> getFilterList(account))
                .count();

        System.out.println("Total Savings (stream): " + totalSavings);

        //restart totalSavings
        totalSavings = 0;

        for(String account : accounts){
            if(getFilterList(account)){
                totalSavings++;
            }

        }

        System.out.println("Total Savings (for-each): " + totalSavings);



    }

    public static Boolean getFilterList(String account){
        return account.contains("Savings");
    }
}
