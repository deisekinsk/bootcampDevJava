package org.example.collections.set;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private Long accountNumber;
    private Double balance;


    @Override
    public int hashCode(){
        return accountNumber.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        Account account = (Account) obj;
        //lombok:  getAccountNumber
        return this.accountNumber.equals(account.accountNumber);
    }

}
