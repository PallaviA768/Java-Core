package com.learning.core.day2;

import java.util.Scanner;

public class D02P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        displayReversePyramid(rows);

        scanner.close();
    }

    static void displayReversePyramid(int numRows) {
        for (int i = numRows; i >= 1; i--) {
            // Print spaces
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
