package com.logicalstatements01;

import java.util.Scanner;

public class TestLS21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Do you have a degree? (true/false):");
        boolean hasDegree = sc.nextBoolean();
        System.out.println("Do you have experience? (true/false):");
        boolean hasExperience = sc.nextBoolean();

        if (age >= 21 && age <= 40) {
            if (hasDegree) {
                if (hasExperience) {
                    System.out.println("You are fully Eligible! Welcome Aboard!");
                } else {
                    System.out.println("Eligible but Fresher - Apply for Trainee role!");
                }
            } else {
                System.out.println("Need a Degree to Apply!");
            }
        } else {
            System.out.println("Age not in required range (21-40)!");
        }
        sc.close();
    }
	}


