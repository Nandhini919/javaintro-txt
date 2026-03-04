package com.languagefundamentals.constructor;

public class Book {
    String title;
    String author;
    String genre;
    int year;
    double price;

    Book(String title, String author, String genre, int year, double price) {
        System.out.println("LibraryBook Constructor called!");
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    

    public static void main(String[] args) {
        Book lb1 = new Book("Wings of Fire", "APJ Abdul Kalam", "Biography", 1999, 350.0);
        lb1.bookInfo();
    }
    void bookInfo() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Genre  : " + genre);
        System.out.println("Year   : " + year);
        System.out.println("Price  : " + price);
    }
}