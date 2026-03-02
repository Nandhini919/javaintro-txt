package com.languagefundamentals.method;


public class FoodOrderSystem {

	public static void main(String[] args) {
		FoodOrderSystem fos=new FoodOrderSystem();
		double itemprice=200.0;
		int itemquantity=2;
		double total=fos.CaluclateItemTotal(itemprice,itemquantity);
		double totalWithGST=fos.AddGST(total);
		double finalBill=fos.AddDeliveryCharge(totalWithGST);
		fos.printBill(finalBill);
	}
	double CaluclateItemTotal(double price,int quantity) {
		return price * quantity;
	}
	double AddGST(double amount) {
		double gst=amount*0.25;
		return amount + gst;
	}
	double AddDeliveryCharge(double amount) {
		return amount + 40;
	}
	void printBill(double finalAmount) {
		System.out.println("Total Bill to pay:"+ finalAmount);
	}

}
