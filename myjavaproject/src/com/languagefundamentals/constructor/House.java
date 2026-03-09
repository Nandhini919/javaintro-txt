package com.languagefundamentals.constructor;

public class House {
    String type;
    int rooms;
    String location;
    double price;
    boolean hasGarage;

    House() {
        this("Apartment");
        System.out.println("No-arg Constructor called!");
    }

    House(String type) {
        this(type, 2);
        System.out.println("One-arg Constructor called!");
    }

    House(String type, int rooms) {
        this(type, rooms, "Unknown");
        System.out.println("Two-arg Constructor called!");
    }

    House(String type, int rooms, String location) {
        this(type, rooms, location, 50000.0);
        System.out.println("Three-arg Constructor called!");
    }

    House(String type, int rooms, String location, double price) {
        this(type, rooms, location, price, false);
        System.out.println("Four-arg Constructor called!");
    }

    House(String type, int rooms, String location, double price, boolean hasGarage) {
        this.type = type;
        this.rooms = rooms;
        this.location = location;
        this.price = price;
        this.hasGarage = hasGarage;
        System.out.println("Five-arg Constructor called!");
    }

    public static void main(String[] args) {
        House h1 = new House();
        System.out.println("Type: " + h1.type + ", Rooms: " + h1.rooms);
        System.out.println("**************************");

        House h2 = new House("Villa", 5, "Hyderabad", 9000000.0, true);
        System.out.println("Type: " + h2.type);
        System.out.println("Location: " + h2.location);
        System.out.println("Has Garage: " + h2.hasGarage);
    }
}
