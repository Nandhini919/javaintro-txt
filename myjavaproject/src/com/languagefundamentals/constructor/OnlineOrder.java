package com.languagefundamentals.constructor;

public class OnlineOrder {
    String customerName;
    String productName;
    String deliveryAddress;
    int quantity;
    double totalPrice;

    OnlineOrder(String customerName, String productName, String deliveryAddress, int quantity, double totalPrice) {
        System.out.println("OnlineOrder Constructor called!");
        this.customerName = customerName;
        this.productName = productName;
        this.deliveryAddress = deliveryAddress;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    
    public static void main(String[] args) {
        OnlineOrder o1 = new OnlineOrder("Ananya", "Laptop", "Chennai", 1, 65000.0);
        o1.orderInfo();
    }
    void orderInfo() {
        System.out.println("Customer Name     : " + customerName);
        System.out.println("Product Name      : " + productName);
        System.out.println("Delivery Address  : " + deliveryAddress);
        System.out.println("Quantity          : " + quantity);
        System.out.println("Total Price       : " + totalPrice);
    }

}