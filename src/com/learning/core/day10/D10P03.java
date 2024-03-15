package com.learning.core.day10;
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class D10P03 {
    private static final String FILE_NAME = "student_records.ser";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<D10P02> students = new ArrayList<>();

            while (true) {
                try {
                    System.out.println("Enter student details (Roll Number, Name, Age, Address): ");
                    int rollNumber = getIntInput("Roll Number: ", scanner);
                    String name = getStringInput("Name: ", scanner);
                    int age = getIntInput("Age: ", scanner);
                    String address = getStringInput("Address: ", scanner);

                    D10P02 student = new D10P02(rollNumber, name, age, address);
                    students.add(student);

                    System.out.print("Do you want to add another student? (yes/no): ");
                    String choice = scanner.next().toLowerCase();
                    if (!choice.equals("yes")) {
                        saveRecordsToFile(students);
                        break;
                    }
                } catch (InputMismatchException | BlankFieldException e) {
                    System.out.println(e.getMessage());
                    scanner.nextLine(); // Clear the input buffer
                }
            }
        }
    }

    private static int getIntInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a numeric value: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static String getStringInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        String input = scanner.next();
        if (input.trim().isEmpty()) {
            throw new BlankFieldException("Field cannot be blank.");
        }
        return input;
    }

    private static void saveRecordsToFile(ArrayList<D10P02> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for (D10P02 student : students) {
                oos.writeObject(student);
            }
            System.out.println("Records saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while saving records to file: " + e.getMessage());
        }
    }

    public static void displayRecordsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            System.out.println("Records from file:");
            while (true) {
                try {
                    D10P02 student = (D10P02) ois.readObject();
                    System.out.println("Roll Number: " + student.getRollNumber());
                    System.out.println("Name: " + student.getName());
                    System.out.println("Age: " + student.getAge());
                    System.out.println("Address: " + student.getAddress());
                    System.out.println();
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred while reading records from file: " + e.getMessage());
        }
    }
}
