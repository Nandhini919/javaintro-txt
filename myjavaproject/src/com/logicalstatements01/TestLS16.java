package com.logicalstatements01;

import java.util.Scanner;

public class TestLS16 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter month number (1-12):");
	        int month = sc.nextInt();

	        if (month == 12 || month == 1 || month == 2) {
	            System.out.println("Season: Winter ");
	        } else if (month >= 3 && month <= 5) {
	            System.out.println("Season: Spring ");
	        } else if (month >= 6 && month <= 8) {
	            System.out.println("Season: Summer ");
	        } else if (month >= 9 && month <= 11) {
	            System.out.println("Season: Autumn ");
	        } else {
	            System.out.println("Invalid month!");
	        }
	        sc.close();
	    }
}
