package com.learning.core.day6;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class D06P11 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Predefined employee details
        employeeTable.put(1001, new Employee(1001, "John", "HR", "HR Manager"));
        employeeTable.put(1002, new Employee(1002, "Jane", "Finance", "Financial Analyst"));
        employeeTable.put(1003, new Employee(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1004, new Employee(1004, "Emily", "Marketing", "Marketing Manager"));

        // Search for a specific employee
        int searchId = 1003;
        Employee searchedEmployee = employeeTable.get(searchId);
        if (searchedEmployee != null) {
            System.out.println("Input: " + searchId);
            System.out.println("Output: " + searchedEmployee.toString() + " earning");
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}
