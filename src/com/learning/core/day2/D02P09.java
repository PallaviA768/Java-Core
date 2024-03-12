package Main;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        System.out.println("Cubes of numbers up to " + n + ":");
        displayCubes(n);

        scanner.close();
    }

    static void displayCubes(int limit) {
        for (int i = 1; i <= limit; i++) {
            int cube = i * i * i;
            System.out.println("Cube of " + i + ": " + cube);
        }
    }
}
