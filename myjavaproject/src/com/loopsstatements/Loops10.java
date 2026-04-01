package com.loopsstatements;

import java.util.Scanner;

public class Loops10 {
	static int findFact(int n) {
		if( n == 1) {
			return 1;
		}
		return n * findFact(n-1);
	}

	public static void main(String[] args) {
		

 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter a Number:");
 		int n=sc.nextInt();
 		int ft=findFact(n);
 		
 		System.out.println("The factorial number is:"+ft);
 		
 		sc.close();

	}

}
