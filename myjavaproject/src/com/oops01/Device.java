package com.oops01;


//BASE CLASS

class Device {

 // Attributes
 String brand;
 int power;        // in watts

 // Constructor
 public Device(String brand, int power) {
     this.brand = brand;
     this.power = power;
 }

 // Base method — shows common details
 public void showDetails() {
     System.out.println("Brand : " + brand);
     System.out.println("Power : " + power + "W");
 }
}


//SUBCLASS 1 — Laptop

class Laptop extends Device {

 String model;

 // Constructor calls parent using super()
 public Laptop(String brand, int power, String model) {
     super(brand, power);      // sends brand & power to Device
     this.model = model;
 }

 // Override showDetails() to add Laptop info
 @Override
 public void showDetails() {
     System.out.println("--- Laptop Details ---");
     super.showDetails();      // call Device's showDetails first
     System.out.println("Model : " + model);
 }

 // Laptop-specific method
 public void openLid() {
     System.out.println(brand + " laptop lid is now open. Ready to work!");
 }
}


//SUBCLASS 2 — Smartphone

class Smartphone extends Device {

 String phoneNumber;

 // Constructor calls parent using super()
 public Smartphone(String brand, int power, String phoneNumber) {
     super(brand, power);      // sends brand & power to Device
     this.phoneNumber = phoneNumber;
 }

 // Override showDetails() to add Smartphone info
 @Override
 public void showDetails() {
     System.out.println("--- Smartphone Details ---");
     super.showDetails();      // call Device's showDetails first
     System.out.println("Number : " + phoneNumber);
 }

 // Smartphone-specific method
 public void makeCall() {
     System.out.println(brand + " is calling " + phoneNumber + "... Ring Ring!");
 }
}

