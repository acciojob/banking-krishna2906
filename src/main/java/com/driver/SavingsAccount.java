package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {


        // minimum balance is 0 by default

    }
    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
        if(amount>5000){
            throw new Exception("Maximum Withdraw Limit Exceed");
        } else if(amount>getBalance()){
            throw new Exception("Insufficient Balance");
        }
        else{
            this.setBalance(getBalance()-amount);
        }

    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
        double simple_interest;
        simple_interest=(getBalance()*rate*years)/100;
        return simple_interest;
    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
        double compound_interest;
        compound_interest=getBalance()*(Math.pow((1+rate/100),years));
        return compound_interest;
    }

}
