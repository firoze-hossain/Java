package com.roze.java8.streams.filter.filterExample3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("One", "Two", null, "Three", null, "Four", "Five", null);
        //removing the null values and print the other listed values
        List<String> result = words.stream().filter(n -> n != null).collect(Collectors.toList());
        System.out.println(result);
    }
}
