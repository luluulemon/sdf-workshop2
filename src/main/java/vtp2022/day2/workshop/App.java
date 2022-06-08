package vtp2022.day2.workshop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My ATM Machine - POSSBank" );
        bankAccount LuAccount = new bankAccount("Lu");
        LuAccount.deposit("100");
        System.out.println("my new balance = " + LuAccount.getBalance());

        LuAccount.withdraw("101");
        System.out.println("my new balance = " + LuAccount.getBalance());
    }
}
