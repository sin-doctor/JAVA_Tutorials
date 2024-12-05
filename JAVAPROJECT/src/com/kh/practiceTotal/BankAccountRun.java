package com.kh.practiceTotal;

public class BankAccountRun {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("123-456",1000);
        bankAccount.deposit(10000);        bankAccount.withdraw(5000);

        bankAccount.withdraw(150000000);
    }
}
