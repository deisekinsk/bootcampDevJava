package org.example.localDate;

import java.time.LocalDate;

public class AccountDate {


    public static void main(String[] args){

        LocalDate getData = LocalDate.now();

        System.out.println("Day of week: " + getData.getDayOfWeek().name());
        System.out.println("Month value: " + getData.getMonthValue());
        System.out.println("Month: " + getData.getMonth());
        System.out.println("Year: " + getData.getYear());
        

    }



}
