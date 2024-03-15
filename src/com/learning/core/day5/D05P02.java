package com.learning.core.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class D05P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store student names
        ArrayList<String> studentNames = new ArrayList<>();
        
        // Input student names
        System.out.println("Enter student names separated by spaces:");
        String input = scanner.nextLine();
        String[] names = input.split(" ");
        
        // Add names to the ArrayList
        for (String name : names) {
            studentNames.add(name);
        }
        
        // Input the name to search for
        System.out.println("Enter the name to search:");
        String searchName = scanner.nextLine();
        
        // Check if the name exists in the ArrayList
        if (studentNames.contains(searchName)) {
            System.out.println("Output: Found");
        } else {
            System.out.println("Output: Not found");
        }
        
        scanner.close();
    }
}
