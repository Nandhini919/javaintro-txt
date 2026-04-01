package com.loopsstatements;

import java.util.Scanner;

//WAP to print Math table from 0 to 20.
public class Loops06 {

	public static void main(String[] args) {
		System.out.println("Main!!!");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Which number to proceed for table:");
		int n=sc.nextInt();
		System.out.println("Enter upto where you want to proceed::");
		int n1=sc.nextInt();
		
		for(int i=1;i<=n1;i++) {
			System.out.println(n + "X" + i+ "=" + n*i);
		}
		sc.close();

	}

}
