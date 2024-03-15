package com.learning.core.day5;

import java.util.Objects;
import java.util.TreeSet;

class Salary implements Comparable<Salary> {
    private int id;
    private String name;
    private static double salary;

    public Salary(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public int compareTo(Salary other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return   name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary person = (Salary) o;
        return id == person.id &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
	public static Double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	
}

public class D05P09{
    public static void main(String[] args) {
        TreeSet<Salary> persons = new TreeSet<>();
        
       
        persons.add(new Salary(1, "Jerry", 999.0));
        persons.add(new Salary(2, "Smith", 2999.0));
        persons.add(new Salary(3, "Popeye", 5999.0));
        persons.add(new Salary(4, "Jones", 6999.0));
        persons.add(new Salary(5, "John", 1999.0));
        persons.add(new Salary(6, "Tom", 3999.0));

        
        	double sumOfSalaries=0.0;
           
        	for (Salary person : persons) {
                sumOfSalaries += Salary.getSalary();
            }

            System.out.println(sumOfSalaries);
        }
}
