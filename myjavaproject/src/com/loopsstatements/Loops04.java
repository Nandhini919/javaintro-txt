package com.loopsstatements;

import java.util.Scanner;
//WAP to check whether the number is perfect or not.
public class Loops04 {
	static boolean isPerfect(int n) {
		boolean flag=false;
		int sum=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		
		if(sum==n) {
			flag=true;
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println("Main Started!");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		
		
		boolean status=isPerfect(num);
		
		if(status) {
			System.out.println("The Number is Perfect!");
		}else {
			System.out.println("The Number is not Perfect!");
		}
		sc.close();

	}

}
