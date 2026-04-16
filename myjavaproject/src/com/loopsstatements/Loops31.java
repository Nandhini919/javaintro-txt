package com.loopsstatements;

import java.util.Scanner;

public class Loops31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		int r=n*n;
		int sum=0;
		int temp=sum;
		
		while(temp>0) {
			sum=sum+(temp%10);
			temp=temp/10;
		}
		if(temp==n) {
			System.out.println("The Given Number is Neon Number:"+n);
		}else {
			System.out.println("The Given Number is not a Neon Number:"+n);
		}
		sc.close();

	}

}
