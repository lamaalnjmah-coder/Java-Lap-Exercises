/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.MaintenacePlanMain;

/**
 *
 * @author fa_50
 */
public class MaintenancePlan {
    private String type;
    private double cost;
    private int durationMonths;
    
    public MaintenancePlan( String type,double cost, int durationMonths){
    this.type=type;
    this.cost=cost;
    this.durationMonths=durationMonths;
    }
   
    public String getType(){
    return type;
    }
    
    public void setType(String newType){
    this.type=newType;
    }
     public double getCost(){
    return cost;
    }
    
    public void setCost(double newCost){
    this.cost=newCost;
    }
    
    public int getdurMon(){
    return durationMonths;
    }
    
    public void setdurMon(int newdurMon){
    this.durationMonths=newdurMon;
    }
    
    public String getInfo(){
        return "Type: "+type+", Cost:"+cost+" ,Duration:"+durationMonths;
    
    }
}
class Car{
public String brand;
String model;
private int year;
private MaintenancePlan plan;
static int carCounter;

public Car(String brand,String model,int year,MaintenancePlan plan)
    {this.brand=brand;
    this.model=model;
    this.year=year;
    this.plan=plan;
    carCounter++;
    }

public String getCarName(){
    return brand+" "+model;
}
public void updatePlanCost(double newCost){
    plan.setCost(newCost);
}
public String getInfo(){
    return "Brand: "+getCarName()+" Year: "+year+" Plan:"+plan.getType();
}
}



