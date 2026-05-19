   package com.oops03;

interface FoodOrder {
    void prepareFood();
}

class OrderDetails {
    int orderId;
    String customerName;
    double price;

    OrderDetails(int orderId, String customerName, double price) {
        this.orderId      = orderId;
        this.customerName = customerName;
        this.price        = price;
    }

    void displayDetails() {
        System.out.println("Order ID      : " + orderId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Price         : Rs." + price);
    }
}

class PizzaOrder extends OrderDetails implements FoodOrder {

    PizzaOrder(int orderId, String customerName, double price) {
        super(orderId, customerName, price);
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing Pizza... Pizza is Ready!");
    }
}

class BurgerOrder extends OrderDetails implements FoodOrder {

    BurgerOrder(int orderId, String customerName, double price) {
        super(orderId, customerName, price);
    }

    @Override
    public void prepareFood() {
        System.out.println("Preparing Burger... Burger is Ready!");
    }
}

public class TestDemo08 {

    public static void main(String[] args) {

        PizzaOrder pizza = new PizzaOrder(101, "Nandhu", 350.00);
        System.out.println("===== PIZZA ORDER =====");
        pizza.prepareFood();
        pizza.displayDetails();

        BurgerOrder burger = new BurgerOrder(102, "Reddy", 180.00);
        System.out.println("===== BURGER ORDER =====");
        burger.prepareFood();
        burger.displayDetails();
    }
}