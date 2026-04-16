package com.arrays;

public class Arrays02 {

	public static void main(String[] args) {
		System.out.println("Main Started!!");
		int[] numbers =new int[10];
		numbers[0]=101;
		numbers[1]=102;
		numbers[2]=103;
		numbers[3]=104;
		numbers[4]=105;
		numbers[5]=106;
		numbers[6]=107;
		numbers[7]=108;
		numbers[8]=109;
		numbers[9]=120;
		
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
			if(numbers[i]%2==0) {
				System.out.print(numbers[i]+" ");
			}
		}
		
		

	}

}
