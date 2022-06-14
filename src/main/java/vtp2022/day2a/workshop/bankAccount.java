package vtp2022.day2a.workshop;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class bankAccount {
    private String username;
    private int accNum;
    private float balance;
    private String transaction;
    private boolean isClosed;
    private LocalDateTime accOpening;
    private LocalDateTime accClosing;

    List<String> Transactions = new ArrayList<>();

    // 1st constructor
    public bankAccount(String name){
        this.username = name;
        this.accNum = ThreadLocalRandom.current().nextInt(10000000,99999999);
        accOpening = LocalDateTime.now();
        balance = 0;
    }

    // 2nd constructor (overloading)
    public bankAccount(String name, float iniDeposit){
        this.username = name;
        this.accNum = ThreadLocalRandom.current().nextInt(10000000,99999999);
        accOpening = LocalDateTime.now();
        balance = iniDeposit;
    }

    public String getUsername() { return username; }
    public int getAccNum() { return accNum; }

    public float getBalance(){ return balance; }
    public void setBalance(float amt){ balance += amt; }

    public boolean isAccClosed(){ return isClosed; } 
    public void closeAcc(){ isClosed = true; }

    public LocalDateTime getAccOpening() { return accOpening; }
    public void setAccClosing() { accClosing = LocalDateTime.now(); }


    public void deposit(Float depositAmt){ 
        if (depositAmt <= 0){
            throw new IllegalArgumentException("Must be greater than 0");       }
        
        balance += depositAmt;

        transaction = "Deposited " + depositAmt + " to " + username 
                        + " at " + LocalDateTime.now();
        Transactions.add(transaction);
        System.out.println(transaction);
    }
    
    public void withdraw(Float withdrawAmt){
        if (withdrawAmt > getBalance() || withdrawAmt <= 0) {
            System.out.println("Pls enter proper withdrawal amount");
            throw new IllegalArgumentException();        }   
        else {
        balance -= withdrawAmt;
        transaction = "Withdrawn "+ withdrawAmt +" from " + getUsername() + " at " 
        + LocalDateTime.now() + "\n" + 
        "Current balance is " + getBalance() ;
        
        Transactions.add(transaction);
        System.out.println(transaction); }
    }
    
    public void printStatement(){   
        for (String statements: Transactions){ System.out.println(statements);}
    }

}
