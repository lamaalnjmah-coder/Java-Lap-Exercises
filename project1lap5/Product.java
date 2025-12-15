/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project1lap5;

/**
 *
 * @author fa_50
 */
public class Product {
    private String name;
    private double price;
    static int productCount;
    
    public Product(String name,double price){
    this.name=name;
    this.price=price;
    productCount++;
    }
    public String getInfo(){
        return ("name: "+name+" Price: "+price);
    }
    
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
    this.price=price;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
    this.name=name;
    }
}

