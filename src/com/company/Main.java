package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Introduction();
        int flag=0;
        StudentsRecord studentsRecord = new StudentsRecord();
        while(true){
            int selectedOption = getSelectedOption();
            switch (selectedOption){
                case 1: Student student = getStudentDetails();
                studentsRecord.pushback(student);
                break;
                case 2: studentsRecord.displayStudentInOrderBranch();
                break;
                case 3: studentsRecord.displayStudentInOrderId();
                break;
                default: flag=1;
                System.out.println("Exiting the operation as per user input.");
                System.out.println("--------------------------------------------------------");
                break;
            }
            if(flag==1) break;
        }
    }

    private static Student getStudentDetails() {
        Scanner sc= new Scanner(System.in);
        Student student = new Student();
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        student.setFirstName(firstName);
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        student.setLastName(lastName);
        System.out.print("Enter Student Id (Number): ");
        String id = sc.nextLine();
        student.setId(id);
        System.out.print("Enter Branch Name: ");
        String branch = sc.nextLine();
        student.setBranch(branch);
        return student;
    }

    public static void Introduction(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Welcome to Student Portal");
        System.out.println("--------------------------------------------------------");
        System.out.println("Following operations are supported by the portal:");
        System.out.println("Option 1 : Enter Student details.");
        System.out.println("Option 2 : Display student names in sorted order based on branch(alphabetical order).");
        System.out.println("Option 3 : Display student id in ascending sorted order.");
        System.out.println("Option 4 : Exit");
        System.out.println("--------------------------------------------------------");
    }
    public static int getSelectedOption(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your choice (1/2/3/4) : ");
        int selectedOption = sc.nextInt();
        System.out.println("--------------------------------------------------------");
        return selectedOption;
    }
}