package com.loopsstatements;

import java.util.Scanner;

public class Loops30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int r=0;
		int count =0;
		
		int countTemp = n;
        while (countTemp != 0) {
            countTemp /= 10;
            count++;
        }
		while(n != 0) {
			r=n%10;
			sum = (int) (sum+ Math.pow(r, count));
			n=n/10;
		}
		
		if(temp==sum) {
			System.out.println("The Given Number is Armstrong Number:"+temp);
		}else {
			System.out.println("The Given Number is not a Armstrong Number:"+temp);
		}
		sc.close();

	}

}
