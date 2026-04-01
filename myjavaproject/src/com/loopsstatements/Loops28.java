package com.loopsstatements;

import java.util.Scanner;

public class Loops28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int n=sc.nextInt();
		for (int i = n; i >= 1; i--) {
		    for (int j = i; j < n; j++)          // spaces
		        System.out.print(" ");
		    for (int j = 1; j <= (2*i-1); j++)   // stars
		        System.out.print("*");
		    System.out.println();
		    sc.close();
		}

	}

}
