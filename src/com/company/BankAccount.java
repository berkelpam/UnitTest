package com.company;

/**
 * Created by paulvanberkel on 30/07/2018.
 */
public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

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

    public double deposit (double amount, boolean branch){
        balance += amount;

        return balance;
    }

    public double withdraw (double amount, boolean branch){

        if ((amount>0)&& (amount < balance)) {
            balance -= amount;
        }
        else{
            if (amount<0){
                System.out.println("Cannot withdraw a negative amount.");
            }else{
                System.out.println("Cannot withdraw more than the current balance.");
            }
        }

        return balance;
    }

    public void Cancel() {
       emptyAccount();
    }

    private void emptyAccount() {
        this.balance=0;
    }
}
