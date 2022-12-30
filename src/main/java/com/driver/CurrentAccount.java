package com.driver;
import java.util.*;

public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {

        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception


    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception
        Map<Character, Integer> freq = new HashMap<>();
        char [] str = tradeLicenseId.toCharArray();
        // To store the maximum frequency so far
        int max_freq = 0;
        for (int j = 0; j < (str.length); j++) {
            if (freq.containsKey(str[j])) {
                freq.put(str[j], freq.get(str[j]) + 1);
                if (freq.get(str[j]) > max_freq)
                    max_freq = freq.get(str[j]);
            }
            else {
                freq.put(str[j], 1);
                if (freq.get(str[j]) > max_freq)
                    max_freq = freq.get(str[j]);
            }
        }

        // If possible
        boolean possible = false;
        if (max_freq <= (str.length - max_freq + 1))
            possible=true;
        if(!possible){
            throw new Exception("Valid License can not be generated");
        }
    }

}
