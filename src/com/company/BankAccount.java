package com.company;

/**
 * Created by paulvanberkel on 30/07/2018.
 */
public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        firstName = firstName;
        lastName = lastName;
        balance = balance;
    }

//    branch argument is true when customer is performing the transaction with a teller.
//    branch argument is false when the customer is performing the transaction at an ATM.

    public double getBalance() {
        return balance;
    }

    public double deposit (double amount, boolean branch){
        balance += amount;

        return balance;
    }

    public double withdraw (double amount, boolean branch){
        balance -= amount;
        return balance;
    }

    public void Cancel() {

    }

    private void EmptyAccount(){
        balance=0;
    }
}
