package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Map;

class Employee6 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee6(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
    	return id + " " + name + " " + designation + " " + department;
    }
}

public class D06P14 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee6> employeeTable = new Hashtable<>();

    
        employeeTable.put(1, new Employee6(1001, "Grace", "Tech Support", "HR"));
        employeeTable.put(2, new Employee6(1002, "Robert", "Product Manager", "Development"));
        employeeTable.put(3, new Employee6(1003, "Thomas", "Tester", "Testing"));
        employeeTable.put(4, new Employee6(1004, "Daniel", "Analyst", "L&D"));

       
        Hashtable<Integer, Employee6> anotherCollection = new Hashtable<>();
       
        anotherCollection.put(6, new Employee6(1005, "Charles", "QA lead", "Financial Analyst"));
        anotherCollection.put(5, new Employee6(1006, "Henry", "Accountant", "Finance"));
       
        anotherCollection.putAll(employeeTable);

   
        for (Map.Entry<Integer, Employee6> entry : anotherCollection.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}