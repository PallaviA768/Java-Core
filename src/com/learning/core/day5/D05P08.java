package com.learning.core.day5;

import java.util.Objects;
import java.util.TreeSet;

class Upper implements Comparable<Upper> {
    private int id;
    private String name;
    private double salary;

    public Upper(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public int compareTo(Upper other) {
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
        Upper person = (Upper) o;
        return id == person.id &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	
}

public class D05P08{
    public static void main(String[] args) {
        TreeSet<Upper> persons = new TreeSet<>();
        
       
        persons.add(new Upper(1, "Jerry", 999.0));
        persons.add(new Upper(2, "Smith", 2999.0));
        persons.add(new Upper(3, "Popeye", 5999.0));
        persons.add(new Upper(4, "Jones", 6999.0));
        persons.add(new Upper(5, "John", 1999.0));
        persons.add(new Upper(6, "Tom", 3999.0));

        for (Upper person : persons) {
            if (Character.isUpperCase(person.getName().charAt(0))) {
                System.out.println(person.getName());
        }
    }
}
    
}
