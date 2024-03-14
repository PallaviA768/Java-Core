package com.learning.core.day5;
import java.util.*;

class Manual implements Comparable<Person> {
    private int id1;
    private String name;
    private int age1;
    private double salary1;

    public Manual (int id, String name, int age, double salary, int id1, int age1, double salary1) {
        this.id1 = id1;
        this.name = name;
        this.age1 = age1;
        this.salary1 = salary1;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Id=" + id1 + ", name=" + name + ", age=" + age1 + ", salary=" + salary1;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id1, name, age1, salary1);
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id1 == person.id && age1 == person.age && Double.compare(person.salary, salary1) == 0 && name.equals(person.name);
    }

    // Override compareTo method for natural sorting
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id1, other.id);
    }

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

public class D05P10 {
    public static void main(String[] args) {
        // Create TreeSet for storing Person objects
        TreeSet<Person> personSet = new TreeSet<>();

        // Add predefined information of 6 persons
        personSet.add(new Person(1, "John", 25, 5000.0));
        personSet.add(new Person(2, "Alice", 30, 6000.0));
        personSet.add(new Person(3, "Bob", 28, 5500.0));
        personSet.add(new Person(4, "Jones", 22, 6999.0));
        personSet.add(new Person(5, "Jane", 27, 5800.0));
        personSet.add(new Person(6, "Jack", 35, 7500.0));

        // Print the first person whose name starts with J
        personSet.stream()
                .filter(person -> person.getName().startsWith("J"))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
