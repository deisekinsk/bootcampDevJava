package org.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {

        //List of Map > Map<String>, List<String>
        Map<String, String> accounts = new HashMap<>();

        accounts.put("Savings Account", "Will Smith");
        accounts.put("Checking Account", "Doechi");
        accounts.put("Payment Account", "Madonna");
        accounts.put("Savings Account", "Anitta");

        System.out.println(accounts+"\n");

        System.out.println(accounts.get("Savings Account"));

        System.out.println("\n"+accounts.keySet());


    }
}
