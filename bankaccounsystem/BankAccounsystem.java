/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccounsystem;

/**
 *
 * @author fa_50
 */
public class BankAccounsystem {

    public static void main(String[] args) {
        Account.setAnnualInterest(4.5);
        Account obj [] = new Account[3];
        obj [0] = new Account(102,2500);
        obj [1] = new Account(103,2115.0);
        obj [2] = new Account(104,4500);
        
        System.out.println("Wellcome to the account");

        for(Account z:obj){
        z.withdraw(1000);
        z.deposit(4000);
        System.out.println("the information "+z.getInfo());
        System.out.println("the monthly interest "+z.getMonthlyInterest());
        }

    }
}
