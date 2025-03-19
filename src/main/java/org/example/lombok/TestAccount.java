package org.example.lombok;

public class TestAccount {


    public static void main(String[] args){

        Account accountMember = new Account();

        accountMember.setId(1L);
        accountMember.setName("Diana More");
        accountMember.setBirthYear(1983);

        System.out.println(accountMember.getId());
        System.out.println(accountMember.getName());
        System.out.println(accountMember.getBirthYear());

        System.out.println(accountMember);

    }



}
