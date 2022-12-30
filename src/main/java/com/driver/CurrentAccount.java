package com.driver;

public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only

    public String getTradeLicenseId() {
        return tradeLicenseId;
    }

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception
        this.tradeLicenseId=tradeLicenseId;
        if(balance<5000){
            throw new Exception("Insufficient Balance");
        }
    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing

        String temp=tradeLicenseId;
        char temp_1=temp.charAt(0);
        for(int i=1;i<temp.length();i++){
            char temp_2=temp.charAt(i);
            if(Character.isLowerCase(temp_1) || Character.isLowerCase(temp_2)|| temp_1==temp_2){
                throw new Exception("Valid License can not be generated");
            }else
                temp_1=temp_2;
        }
    }

}
