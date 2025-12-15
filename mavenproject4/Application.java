/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author fa_50
 */

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Scanner;

public class Application {
   
    static Scanner input = new Scanner(System.in);
    static int NoStud = 0;
    static Student[] school;

    public static void main(String[] args) {
        //1.Create an array of STUDENT according to the input number
        System.out.println("\t\t*** Welcome to Students Management System ***\n");
        System.out.print("\t\tPlease enter number of students in your school: ");
        NoStud = input.nextInt(); //number of students
        school = new Student[NoStud];
        //scholl name of the array

        int choice;
        int index; //index of a specific student object in the array اي طالب الاول ولا الثاني ..
        do { // do -while loop
                System.out.println("Students Record Management System" );
                System.out.println("0. Exit" );
                System.out.println( "1. Add a student " );
                System.out.println( "2. Update student's information " );
                System.out.println( "3. Update a student's GPA " );
                System.out.println("4. Delete a student " );
                System.out.println("5.Print all students information " );
                System.out.println("Your choice is: ");
        
                 choice= input.nextInt();
        
    switch (choice) {
                case 1:
                    if (Student.studCounter < NoStud) //num of student smaller than num of student in your scholl
                        addStudent();
                    else
                        System.out.println("\nERROR: Cannot add more than " + NoStud + " students!");
                    break;
                case 2:
                    input.nextLine();
                    if (checkRecords()) {
                        index = searchStudent();
                        if (index > -1)
                            updateStudent(school[index]);
                        else
                            System.out.println("\nERROR: ID NOT FOUND!");
                    }
                    break;
                case 3:
                    input.nextLine();
                    if (checkRecords()) {
                        index = searchStudent();
                        if (index > -1)
                            updateStudentGPA(school[index]);
                        else
                            System.out.println("\nERROR: ID NOT FOUND!");
                    }
                    break;
                case 4:
                    input.nextLine();
                    if (checkRecords()) {
                        index = searchStudent();
                        if (index > -1)
                            deleteStudent(index);
                        else
                            System.out.println("\nERROR: ID NOT FOUND!");
                    }
                    break;
                case 5:
                    if (checkRecords())
                        printStudents();
                    break;
                case 0:
                    System.out.println("\nThanks for using our system:)");
                    break;
                default:
                    System.out.println("ERROR: INVALID OPTION!");
            }//end of switch
        } while (choice != 0); //0=0 exit the loop
    }//end of main

    

    public static void addStudent() {
        String Fname, Lname, Id, degree, mjr;
        int d, m, y, qyear;
        float gpa = 0;

        input.nextLine();
        System.out.print("\nPlease enter the following student info:\nID: ");
        Id = input.nextLine();
        System.out.print("First name: ");
        Fname = input.nextLine();
        System.out.print("Last name: ");
        Lname = input.nextLine();
        System.out.print("Birthdate (yyyy m d): ");
        y = input.nextInt();
        m = input.nextInt();
        d = input.nextInt();
        System.out.print("GPA: ");
        gpa = input.nextFloat();
        System.out.println("Last qualification: ");
        input.nextLine();
        System.out.print("Degree: ");
        degree = input.nextLine();
        System.out.print("Major: ");
        mjr = input.nextLine();
        System.out.print("Year: ");
        qyear = input.nextInt();

        school[Student.studCounter] = new Student(Id, Fname, Lname, //school[0]= new Student(argment)
                LocalDate.of(y, m, d), gpa, new StudyProgram(degree, mjr, qyear)); // a new object in array

        System.out.println("\nThe record has been added successfully!");
    }//end of addStudent

    public static void updateStudent(Student stud) {
        //print previous information
        System.out.println("\n**** Current student information:");
        System.out.println("ID : " + stud.getID());
        System.out.println("Name : " + stud.getName());
        System.out.println("Birthdate : " + stud.getBDate());
        System.out.println("Age : " + stud.getAge());
        System.out.println("GPA : " + stud.getGPA());
        System.out.println("Qualification: " + stud.getQualification());

        //update info
        System.out.println("\nPlease enter the updated information:");
        System.out.print("ID: ");
        stud.setID(input.nextLine());
        System.out.print("First name: ");
        stud.setFirstName(input.nextLine());
        System.out.print("Last name: ");
        stud.setLastName(input.nextLine());
        System.out.print("Birthdate (yyyy m d): ");
        stud.setBDate(LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt()));
        System.out.print("GPA: ");
        stud.setGPA(input.nextFloat());
        System.out.print("Last qualification: ");
        input.nextLine();
        System.out.print("Degree: ");
        String degree = input.nextLine();
        System.out.print("Major: ");
        String mjr = input.nextLine();
        System.out.print("Year: ");
        int qyear = input.nextInt();

        stud.setQualification(new StudyProgram(degree, mjr, qyear));
        System.out.println("\nThe record has been updated successfully!");
    }//end of updateStudent

    public static void updateStudentGPA(Student stud) {
        //print previous GPA
        System.out.println("\nStudent's current GPA is " + stud.getGPA());
        //update GPA
        System.out.print("Please enter the new term GPA: ");
        stud.updateGPA(input.nextFloat());
        System.out.println("\nThe GPA has been updated successfully!");
    }//end of updateStudentGPA

    public static void deleteStudent(int index) {
        for (int i = index; i < Student.studCounter - 1; i++)
            school[i] = school[i + 1];
        Student.studCounter--;
        System.out.println("\nThe record has been deleted successfully!");
    }//end of deleteStudent

    public static void printStudents() {
        for (int i = 0; i < Student.studCounter; i++) {
            System.out.println("\n\nStudent#" + (i + 1) + " Information:");
            System.out.println("ID : " + school[i].getID());
            System.out.println("Name : " + school[i].getName());
            System.out.println("Birthdate : " + school[i].getBDate());
            System.out.println("Age : " + school[i].getAge());
            System.out.println("GPA : " + school[i].getGPA());
            System.out.println("Qualification: " + school[i].getQualification());
        }//end of for
    }//end of printStudents

    public static int searchStudent() {
        System.out.print("\nPlease enter a student ID: ");
        String ID = input.nextLine();
        for (int i = 0; i < Student.studCounter; i++)
            if (school[i].getID().equals(ID))
                return i;
        return -1;
    }//end of searchStudent

    public static boolean checkRecords() {
        if (Student.studCounter > 0)
            return true;
        else {
            System.out.println("\nERROR: There is no any student record in the system!");
            return false;
        }
    }//end of checkRecords
}//end of class
