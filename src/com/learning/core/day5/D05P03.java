package com.learning.core.day5;

import java.util.HashSet;

class Product {
    String productId;
    String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
}

public class D05P03 {
    public static void main(String[] args) {
        HashSet<Product> productHashSet = new HashSet<>();

        // Predefined information of 4 products
        Product p1 = new Product("P001", "Maruti 800");
        Product p2 = new Product("P002", "Maruti Zen");
        Product p3 = new Product("P003", "Maruti Dezire");
        Product p4 = new Product("P004", "Maruti Alto");

        // Store products in the HashSet
        productHashSet.add(p1);
        productHashSet.add(p2);
        productHashSet.add(p3);
        productHashSet.add(p4);

        // List all the Product details
        for (Product product : productHashSet) {
            System.out.println(product);
        }
    }
}
