package com.learning.core.day5;

import java.util.HashSet;

class Main {
    private String productId;
    private String productName;

    public Main(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }
}

public class D05P04 {
    public static void main(String[] args) {
        HashSet<Product> products = new HashSet<>();

        // Predefined information of 4 products
        products.add(new Product("P001", "iPhone 13"));
        products.add(new Product("P002", "Samsung Galaxy S21"));
        products.add(new Product("P003", "Maruti Dezire"));
        products.add(new Product("P004", "Sony PlayStation 5"));

        // Search for a particular product
        String searchProductId = "P003";
        Product searchProduct = new Product(searchProductId, "");

        if (products.contains(searchProduct)) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }
}
