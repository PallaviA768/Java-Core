package com.learning.core.day5;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Override toString method
    @Override
    public String toString() {
        return id + " " + name;
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return id;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return id == person.id;
    }

    // Implement natural ordering based on id
    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.id, person.id);
    }

    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();

        // Predefined information of 6 persons
        personSet.add(new Person(1, "Jerry", 0, 999.0));
        personSet.add(new Person(2, "Smith", 0, 2999.0));
        personSet.add(new Person(3, "Popeye", 0, 5999.0));
        personSet.add(new Person(4, "Jones", 0, 6999.0));
        personSet.add(new Person(5, "John", 0, 1999.0));
        personSet.add(new Person(6, "Tom", 0, 3999.0));

        // Print the id, name, and salary of each person
        for (Person person : personSet) {
            System.out.println(person);
            System.out.println(person.getSalary());
        }
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}
