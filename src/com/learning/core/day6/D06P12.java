package com.learning.core.day6;
import java.util.Hashtable;
import java.util.Scanner;

class Employee1 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee1(int id, String name, String department, String designation) {
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

public class D06P12 {
	 public static void main(String[] args) {
	        Hashtable<Integer, Employee1> employeeHashtable = new Hashtable<>();

	        Employee1 emp1 = new Employee1(1001, "Grace", "Tech Support", "HR");
	        Employee1 emp2 = new Employee1(1002, "Robert", "Product Manager", "Development");
	        Employee1 emp3 = new Employee1(1003, "Thomas", "Tester", "Testing");
	        Employee1 emp4 = new Employee1(1004, "Daniel", "Analyst", "L&D");

	        employeeHashtable.put(emp1.hashCode(), emp1);
	        employeeHashtable.put(emp2.hashCode(), emp2);
	        employeeHashtable.put(emp3.hashCode(), emp3);
	        employeeHashtable.put(emp4.hashCode(), emp4);
     
	        Scanner scanner=new Scanner(System.in);
        int newId = scanner.nextInt();
        scanner.nextLine(); 
        String name = scanner.nextLine();
     
        String department = scanner.nextLine();
  
        String designation = scanner.nextLine();

        Employee1 newEmployee = new Employee1(newId, name, department, designation);
        employeeHashtable.putIfAbsent(newId, newEmployee);

    
        for (Employee1 emp : employeeHashtable.values()) {
            System.out.println(emp);
        }
        
      
    }
}