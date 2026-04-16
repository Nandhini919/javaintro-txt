package com.arrays;

import java.util.Scanner;

//WAP to find prime numbers from given array which taken from the console.
public class Arrays07 {
	static boolean isPrime(int a) {
		boolean status=true;
		if(a==0 || a==1) {
			status = false;
		}
		for(int i=2;i<a;i++) {
			if(a%i ==0) {
				status = false;
				break;
			}
			
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("Main Started!!");
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		
		
		int[] arr =new int[size];
		
		System.out.println("Enter elements to an array:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("*****************************");
		
		
		for(int a:arr) {
			boolean status= isPrime(a);
			if(status) {
				System.out.println(a+" ");
			}

		}
		sc.close();
		

	}

}
