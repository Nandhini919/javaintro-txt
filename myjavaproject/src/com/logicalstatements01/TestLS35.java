package com.logicalstatements01;

import java.util.Scanner;

public class TestLS35 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("Welcome to Vegetables and Fruit Market ");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a category");
		String catg=sc.next();
		
		switch(catg) {
		case "veg" ->
		{
			System.out.println("Enter a Item for Vegetables:");
			String item=sc.next();
			
			switch(item) {
			case "Tmo" -> System.out.println("Tomato & the price is 20rs Per Kg");
			case "pto" -> System.out.println("Potato & the price is 400rs Per Kg");
			case "dmst" -> System.out.println("DrumSticks & the price is 10rs  Each");
			case "crt" -> System.out.println("Carrot & the price is 35rs Per Kg");
			case "Onin" -> System.out.println("Onion & the price is 30rs  Per Kg");
			case "Grlc" -> System.out.println("Garlic  & the price is 50rs  Per Kg");
			case "Caul" -> System.out.println("Cauliflower & the price is 25rs  Each");
			case "Spin" -> System.out.println("Spinach  & the price is 15rs  Per Kg");
			case "Brd"  -> System.out.println("Brinjal   & the price is 20rs  Per Kg");
			case "Btn"  -> System.out.println("Beetroot   & the price is 30rs  Per Kg");
			default     -> System.out.println("Entered item is not available in Vegetables");
			
			}
		}
		case "fru" ->{
			System.out.println("Enter a Items for Fruits:");
			String item=sc.next();
			
			switch(item) {
			case "mng" -> System.out.println("Mango & the price is 200rs per dozen");
			case "Ban"  -> System.out.println("Banana       & the price is 40rs  Per Dozen");
			case "App"  -> System.out.println("Apple        & the price is 150rs Per Kg");
			case "Grp"  -> System.out.println("Grapes       & the price is 60rs  Per Kg");
			case "Wtmn" -> System.out.println("Watermelon   & the price is 30rs  Each");
			case "Org"  -> System.out.println("Orange       & the price is 50rs  Per Kg");
			case "Pnpl" -> System.out.println("Pineapple    & the price is 45rs  Each");
			case "Ppya" -> System.out.println("Papaya       & the price is 35rs  Each");
			case "Pom"  -> System.out.println("Pomegranate  & the price is 80rs  Per Kg");
			case "Kiwi" -> System.out.println("Kiwi         & the price is 120rs Per Kg");
			default     -> System.out.println("Entered item is not available in Fruits");
			}
			
		}
		default -> System.out.println("Entered the category is inavalid");
		}
	}

}
