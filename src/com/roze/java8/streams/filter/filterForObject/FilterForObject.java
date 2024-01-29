package com.roze.java8.streams.filter.filterForObject;

import java.util.ArrayList;
import java.util.List;

public class FilterForObject {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product(1L, "Apple Laptop", 150000));
        productsList.add(new Product(2L, "Dell Laptop", 50000));
        productsList.add(new Product(3L, "Sony Laptop", 120000));
        productsList.add(new Product(4L, "Lenovo Laptop", 100000));
        productsList.add(new Product(5L, "Asus Laptop", 40000));

        productsList.stream().filter(n -> n.getPrice() > 50000).forEach(n -> System.out.println(n.toString()));
    }
}
