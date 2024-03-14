package com.learning.core.day2;

import java.util.Scanner;

public class D02P15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting the base number
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        // Accepting the exponent
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculating the power
        double result = Math.pow(base, exponent);

        // Displaying the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}