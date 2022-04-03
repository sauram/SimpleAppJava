package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortById implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        int ar = Integer.parseInt(a.getId());
        int br = Integer.parseInt(b.getId());
        return ar-br;
    }
}

class SortByBranch implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return a.getBranch().compareTo(b.getBranch());
    }
}



public class StudentsRecord {
    private ArrayList<Student> records;
    StudentsRecord(){
        records = new ArrayList<Student>();
    }
    public void pushback(Student student){
        records.add(student);
    }

    public void displayStudentInOrderBranch() {
        if(records.isEmpty()){
            System.out.println("There are no students record in the portal.");
            return;
        }
        Collections.sort(records, new SortByBranch());
        printRecords();
    }

    public void displayStudentInOrderId() {
        if(records.isEmpty()){
            System.out.println("There are no students record in the portal.");
            return;
        }
        Collections.sort(records, new SortById());
        printRecords();
    }

    private void printRecords() {
        for(int i=0;i< records.size();i++){
            Student student = records.get(i);
            System.out.println("Name: " + student.getFirstName() + ", Id: "+ student.getId() + ", Branch: " + student.getBranch());
        }
    }
}
