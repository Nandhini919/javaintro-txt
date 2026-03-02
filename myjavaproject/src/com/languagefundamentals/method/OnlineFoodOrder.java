package com.languagefundamentals.method;

public class OnlineFoodOrder {
		        static double calculateItemTotal(double price, int quantity) {
		        return price * quantity;
		    }

		    static double addGST(double amount) {
		        double gst = amount * 5 / 100;
		        return amount + gst;
		    }

		    static double addDeliveryCharge(double amount) {
		        return amount + 40;
		    }

		    static void printBill(double itemTotal, double gstAmount, double finalAmount) {
		        System.out.println("=============================");
		        System.out.println("       FOOD ORDER BILL       ");
		        System.out.println("=============================");
		        System.out.println("Item Total     : Rs." + itemTotal);
		        System.out.println("GST (5%)       : Rs." + (gstAmount - itemTotal));
		        System.out.println("Delivery Charge: Rs.40");
		        System.out.println("-----------------------------");
		        System.out.println("FINAL TOTAL    : Rs." + finalAmount);
		        System.out.println("=============================");
		    }

		    public static void main(String[] args) {
		        double price    = 150;
		        int quantity    = 3;

		        double itemTotal  = calculateItemTotal(price, quantity);
		        double gstAmount  = addGST(itemTotal);
		        double finalTotal = addDeliveryCharge(gstAmount);

		        printBill(itemTotal, gstAmount, finalTotal);
		    }
		

	}


