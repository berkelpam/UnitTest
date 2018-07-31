package com.company;

public class creditAccount extends BankAccount {

    private final boolean negativeSaldoAllowed=true;

    public creditAccount(String firstName, String lastName, double balance) {
        super(firstName, lastName, balance);
    }
}
