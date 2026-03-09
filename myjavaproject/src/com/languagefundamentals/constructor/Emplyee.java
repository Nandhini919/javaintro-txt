package com.languagefundamentals.constructor;

public class Emplyee {
    int empId;
    String name;
    String department;
    double salary;
    String role;

    Emplyee() {
        this(0);
        System.out.println("No-arg Constructor called!");
    }

    Emplyee(int empId) {
        this(empId, "Unknown");
        System.out.println("One-arg Constructor called!");
    }

    Emplyee(int empId, String name) {
        this(empId, name, "General");
        System.out.println("Two-arg Constructor called!");
    }

    Emplyee(int empId, String name, String department) {
        this(empId, name, department, 30000.0);
        System.out.println("Three-arg Constructor called!");
    }

    Emplyee(int empId, String name, String department, double salary) {
        this(empId, name, department, salary, "Junior");
        System.out.println("Four-arg Constructor called!");
    }

    Emplyee(int empId, String name, String department, double salary, String role) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.role = role;
        System.out.println("Five-arg Constructor called!");
    }

    public static void main(String[] args) {
        Emplyee e1 = new Emplyee();
        System.out.println("ID: " + e1.empId + ", Dept: " + e1.department);
        System.out.println("**************************");

        Emplyee e2 = new Emplyee(101, "Ravi", "IT", 75000.0, "Senior Developer");
        System.out.println("Name: " + e2.name);
        System.out.println("Role: " + e2.role);
        System.out.println("Salary: " + e2.salary);
    }
}