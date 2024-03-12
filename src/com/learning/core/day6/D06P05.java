package com.learning.core.day6;
import java.util.*;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Override toString
    @Override
    public String toString() {
        return name + " " + price;
    }

    // Override hashCode and equals
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    // Override compareTo for natural ordering
    @Override
    public int compareTo(Car other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P05 {
    public static void main(String[] args) {
        // Create and store cars in TreeMap
        Map<Car, String> carDetails = new TreeMap<>();
        carDetails.put(new Car("Bugatti", 80050.0), "Details1");
        carDetails.put(new Car("Swift", 305000.0), "Details2");
        carDetails.put(new Car("Audi", 600100.0), "Details3");
        carDetails.put(new Car("Benz", 900000.0), "Details4");

        // Retrieve and print all car details
        for (Car car : carDetails.keySet()) {
            System.out.println(car);
        }
    }
}
