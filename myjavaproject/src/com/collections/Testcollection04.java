package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Testcollection04 {

	public static void main(String[] args) {
		
		Collection<String> batsmens = new ArrayList<>();
		batsmens.add("dhoni");
		batsmens.add("virat");
		batsmens.add("iyer");
		batsmens.add("panday");
		batsmens.add("gill");
		batsmens.add("vaibhav");
		System.out.println(batsmens);
		
		Iterator<String> itr = batsmens.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("*********************");
		
		for(String batsmen:batsmens) {
			System.out.println(batsmen);
		}

	}

}
