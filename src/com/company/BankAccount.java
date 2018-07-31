package com.company;

/**
 * Created by paulvanberkel on 30/07/2018.
 */
public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;
    private final boolean overdrawAllowed = false;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

//    branch argument is true when customer is performing the transaction with a teller.
//    branch argument is false when the customer is performing the transaction at an ATM.

    public double getBalance() {
        return balance;
    }

    public boolean isOverdrawAllowed() {
        return overdrawAllowed;
    }

    public double deposit(double amount, boolean branch) {
        balance += amount;

        return balance;
    }

    public double withdraw(double amount, boolean branch, boolean overdrawAllowed) {
        if (amount > 0) {
            if (overdrawAllowed) {
                balance -= amount;
            } else {
                if (amount < balance) {
                    //withdaw allowed
                    balance -= amount;
                } else {
                    //withdraw not allowed
                    System.out.println("Cannot withdraw more than the current balance.");
                }
            }
        } else {
            System.out.println("Cannot withdraw a negative amount.");
        }
        return balance;
    }

    public void Cancel() {
        emptyAccount();
    }

    private void emptyAccount() {
        this.balance = 0;
    }
}
