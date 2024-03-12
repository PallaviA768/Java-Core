package Main;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();

        char grade = calculateGrade(marks);

        System.out.println("Grade: " + grade);

        scanner.close();
    }

    static char calculateGrade(int marks) {
        if (marks >= 60) {
            return 'A';
        } else if (marks >= 45) {
            return 'B';
        } else if (marks >= 35) {
            return 'C';
        } else {
            return 'F';
        }
    }
}