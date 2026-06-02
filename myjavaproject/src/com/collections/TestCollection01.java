package com.collections;

import java.util.ArrayList;
import java .util.Collection;


public class TestCollection01 {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		Object[] obj = new Object[5];
		
		obj[0] = 10;
		obj[1] = "nandhu";
		obj[2] = 7.9;
		obj[3] = 1000000.00;
		obj[4] = 'N';
		for( Object Obj1 : obj) {
			System.out.println(obj);
		} 
		System.out.println("____________________");
		
		Collection<Integer> c = new ArrayList<>();
		
		c.add(7);
		c.add(9);
		c.add(89);
		c.add(59);
		c.add(6);
		c.add(131);
		c.add(131);
		c.add(131);
		c.add(131);
		
		
		System.out.println(c);
	}

}
