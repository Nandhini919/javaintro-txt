package com.loopsstatements;

import java.util.Scanner;

//wap to find count of given number.
public class Loops13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int r = 0;
		int count = 0;
		
		while(n != 0) {
			r = n % 10;
			n = n / 10;
			count++;
			
		}
		System.out.println("Count of Givne number is:"+count);
		sc.close();

	}

}
