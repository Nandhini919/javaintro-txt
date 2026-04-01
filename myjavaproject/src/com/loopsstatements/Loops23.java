package com.loopsstatements;

import java.util.Scanner;

public class Loops23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
		    for (int j = i; j < n; j++) {    // spaces
		        System.out.print("  ");
		    }
		    for (int j = 1; j <= i; j++) {   // stars
		        System.out.print("* ");
		    }
		    System.out.println();
		    sc.close();
		}
		

	}

}
