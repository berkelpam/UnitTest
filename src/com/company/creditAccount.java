package com.company;

public class creditAccount extends BankAccount {

    private final boolean overdrawAllowed = true;

    public creditAccount(String firstName, String lastName, double balance) {
        super(firstName, lastName, balance);
    }

    @Override
    public boolean isOverdrawAllowed() {
        return overdrawAllowed;
    }
}
