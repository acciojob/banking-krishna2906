package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        // minimum balance is 0 by default
        this.rate=rate;
        this.maxWithdrawalLimit=maxWithdrawalLimit;
    }
    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
        if(amount>maxWithdrawalLimit){
            throw new Exception("Maximum Withdraw Limit Exceed");
        }
        if(amount>getBalance()){
            throw new Exception("Insufficient Balance");
        }
    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
        double finalAmount=0;
        double ans=(getBalance()/100)*rate;
        finalAmount=years*ans;
        return finalAmount;
    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
        double ans=0;
        ans=getBalance()*(1+times)*years;
        return ans;
    }

    public double getRate() {
        return rate;
    }

    public double getMaxWithdrawalLimit() {
        return maxWithdrawalLimit;
    }
}
