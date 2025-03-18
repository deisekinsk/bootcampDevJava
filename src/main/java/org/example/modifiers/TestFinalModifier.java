package org.example.modifiers;

public class TestFinalModifier {

    final static Account accountFinal = new Account(5000.00);

    public static void main (String[] args){
        accountFinal.setBalance(250.00);
        System.out.println(accountFinal.getBalance());

    }

}
