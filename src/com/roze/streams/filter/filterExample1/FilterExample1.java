package com.roze.streams.filter.filterExample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30, 35);
        List<Integer> evenNumbers = new ArrayList<>();

        //without stream

        //enhance for loop
        for (int n : numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }
        System.out.println(evenNumbers);

        // using stream

        // *Process:One* storing even numbers in another list
        evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        //*Process:Two* directly print the even number using forEach
        numbers.stream().filter(n -> n % 2 == 0).forEach(evenNum -> System.out.println(evenNum));

        //*Process:Three* print even numbers list without using lambda expression
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
