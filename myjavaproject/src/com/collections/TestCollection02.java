package com.collections;

import java.util.ArrayList;
import java .util.Collection;


public class TestCollection02 {

	public static void main(String[] args) {
		System.out.println("main Started");
		
		Collection<String> bowlers = new ArrayList<>();
		bowlers.add("Bhumrah");
		bowlers.add("siraj");
		bowlers.add("bhuvi");
		bowlers.add("aswin");
		bowlers.add("Mateesha Pathirana");
		bowlers.add("Kuldeep");
		System.out.println(bowlers);
		
		Collection<String> batsmens = new ArrayList<>();
		batsmens.add("dhoni");
		batsmens.add("virat");
		batsmens.add("iyer");
		batsmens.add("panday");
		batsmens.add("gill");
		batsmens.add("vaibhav");
		System.out.println(batsmens);
		
		Collection<String> indianteam = new ArrayList<>();
		indianteam.addAll(bowlers);
		indianteam.addAll(batsmens);
		
		bowlers.clear();
		System.out.println(bowlers);
		System.out.println(indianteam);
		
		System.out.println(batsmens.contains("nandhu"));
		System.out.println(batsmens.contains("dhoni"));
		
		Collection<String> allRounders = new ArrayList<>();
		allRounders.add("jadeja");
		
		
		
		System.out.println(indianteam.containsAll(bowlers));
		System.out.println(indianteam.containsAll(batsmens));
		System.out.println(indianteam.containsAll(allRounders));
		
		indianteam.clear();
		if(!indianteam.isEmpty()) {
			System.out.println("wlecome to indian team");
		}
		
		
		
		
		
		

	}

}
