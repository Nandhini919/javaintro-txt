package com.arrays;

public class GCD {
	static int gcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			 a = temp ;
			
		}
		return a;
	
		
	}

	public static void main(String[] args) {
		
		int a = 12,b = 56;
		int gcdValue = gcd(a, b);
		System.out.println("GCD Value:"+gcdValue);
		
		int lcm = (a * b) / gcdValue;
		System.out.println("LCM Value : "+lcm);

	}

}
