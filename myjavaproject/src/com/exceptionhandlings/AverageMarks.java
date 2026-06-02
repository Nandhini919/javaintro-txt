package com.exceptionhandlings;

import java.util.Scanner;


public class AverageMarks {

    
    public static double calculateAverage(int totalMarks, int numberOfSubjects) {
        if (numberOfSubjects == 0) {
            throw new ArithmeticException("Cannot divide by zero: Number of subjects cannot be 0.");
        }
        return (double) totalMarks / numberOfSubjects;
    }

    public static void main(String[] args) {
    	System.out.println("Main method Sarted");
        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************************");
        System.out.println("     Student Average Marks Calculator       ");
        System.out.println("********************************************");

        System.out.print("Enter Student Name       : ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Number of Subjects : ");
        int numberOfSubjects = scanner.nextInt();

        int totalMarks = 0;

        if (numberOfSubjects > 0) {
            System.out.println("\nEnter marks for each subject:");
            for (int i = 1; i <= numberOfSubjects; i++) {
                System.out.print("  Subject " + i + " Marks : ");
                int marks = scanner.nextInt();
                totalMarks += marks;
            }
        }

        System.out.println("********************************************");

        try {
            double average = calculateAverage(totalMarks, numberOfSubjects);

            System.out.println("Student Name      : " + studentName);
            System.out.println("Number of Subjects: " + numberOfSubjects);
            System.out.println("Total Marks       : " + totalMarks);
            System.out.printf("Average Marks     : %.2f%n", average);

            // Grade based on average
            String grade;
            if (average >= 90)      grade = "A+ (Outstanding)";
            else if (average >= 80) grade = "A  (Excellent)";
            else if (average >= 70) grade = "B  (Good)";
            else if (average >= 60) grade = "C  (Average)";
            else if (average >= 50) grade = "D  (Pass)";
            else                    grade = "F  (Fail)";

            System.out.println("Grade             : " + grade);

        } catch (ArithmeticException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("Please enter at least 1 subject to calculate average.");
        } finally {
            System.out.println("********************************************");
            System.out.println("Main Method Ended");
        }

        scanner.close();
    }
}