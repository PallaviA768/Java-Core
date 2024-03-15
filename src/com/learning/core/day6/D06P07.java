package com.learning.core.day6;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class Car2 implements Comparable<Car2> {
    private String name;
    private double price;

    public Car2(String name, double price) {
        this.name = name;
        this.price = price;
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
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car2 car = (Car2) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car2 o) {
        return Double.compare(this.price,o.price);
    }
}

public class D06P07 {
    public static void main(String[] args) {
        TreeMap<Car2, Integer> carMap = new TreeMap<>();

        carMap.put(new Car2("Bugatti", 80050.0), 1);
        carMap.put(new Car2("Swift", 305000.0), 2);
        carMap.put(new Car2("Audi", 600100.0), 3);
        carMap.put(new Car2("Benz", 900000.0), 4);

     
        Map.Entry<Car2, Integer> greatest = carMap.firstEntry();
        Map.Entry<Car2, Integer> least = carMap.lastEntry();

       
        System.out.println(greatest.getKey());
     
  
        System.out.println(least.getKey());
    }
}