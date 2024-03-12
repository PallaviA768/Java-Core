package com.learning.core.day5;

import java.util.HashSet;

class Product {
    private int productId;
    private String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product product = (Product) obj;
        return productId == product.productId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(productId);
    }
}

public class D05P04 {
    public static void main(String[] args) {
        HashSet<Product> productHashSet = new HashSet<>();

        // Creating 4 products with predefined information
        Product product1 = new Product(1, "Laptop");
        Product product2 = new Product(2, "Smartphone");
        Product product3 = new Product(3, "Headphones");
        Product product4 = new Product(4, "Camera");

        // Adding products to HashSet
        productHashSet.add(product1);
        productHashSet.add(product2);
        productHashSet.add(product3);
        productHashSet.add(product4);

        // Searching for a particular product (e.g., product with id 2)
        int searchProductId = 2;
        Product searchProduct = new Product(searchProductId, "");
        if (productHashSet.contains(searchProduct)) {
            System.out.println("Product found: " + searchProduct.getProductName());
        } else {
            System.out.println("Product with ID " + searchProductId + " not found.");
        }
    }
}
