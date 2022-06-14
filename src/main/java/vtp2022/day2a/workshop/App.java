package vtp2022.day2a.workshop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Test bank Acc" );
        bankAccount LuAcc = new bankAccount("Lu", 100);

        System.out.println(LuAcc.getAccNum());
        LuAcc.deposit(56.7f);
        LuAcc.withdraw(150f);

        LuAcc.printStatement();

        System.out.println("\nTest for fixed D Acc");
        fixedDepositAccount LuFD = new fixedDepositAccount("Lu", 108f, 4f, 11);

        LuFD.changeInterestnDuration(3f, 6);
        
    }
}
