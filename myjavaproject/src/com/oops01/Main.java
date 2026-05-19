package com.oops01;

public class Main {

	 public static void main(String[] args) {

	     // Create Laptop object
	     Laptop laptop = new Laptop("Dell", 65, "Inspiron 15");

	     // Create Smartphone object
	     Smartphone phone = new Smartphone("Samsung", 25, "+91-9876543210");

	     // Display details and call specific methods
	     laptop.showDetails();
	     laptop.openLid();

	     System.out.println();

	     phone.showDetails();
	     phone.makeCall();
	 }
	}