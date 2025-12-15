/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.MaintenacePlanMain;

/**
 *
 * @author fa_50
 */
public class MainMethod {

    public static void main(String[] args) {
        Car [] car = new Car[3];
        car[0] =new Car ("Toyot","Camry",2022,new MaintenancePlan("full service",400,2));
        car[1] =new Car ("Honda","gip",2026,new MaintenancePlan("normal",288,28));
        car[2] =new Car ("ford","fusion",2015,new MaintenancePlan("semi service",100,22));


        for(Car c:car){
        System.out.println(c.getInfo());
        }
        car[0].updatePlanCost(600);
        System.out.println("after updating"+car[0].getInfo());
        System.out.println("car count"+Car.carCounter);


    }
}

