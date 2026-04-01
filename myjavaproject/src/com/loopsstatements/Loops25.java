package com.loopsstatements;

import java.util.Scanner;

public class Loops25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int n=sc.nextInt();
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n; j++) {
		        System.out.print("* ");
		    }
		    System.out.println();
		    sc.close();
		}
	}

}
