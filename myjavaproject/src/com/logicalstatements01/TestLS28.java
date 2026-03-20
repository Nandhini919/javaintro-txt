package com.logicalstatements01;

import java.util.Scanner;

public class TestLS28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Is the security system ON? (true/false):");
        boolean systemOn = sc.nextBoolean();
        System.out.println("Is motion detected? (true/false):");
        boolean motionDetected = sc.nextBoolean();
        System.out.println("Is the owner home? (true/false):");
        boolean ownerHome = sc.nextBoolean();

        if (systemOn) {
            if (motionDetected) {
                if (ownerHome) {
                    System.out.println("Motion by Owner - No Alert. All Safe!");
                } else {
                    System.out.println("INTRUDER ALERT! Calling Police!");
                    System.out.println("Sending notification to Owner!");
                }
            } else {
                System.out.println("System Active - No Motion Detected. All Clear!");
            }
        } else {
            System.out.println("Security System is OFF - Please Turn ON!");
        }
        sc.close();

	}

}
