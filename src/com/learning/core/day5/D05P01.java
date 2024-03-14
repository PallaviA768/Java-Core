package com.learning.core.day5;

import java.util.Random;
import java.util.Scanner;

class Employee {
    String name;
    long phoneNo;
    String passportNo;
    int licenseNo;
    String panCardNo;
    int voterId;
    int employeeId;

    Employee(String name, long phoneNo, int employeeId, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.passportNo = passportNo;
    }

    Employee(String name, long phoneNo, int employeeId, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    Employee(String name, long phoneNo, int employeeId, int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
    }
    @Override
    public String toString() {
        return   employeeId  + name  + phoneNo + passportNo;
    }

}

class Student {
    String name;
    long phoneNo;
    String passportNo;
    int licenseNo;
    String panCardNo;
    int voterId;

    Student(String name, long phoneNo, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
    }

    Student(String name, long phoneNo, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    Student(String name, long phoneNo, int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
    }
    @Override
    public String toString() {
        return     name  + phoneNo + passportNo + voterId;
    }

}

class Register<T> {
    String registerId;

    String generateRegisterId(int n) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char randomChar = (char) (random.nextInt(26) + 'A');
            sb.append(randomChar);
        }

        this.registerId = sb.toString();
        return this.registerId;
    }

    void displayDetails(T user) {
        System.out.println(this.registerId + " " + user.toString());
    }
   
}

public class D05P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Employee or 2 for Student:");
        int userType = scanner.nextInt();

        if (userType == 1) {
            System.out.println("Enter Employee details:");
            String name = scanner.next();
            long phoneNo = scanner.nextLong();
            int employeeId = scanner.nextInt();
            String passportNo = scanner.next();

            Employee employee = new Employee(name, phoneNo, employeeId, passportNo);

            Register<Employee> employeeRegister = new Register<>();
            employeeRegister.generateRegisterId(7);
            employeeRegister.displayDetails(employee);

        } else if (userType == 2) {
            System.out.println("Enter Student details:");
            String name = scanner.next();
            long phoneNo = scanner.nextLong();
            int voterId = scanner.nextInt();
            int licenseNo = scanner.nextInt();

            Student student = new Student(name, phoneNo, voterId, licenseNo);

            Register<Student> studentRegister = new Register<>();
            studentRegister.generateRegisterId(7);
            studentRegister.displayDetails(student);
        }
        
       
        scanner.close();
    }
}

