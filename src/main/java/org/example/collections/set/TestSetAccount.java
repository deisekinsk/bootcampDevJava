package org.example.collections.set;

import java.util.HashSet;
import java.util.Set;

public class TestSetAccount {

    public static void main(String[] args) {

        Set<Account> accounts = new HashSet<>();

        accounts.add(new Account(100L, 12.00));
        accounts.add(new Account(103L, 72.00));

        accounts.forEach(account -> System.out.println( account));


    }


}
