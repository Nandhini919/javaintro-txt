package com.arrays;
//WAP to print sum and avg of the given array.
public class Arrays05 {

	public static void main(String[] args) {
		
		int[] marks= {35,65,58,69,91,88};
		
		double sum=0;
		double avg=0;
		
		for(int i=0;i<marks.length;i++) {
		    sum += marks[i];
		}
		System.out.println("Sum of marks:"+sum);
		
		 avg=sum/marks.length;
		System.out.println("Avg of all the marks:"+avg);
	}

}
