package com.loopsstatements;

import java.util.Scanner;

//factorial of given number.
public class Loops09 {

	public static void main(String[] args) {
         int fact=1;
         
         
 		
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter a Number:");
 		int n=sc.nextInt();
 		
 		for(int i = n;i >= 1;i --) {
 			fact=fact * i;
 		}
 		System.out.println("The factorial number is:"+fact);
 		sc.close();

	}
	

}
