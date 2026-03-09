package com.languagefundamentals.constructor;

public class Smartphone {
    String brand;
    String model;
    int ram;
    int storage;
    double price;
    String color;

    Smartphone() {
        this("Unknown");
        System.out.println("No-arg Constructor called!");
    }

    Smartphone(String brand) {
        this(brand, "Unknown");
        System.out.println("One-arg Constructor called!");
    }

    Smartphone(String brand, String model) {
        this(brand, model, 4);
        System.out.println("Two-arg Constructor called!");
    }

    Smartphone(String brand, String model, int ram) {
        this(brand, model, ram, 64);
        System.out.println("Three-arg Constructor called!");
    }

    Smartphone(String brand, String model, int ram, int storage) {
        this(brand, model, ram, storage, 15000.0);
        System.out.println("Four-arg Constructor called!");
    }

    Smartphone(String brand, String model, int ram, int storage, double price) {
        this(brand, model, ram, storage, price, "Black");
        System.out.println("Five-arg Constructor called!");
    }

    Smartphone(String brand, String model, int ram, int storage, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.color = color;
        System.out.println("Six-arg Constructor called!");
    }

    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
        System.out.println("Brand: " + s1.brand + ", RAM: " + s1.ram + "GB");
        System.out.println("**************************");

        Smartphone s2 = new Smartphone("Samsung", "Galaxy S24", 12, 256, 80000.0, "Phantom White");
        System.out.println("Brand: " + s2.brand);
        System.out.println("Model: " + s2.model);
        System.out.println("RAM: " + s2.ram + "GB");
        System.out.println("Storage: " + s2.storage + "GB");
        System.out.println("Price: " + s2.price);
        System.out.println("Color: " + s2.color);
    }
}