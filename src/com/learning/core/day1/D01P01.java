package com.learning.core.day1;

import java.util.Scanner;

public class D01P01 {
    private double bookPrice;
    private String description;

    // Getter and setter for bookPrice
    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    // Getter and setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Method to create a book object using system input
    public static D01P01 createBookFromInput() {
        Scanner scanner = new Scanner(System.in);
        D01P01 book = new D01P01();
        
        System.out.println("Enter book price:");
        double price = scanner.nextDouble();
        book.setBookPrice(price);
        
        scanner.nextLine(); // Consume newline
        System.out.println("Enter book description:");
        String desc = scanner.nextLine();
        book.setDescription(desc);
        
        scanner.close();
        return book;
    }

    // Method to display book details
    public void showBookDetails() {
        System.out.println("Book Description: " + description);
        System.out.println("Book Price: $" + bookPrice);
    }

    public static void main(String[] args) {
        D01P01 book = D01P01.createBookFromInput();
        book.showBookDetails();
    }
}