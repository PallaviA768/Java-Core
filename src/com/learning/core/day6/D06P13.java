package com.learning.core.day6;

import java.util.Hashtable;

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

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', designation='" + designation + "'}";
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class D06P13 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee> employeeTable = new Hashtable<>();

        // Predefined information of 4 Employee details
        Employee emp1 = new Employee(1, "John", "IT", "Software Engineer");
        Employee emp2 = new Employee(2, "Alice", "HR", "HR Manager");
        Employee emp3 = new Employee(3, "Bob", "Finance", "Accountant");
        Employee emp4 = new Employee(4, "Eva", "Marketing", "Marketing Specialist");

        // Store Employee details in the HashTable using employee id as key
        employeeTable.put(emp1.getId(), emp1);
        employeeTable.put(emp2.getId(), emp2);
        employeeTable.put(emp3.getId(), emp3);
        employeeTable.put(emp4.getId(), emp4);

        // Get the number of keys in the HashTable
        int numberOfKeys = employeeTable.size();
        System.out.println(numberOfKeys);
    }
}
