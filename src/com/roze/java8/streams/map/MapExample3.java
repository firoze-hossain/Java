package com.roze.java8.streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 6, 3, 7);
        List<Integer> multipliedNumbers = new ArrayList<>();

        //*Process One:* before java 8 using enhance for loop
        for (int num : numbers) {
            // System.out.println(num*3);
            multipliedNumbers.add(num * 3);
        }
        System.out.println(multipliedNumbers);

        System.out.println();

        //*Process Two:* using map
        multipliedNumbers = numbers.stream().map(num -> num * 3).collect(Collectors.toList());
        System.out.println(multipliedNumbers);

        System.out.println();

        //*Process Three* print value with lambda expression
        numbers.stream().map(num -> num * 3).forEach(num -> System.out.println(num));

        System.out.println();

        //*Process Four:* print value with double colon
        numbers.stream().map(num -> num * 3).forEach(System.out::println);

    }
}
