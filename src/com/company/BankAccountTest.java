package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by paulvanberkel on 30/07/2018.
 */
public class BankAccountTest {
    @Test
    public void getBalance() throws Exception {
        BankAccount bankAccount = new BankAccount("Jan", "Jansen", 2300);
        assertEquals(2300, bankAccount.getBalance(), 0);
    }

    @Test
    public void deposit() throws Exception {
        BankAccount bankAccount = new BankAccount("Jan", "Jansen", 2300);
        bankAccount.deposit(1200, false);
        assertEquals(3500, bankAccount.getBalance(), 0);
    }

    @Test
    public void withdraw() throws Exception {
        BankAccount bankAccount = new BankAccount("Jan", "Jansen", 2300);
        bankAccount.withdraw(1200, false);
        assertEquals(1100, bankAccount.getBalance(), 0);
    }

    @Test
    public void cancelAccount() throws Exception {
        BankAccount bankAccount = new BankAccount("Jan", "Jansen", 1000);
        bankAccount.Cancel();
        assertEquals(0, bankAccount.getBalance(), 0);
    }

    @Test
    public void overdrawAccount() throws Exception {
        BankAccount bankAccount = new BankAccount("Jan", "Jansen", 100);
        bankAccount.withdraw(101, false);
        assertEquals(100, bankAccount.getBalance(), 0);
    }

    @Test
    public void withdrawNegativeAmount() throws Exception {
        BankAccount bankAccount = new BankAccount("Jan", "Janssen", 1);
        bankAccount.withdraw(-1, false);
        assertEquals(1, bankAccount.getBalance(), 0);
    }

}