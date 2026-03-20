package com.logicalstatements01;

import java.util.Scanner;

public class TestLS24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Do you have a valid ticket? (true/false):");
        boolean hasTicket = sc.nextBoolean();
        System.out.println("Do you have valid ID? (true/false):");
        boolean hasID = sc.nextBoolean();
        System.out.println("Is your luggage within 20kg? (true/false):");
        boolean luggageOk = sc.nextBoolean();

        if (hasTicket) {
            if (hasID) {
                if (luggageOk) {
                    System.out.println("All Clear! Proceed to Boarding Gate!");
                } else {
                    System.out.println("Excess Luggage! Pay extra charges.");
                }
            } else {
                System.out.println("No Valid ID! Cannot Board.");
            }
        } else {
            System.out.println("No Ticket! Purchase first.");
        }
        sc.close();
	}

}
