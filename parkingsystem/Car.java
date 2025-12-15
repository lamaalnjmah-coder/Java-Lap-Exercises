/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingsystem;

/**
 *
 * @author fa_50
 */
public class Car {
    private String plate;
    private String model;
    private String name;
    public static int carCounter;
    
    public Car(String plate,String model,String name){
    this.plate=plate;
    this.model=model;
    this.name=name;
    carCounter++;
    }
    public String getPlate(){return plate;}
    
    public void setPlate(String newPlate){this.plate=newPlate;}
    
    public String getModel(){return model;}
    
    public void setModel(String newModel){this.plate=newModel;}
    
    public String getName(){return name;}
    
    public void setName(String newName){this.plate=newName;}
    
    public String getInfo(){
        return plate+" "+model+" "+name;
    }
}
