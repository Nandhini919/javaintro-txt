package com.languagefundamentals.constructor;

public class Mobile {
    String brand;
    String model;
    String OS;
    int RAM;
    double price;

    Mobile(String brand, String model, String OS, int RAM, double price) {
        System.out.println("Smartphone Constructor called!");
        this.brand = brand;
        this.model = model;
        this.OS = OS;
        this.RAM = RAM;
        this.price = price;
    }

   

    public static void main(String[] args) {
        Mobile sp1 = new Mobile("Vivo", "Vivo Y22", "Android", 8, 20000.0);
        sp1.phoneInfo();
    }
    void phoneInfo() {
        System.out.println("Brand  : " + brand);
        System.out.println("Model  : " + model);
        System.out.println("OS     : " + OS);
        System.out.println("RAM    : " + RAM + "GB");
        System.out.println("Price  : " + price);
    }
}