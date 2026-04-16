package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class Arrays10 {

	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 2, 3, 1, 5, 6, 7, 1, 2};
		Set <Integer> set = new HashSet<>();
		Set <Integer> duplicates = new HashSet<>();
		
		for(int a:arr) {
			if(!set.add(a)) {
				duplicates.add(a);
			}
		}
		
		System.out.println(duplicates);
		
		
		
		
	}

}
