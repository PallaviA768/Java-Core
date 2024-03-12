package com.learning.core.day5;
import java.util.HashSet;
import java.util.Iterator;

class D05P05 {
    String productId;
    String productName;

    public D05P05(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
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

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}

public class D05P05 {
    public static void main(String[] args) {
        HashSet<Product> productHashSet = new HashSet<>();

        // Adding predefined information of 4 products
        productHashSet.add(new Product("P001", "Product1"));
        productHashSet.add(new Product("P002", "Product2"));
        productHashSet.add(new Product("P003", "Product3"));
        productHashSet.add(new Product("P004", "Product4"));

        // Remove a particular product by using product id
        String productIdToRemove = "P002";
        Iterator<Product> iterator = productHashSet.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.productId.equals(productIdToRemove)) {
                iterator.remove();
                System.out.println("Product with ID " + productIdToRemove + " removed.");
            }
        }

        // Print the remaining products in the HashSet
        System.out.println("Remaining products in the HashSet:");
        for (Product product : productHashSet) {
            System.out.println(product);
        }
    }
}
