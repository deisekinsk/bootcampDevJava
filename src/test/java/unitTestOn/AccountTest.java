package unitTestOn;


import org.example.unitTest.Account;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void withDrawTest(){

        Double initialBalance = 1500.00;
        Double transactionFee = 0.55;
        Double amountToWithdraw = 20.00;
        Double expectedBalance = initialBalance - amountToWithdraw - transactionFee;


        Account account = new Account(initialBalance, transactionFee );

        System.out.println("Initial Balance: " + account.getBalance());
        account.withdraw(20.00);
        System.out.println("final Balance: " + account.getBalance());
        //System.out.println(account);
        assertEquals(expectedBalance, account.getBalance());
 }



}
