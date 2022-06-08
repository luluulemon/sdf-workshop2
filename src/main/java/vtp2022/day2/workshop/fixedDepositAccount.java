package vtp2022.day2.workshop;

public class fixedDepositAccount extends bankAccount {
    private float interest = 3;
    private int duration = 6;
    private int durationInterestCounter = 0;

    public int getDuration() { return duration;}
    
    private void setDuration(int duration) {
        if(duration <= 0)
        { throw new IllegalArgumentException("more than 0 pls"); }

        this.duration = duration;   }

    private void setInterest(float interest) {
        if(duration <= 0)
            { throw new IllegalArgumentException("more than 0 pls"); }
    
        this.interest = interest;   }


    public void setDurationAndInterst(int duration, float interest){
        if(durationInterestCounter == 1)
        { throw new IllegalArgumentException("Can only change one time"); }
        setDuration(duration);
        setInterest(interest);

        durationInterestCounter ++;
    }
                                        

    // overload constructors
    public fixedDepositAccount(String name, float amount){
        super(name, amount);
    }

    public fixedDepositAccount(String name, float amount, float interest){
        super(name, amount);
        this.interest = interest;
    }

    public fixedDepositAccount(String name, float amount, float interest, int duration){
        super(name, amount);
        this.interest = interest;
        this.duration = duration;
    }

    @Override
    public float getBalance(){ return super.getBalance() + interest; }

    @Override
    public float withdraw(String withdrawAmt){ //NOP
        return 0; }

    @Override
    public void deposit(String depositAmt){ //NOP
         }
}
