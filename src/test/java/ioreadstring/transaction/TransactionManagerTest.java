package ioreadstring.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionManagerTest {

    private TransactionManager tm = new TransactionManager();
    @Test
    void readAccounts() {
        assertEquals(0,tm.getAccountList().size());

        tm.readAccounts();

        assertEquals(5,tm.getAccountList().size());
        assertEquals("Jack Doe",tm.getAccountList().get(3).getName());
        assertEquals(234050200,tm.getAccountList().get(1).getBalance(),0.0000001);
    }

    @Test
    void runTransactions() {
        tm.readAccounts();
        tm.runTransactions();

        assertEquals(1201000,tm.getAccountList().get(0).getBalance(),0.0000001);
        assertEquals(721220,tm.getAccountList().get(3).getBalance(),0.00001);
    }
}