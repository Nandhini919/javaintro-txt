package com.languagefundamentals.constructor;

public class ShoppingOrder {
    String customerName;
    String productName;
    int quantity;
    String paymentMethod;
    String couponCode;
    double finalPrice;
    String expectedDelivery;

    ShoppingOrder() {
        System.out.println("No-arg constructor called");
    }

    ShoppingOrder(String customerName, String productName, int quantity) {
        System.out.println("Parametrized-1 constructor called");
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
    }

    ShoppingOrder(ShoppingOrder so, String paymentMethod, String couponCode) {
        System.out.println("Parametrized-2 constructor called");
        this.customerName = so.customerName;
        this.productName = so.productName;
        this.quantity = so.quantity;
        this.paymentMethod = paymentMethod;
        this.couponCode = couponCode;
    }

    ShoppingOrder(ShoppingOrder so, double finalPrice, String expectedDelivery) {
        System.out.println("Parametrized-3 constructor called");
        this.customerName = so.customerName;
        this.productName = so.productName;
        this.quantity = so.quantity;
        this.paymentMethod = so.paymentMethod;
        this.couponCode = so.couponCode;
        this.finalPrice = finalPrice;
        this.expectedDelivery = expectedDelivery;
    }

   

    public static void main(String[] args) {
        ShoppingOrder so1 = new ShoppingOrder("Nandhini", "Max Jeans", 2);
        so1.showDetails();

        ShoppingOrder so2 = new ShoppingOrder(so1, "UPI", "SAVE20");
        so2.showDetails();

        ShoppingOrder so3 = new ShoppingOrder(so2, 899.0, "March 14, 2026");
        so3.showDetails();
    }
    void showDetails() {
        System.out.println("Customer Name     : " + customerName);
        System.out.println("Product Name      : " + productName);
        System.out.println("Quantity          : " + quantity);
        System.out.println("Payment Method    : " + paymentMethod);
        System.out.println("Coupon Code       : " + couponCode);
        System.out.println("Final Price       : " + finalPrice);
        System.out.println("Expected Delivery : " + expectedDelivery);
        System.out.println("*************************************");
    }
}