package vtp2022.day2a.workshop;

public class fixedDepositAccount extends bankAccount{
    
    private float interest = 3.0f;
    private int duration = 6;
    private int changeCounter = 0;


    // overloading 3 constructors: as per requirements
    public fixedDepositAccount(String name, float balance)
        {   super(name, balance);    }
        
    public fixedDepositAccount(String name, float balance, Float interest){
        super(name, balance);
        this.interest = interest;
            }

    public fixedDepositAccount(String name, Float balance, Float interest, Integer duration){
        super(name, balance);
        this.interest = interest;
        this.duration = duration;
    }

    public float getInterest(){ return interest; }
    public int getDuration(){ return duration; }

    public void changeInterestnDuration(float interest, int duration){
        if (changeCounter > 0){ throw new IllegalArgumentException(); }
        else
        {   this.interest = interest;
            this.duration = duration; 
            changeCounter ++;

            System.out.printf("%s FDaccount changed to %.2f interest and %d months duration",
                getUsername(), interest, duration);
        }
    }       
    
    @Override
    public float getBalance(){
        return super.getBalance() + interest; 
    }

    @Override
    public void deposit(Float depositAmt){   }

    @Override
    public void withdraw(Float withdrawAmt){ }



}
