package org.example.exceptions;


public class TestAccountExpection {

    public static void main(String[] args) {

        Account account = new Account();

        account.setBalance(00.00);
        account.setTransactionFee(0.55);

        try {
            account.withdraw(0.00);
        } catch (ExceptionWithdrawZero e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Balance: " + account.getBalance());
        }


    }

}
