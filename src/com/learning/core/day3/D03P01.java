package com.learning.core.day3;
import java.util.Scanner;
public class D03P01 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();

	        // Display length
	        int length = inputString.length();
	        System.out.println("Length of the string: " + length);

	        // Display in uppercase
	        String uppercaseString = inputString.toUpperCase();
	        System.out.println("Uppercase string: " + uppercaseString);

	        // Check palindrome
	        boolean isPalindrome = checkPalindrome(inputString);
	        System.out.println("Is palindrome: " + isPalindrome);

	        scanner.close();
	    }

	    private static boolean checkPalindrome(String str) {
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equals(reversed);
	    }
	}


