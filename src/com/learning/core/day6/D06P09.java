package com.learning.core.day6;

import java.util.*;

class Bus implements Comparable<Bus> {
    private String name;
    private double price;

    public Bus(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Bus bus = (Bus) obj;
        return Double.compare(bus.price, price) == 0 && Objects.equals(name, bus.name);
    }

    @Override
    public int compareTo(Bus o) {
        return Double.compare(this.price, o.price);
    }
}

public class D06P09 {
    public static void main(String[] args) {
        TreeMap<Bus, String> busMap = new TreeMap<>();

        // Predefined bus details
        busMap.put(new Bus("Reva", 50000.0), "Reva 50000.0");
        busMap.put(new Bus("Toyota", 60000.0), "Toyota 60000.0");
        busMap.put(new Bus("BMW", 70000.0), "BMW 70000.0");
        busMap.put(new Bus("Audi", 80000.0), "Audi 80000.0");

        // Replace value mapped by the specified key with the new value
        double newPrice = 80050.0;
        for (Map.Entry<Bus, String> entry : busMap.entrySet()) {
            if (entry.getKey().getPrice() == newPrice) {
                System.out.println("Input: " + newPrice);
                System.out.println("Output: " + entry.getValue());
                break;
            }
        }
    }
}