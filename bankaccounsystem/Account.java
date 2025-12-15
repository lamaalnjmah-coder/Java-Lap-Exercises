/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankaccounsystem;

/**
 *
 * @author fa_50
 */
public class Account {
    private int id;
    private double balance;
    private static double annualInterest;
    
    public Account(){
    id=0;
    balance=0.0;
    }
    public Account(int id,double balance){
    this.id=id;
    this.balance=balance;
    
    }
    
    public void deposit(double amount){
    balance+=amount;
    }
    public void withdraw(double amount){
    if(amount<balance)
        balance-=amount;
    
        }
    public static void setAnnualInterest(double rate){
    annualInterest=rate;
    }
    public double getMonthlyInterest(){
    double monthlyInterestRate=annualInterest/12;
    double monthlyInterest=balance*(monthlyInterestRate/100);
    return monthlyInterest;
    }
    public String getInfo(){
    return "Account ID: "+id+" , Balance: "+balance;
    }
    }

