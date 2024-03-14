package com.learning.core.day3;
import java.util.Scanner;

public class D03P02 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Accept two numbers from the user
	        System.out.print("Enter the first number (1-40): ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number (1-40): ");
	        int num2 = scanner.nextInt();

	        // Single dimension array of five integer elements ranging from 1 to 40
	        int[] array = {10, 20, 30, 15, 25};

	        // Compare inputted values with array elements
	        boolean foundNum1 = false;
	        boolean foundNum2 = false;

	        for (int i : array) {
	            if (i == num1) {
	                foundNum1 = true;
	            }
	            if (i == num2) {
	                foundNum2 = true;
	            }
	        }

	        // Display "Bingo" message if both inputted values are found in the array
	        if (foundNum1 && foundNum2) {
	            System.out.println("Bingo!");
	        } else {
	            System.out.println("Not a Bingo!");
	        }

	        scanner.close();
	    }
}
	
	
