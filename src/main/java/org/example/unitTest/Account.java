package org.example.unitTest;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private Double balance;
    private  Double transactionFee;


    public void withdraw(double value) {
        this.balance -= value;
    }
}
