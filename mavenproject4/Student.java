/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

import java.time.LocalDate;

/**
 *
 * @author fa_50
 */
public class Student {
    //data fields
    public String ID;
    protected String FirstName, LastName;
    private float GPA;
    protected LocalDate BDate;
    public static int studCounter = 0; //to incress to 1 after we use it
    private StudyProgram program; //has-a relation

    //Constructors
    Student() {
        this("", "", "", LocalDate.of(0, 0, 0), 0, new StudyProgram());
    }

    Student(String id, String FName, String LName, LocalDate BD, float gpa, StudyProgram p) {
        ID = id;
        FirstName = FName;
        LastName = LName;
        BDate = BD;
        setGPA(gpa);
        program = p;
        studCounter++;
    }

    //Accessor and Mutator Methods
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setGPA(float GPA) {
        this.GPA = (GPA > 0 && GPA < 6) ? GPA : 0;
    }

    public double getGPA() {
        return GPA;
    }

    public void setBDate(LocalDate BDate) {
        this.BDate = BDate;
    }

    public LocalDate getBDate() {
        return BDate;
    }

    public void setQualification(StudyProgram program) {
        this.program = program;
    }

    public StudyProgram getQualification() {
        return program;
    }

    //Other Methods
    public String getName() {
        return (FirstName + " " + LastName);
    }

    public int getAge() {
        return (LocalDate.now().getYear() - BDate.getYear());
    }

    public void updateGPA(float newGPA) {
        setGPA((GPA + newGPA) / 2);
    }
}//end of class
