/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author fa_50
 */
public class StudyProgram {
    private String Major;
    private String Degree;
    private int GradYear;

    //Constructors
    public StudyProgram() {
        this(null, null, 0);
    }

    public StudyProgram(String Deg, String Mj, int Yr) {
        Major = Mj;
        Degree = Deg;
        GradYear = Yr;
    }

    //Accessors
    public String getMajor() {
        return Major;
    }

    public String getDegree() {
        return Degree;
    }

    public int getGradYear() {
        return GradYear;
    }

    //toString method for easy printing
    @Override
    public String toString() {
        return Degree + " " + Major + " " + GradYear;
    }
}//end of class

