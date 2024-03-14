package com.learning.core.day9;
import java.util.Scanner;

public class D09P03 {
    
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        for (int t = 0; t < testCases; t++) {
            int size = scanner.nextInt();
            int[] arr = new int[size];
            
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            
            int target = scanner.nextInt();
            
            boolean found = linearSearch(arr, target);
            if (found) {
                System.out.println("Element is Present");
            } else {
                System.out.println("Element is not Present");
            }
        }
    }
}
