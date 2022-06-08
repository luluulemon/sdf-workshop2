package vtp2022.day2.workshop;
//packge to generate UUID

import java.util.UUID;
import java.time.*;
import java.util.LinkedList;
import java.util.List;

public class bankAccount {
    private String name = "";
    private String acctId = UUID.randomUUID().toString().substring(0,8);
    private float balance = 0f;
    private List<String> transaction = new LinkedList<>();
    private Boolean isClosed = false;
    private LocalDateTime accountCreationDate;
    private LocalDateTime accountClosingDate;

    public bankAccount(String name){
        this.name = name; }

    public bankAccount(String name, float InitialBal){
        this.name = name;
        this.balance = InitialBal;
    }
    
    public String getName() { return name; }
    public Boolean isClosed(){ return this.isClosed; }
    public String getAcctId() { return acctId; }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public List<String> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<String> transaction) {
        this.transaction = transaction;
    }


    public float withdraw(String withdrawAmt){
        Float withdrawAmtF = null;
        try{
            withdrawAmtF = Float.parseFloat(withdrawAmt);     // withdrawAmtF is alr a float? y use floatvalue
            if(withdrawAmtF.floatValue() <= 0){
                throw new IllegalArgumentException("Amount cannot be negative or kosong!");
            }
            if(this.isClosed()){
                throw new IllegalArgumentException("Account closed lea");
            }
            if(withdrawAmtF > this.balance){    
                throw new IllegalArgumentException("Ooi not enuf money la");
            }
            this.balance -= withdrawAmtF.floatValue();
            
            StringBuilder txnStrbld = new StringBuilder();
            txnStrbld.append("Deposit $");
            txnStrbld.append(withdrawAmtF.floatValue());
            txnStrbld.append(" at ");
            txnStrbld.append(LocalDateTime.now());
            System.out.println(txnStrbld.toString());
            

        }catch(NumberFormatException e){
            System.err.print(e);
            throw new IllegalArgumentException("Invalid deposit amount");
        }
        return this.balance;
    }

    public void deposit(String depositAmt){
        try{
            Float depositAmtF = Float.parseFloat(depositAmt);
            if(depositAmtF.floatValue() <= 0){
                throw new IllegalArgumentException("Amount cannot be negative or kosong!");
            }
            if(this.isClosed()){
                throw new IllegalArgumentException("Account closed lea");
            }
            this.balance += depositAmtF.floatValue();
            
            StringBuilder txnStrbld = new StringBuilder();
            txnStrbld.append("Deposit $");
            txnStrbld.append(depositAmtF.floatValue());
            txnStrbld.append(" at ");
            txnStrbld.append(LocalDateTime.now());
            System.out.println(txnStrbld.toString());
            

        }catch(NumberFormatException e){
            System.err.print(e);
            throw new IllegalArgumentException("Invalid deposit amount");
        }
    }
}
