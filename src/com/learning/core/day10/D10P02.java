package com.learning.core.day10;
import java.io.Serializable;

public class D10P02 implements Serializable {
    private int rollNumber;
    private String name;
    private int age;
    private String address;

    // Constructor
    public D10P02(int rollNumber, String name, int age, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
