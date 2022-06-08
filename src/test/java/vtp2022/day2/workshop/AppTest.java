package vtp2022.day2.workshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testBankAccount()
    {
        // test deposit
        System.out.println( "My ATM Machine - POSSBank" );
        bankAccount LuAccount = new bankAccount("Lu");
        LuAccount.deposit("100");
        System.out.println("my new balance = " + LuAccount.getBalance());

        LuAccount.withdraw("98");
        System.out.println("my new balance = " + LuAccount.getBalance());
        float finalBalance = LuAccount.withdraw(("1"));
        assertEquals( 1, finalBalance, .1 );
    }


}
