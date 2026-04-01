package com.loopsstatements;



//WAP to print prime numbers upto 100 numbers.
public class Loops07 {
	static boolean isPrime(int n) {
		boolean status =true;
		if(n==0 || n==1) {
			status=false;
		}
		
		for(int i=2;i<n;i++) {
            if(n % i == 0) {
				status=false;
				break;
			}
		}
		
		return status;
	}

	public static void main(String[] args) {
		System.out.println("Main!!!!!!!!:");
		
		
		
		for(int i=0;i<=100;i++) {
			if(isPrime(i)) {
				System.out.print(i+ " ");
			}
		}
		

	}

}
