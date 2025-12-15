/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parkingsystem;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author fa_50
 */
public class ParkingSystem {
    
    static Scanner input = new Scanner(System.in);
    
    public static int menu(){
        System.out.println("choose from 0-4");
        System.out.println("1 park a new car");
        System.out.println("2 update car info");
        System.out.println("3 remove a car");
        System.out.println("4 display all info");
        System.out.println("0 exit");
        System.out.println("yor choise is: ");
        
        return input.nextInt();
    }
    
    public static void newCar (){
        String plate;
        String model;
        String name;
        String type;
        int y;
        int m;
        int d;
        
        System.out.print("car plate: ");
        plate=input.nextLine();
        System.out.print("car model: ");
        model=input.nextLine();
        System.out.print("car name: ");
        name=input.nextLine();    
        System.out.print("car type: ");
        type=input.nextLine();
        System.out.print("car date: ");
        y=input.nextInt();
        m=input.nextInt();
        d=input.nextInt();
        


    
    }

    

    public static void main(String[] args) {
        
        System.out.print("enter number of parking slots: ");
        int s = input.nextInt();
        Car[] cars = new Car[s];
        
         int cho=menu();
         
         switch(cho){
             case 1:
                 newCar();
         
         
         
         
         
         }

    }
}
