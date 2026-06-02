package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection03 {

	public static void main(String[] args) {
		Collection<Integer>  c1 = new ArrayList<>();
		c1.add(10);
		System.out.println(c1);
		System.out.println(c1.hashCode());
		
		Collection<Integer>  c2 = new ArrayList<>();
		c2.add(10);
		System.out.println(c2.hashCode());
		
		
		System.out.println(c1.equals(c2));
		System.out.println(c2.isEmpty());
	}

}
