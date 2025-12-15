/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingsystem;

import java.time.LocalDate;

/**
 *
 * @author fa_50
 */
public class ParkingInfo {
    private String type;
    private LocalDate startDate;
    
    public ParkingInfo(){
    }
    
    public ParkingInfo(String type,LocalDate startDate){
    this.type=type;
    this.startDate=startDate;
    }
    
    public String getInfo(){
    return type+" "+startDate;
    }

}
