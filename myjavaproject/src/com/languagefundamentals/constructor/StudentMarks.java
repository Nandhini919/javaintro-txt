package com.languagefundamentals.constructor;

public class StudentMarks {
    String name;
    int marks1;
    int marks2;
    int marks3;
    int total;
    double average;

    StudentMarks(String name, int marks1, int marks2, int marks3) {
        System.out.println("Constructor Called!!");
        this.name   = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;

        // Calculate Total
        this.total = marks1 + marks2 + marks3;

        // Calculate Average
        this.average = total / 3.0;
    }

   

    public static void main(String[] args) {
        System.out.println("Main Method Started");

        StudentMarks s1 = new StudentMarks("Ammu", 85, 90, 78);
        s1.displayInfo();

        StudentMarks s2 = new StudentMarks("Nandhuuu", 92, 88, 95);
        s2.displayInfo();

        StudentMarks s3 = new StudentMarks("Vamsiii", 70, 65, 80);
        s3.displayInfo();
    }
    void displayInfo() {
        
        System.out.println("Student Name : " + name);
        System.out.println("Marks 1      : " + marks1);
        System.out.println("Marks 2      : " + marks2);
        System.out.println("Marks 3      : " + marks3);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);
        System.out.println("==============================");
    }
}
