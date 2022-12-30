package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        this.maxWithdrawalLimit=maxWithdrawalLimit;
        this.rate=rate;

        // minimum balance is 0 by default

    }
    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
        if(amount>5000){
            throw new Exception("Maximum Withdraw Limit Exceed");
        } else if(amount>this.getBalance()){
            throw new Exception("Insufficient Balance");
        }
        else{
            this.balance=balance-amount;
        }

    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount

    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year

    }

}
