package com.languagefundamentals.constructor;

public class Student {
    String name; 
    String rollNo;
    String branch;
    int age;

    Student(String name, String rollNo, String branch, int age) {
        System.out.println("Student Constructor called!");
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.age = age;
    }

   
    public static void main(String[] args) {
        Student s1 = new Student("Ammu", "IT101", "INFORMATION TECHNOLOGY", 20);
        s1.studentInfo();
    }
    void studentInfo() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Branch  : " + branch);
        System.out.println("Age     : " + age);
    }

}