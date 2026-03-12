package com.languagefundamentals.constructor;

public class Car {
    String brand;
    String model;
    String color;
    int year;
    double price;
    String ownerName;

    Car() {
        System.out.println("No-arg constructor called");
    }

    Car(String brand, String model) {
        System.out.println("Parametrized-1 constructor called");
        this.brand = brand;
        this.model = model;
    }

    Car(Car c, String color, int year) {
        System.out.println("Parametrized-2 constructor called");
        this.brand = c.brand;
        this.model = c.model;
        this.color = color;
        this.year = year;
    }

    Car(Car c, double price, String ownerName) {
        System.out.println("Parametrized-3 constructor called");
        this.brand = c.brand;
        this.model = c.model;
        this.color = c.color;
        this.year = c.year;
        this.price = price;
        this.ownerName = ownerName;
    }

    

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Fortuner");
        c1.showDetails();

        Car c2 = new Car(c1, "Pearl White", 2024);
        c2.showDetails();

        Car c3 = new Car(c2, 4500000.0, "Kiran Kumar");
        c3.showDetails();
    }
    void showDetails() {
        System.out.println("Brand      : " + brand);
        System.out.println("Model      : " + model);
        System.out.println("Color      : " + color);
        System.out.println("Year       : " + year);
        System.out.println("Price      : " + price);
        System.out.println("Owner      : " + ownerName);
        System.out.println("*************************************");
    }
}