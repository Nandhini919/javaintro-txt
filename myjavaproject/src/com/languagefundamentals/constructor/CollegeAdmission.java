package com.languagefundamentals.constructor;

public class CollegeAdmission {
    String studentName;
    int rank;
    String course;
    String collegeName;
    String hostelType;
    double totalFees;

    CollegeAdmission() {
        System.out.println("No-arg constructor called");
    }

    CollegeAdmission(String studentName, int rank) {
        System.out.println("Parametrized-1 constructor called");
        this.studentName = studentName;
        this.rank = rank;
    }

    CollegeAdmission(CollegeAdmission ca, String course, String collegeName) {
        System.out.println("Parametrized-2 constructor called");
        this.studentName = ca.studentName;
        this.rank = ca.rank;
        this.course = course;
        this.collegeName = collegeName;
    }

    CollegeAdmission(CollegeAdmission ca, String hostelType, double totalFees) {
        System.out.println("Parametrized-3 constructor called");
        this.studentName = ca.studentName;
        this.rank = ca.rank;
        this.course = ca.course;
        this.collegeName = ca.collegeName;
        this.hostelType = hostelType;
        this.totalFees = totalFees;
    }

    

    public static void main(String[] args) {
        CollegeAdmission ca1 = new CollegeAdmission("Sneha", 245);
        ca1.showDetails();

        CollegeAdmission ca2 = new CollegeAdmission(ca1, "B.Tech CSE", "JNTUH");
        ca2.showDetails();

        CollegeAdmission ca3 = new CollegeAdmission(ca2, "AC Double Sharing", 185000.0);
        ca3.showDetails();
    }
    void showDetails() {
        System.out.println("Student Name  : " + studentName);
        System.out.println("Rank          : " + rank);
        System.out.println("Course        : " + course);
        System.out.println("College       : " + collegeName);
        System.out.println("Hostel Type   : " + hostelType);
        System.out.println("Total Fees    : " + totalFees);
        System.out.println("*************************************");
    }
}