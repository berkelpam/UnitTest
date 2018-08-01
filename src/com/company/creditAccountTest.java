package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class creditAccountTest {

    @Test
    public void overdrawCreditAccount() throws Exception {
        creditAccount bankAccount = new creditAccount("Jan", "Jansen", 100);
        bankAccount.withdraw(101, false,bankAccount.isOverdrawAllowed());
        assertEquals(-1, bankAccount.getBalance(), 0);
    }

}