package com.roze.java8.streams.streamMethodExtra;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
    public static void main(String[] args) {
        // use of sorted method

        //sorting for numbers
        List<Integer> listOfNums = Arrays.asList(2, 8, 9, 6, 4, 3, 2, 1, 7);
        List<Integer> sortedNumsInAsc = listOfNums.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Numbers in ascending Order: " + sortedNumsInAsc);
        System.out.println();
        List<Integer> sortedNumsInDesc = listOfNums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted Numbers in Descending Order: " + sortedNumsInDesc);

        System.out.println();

        //sorting for strings
        List<String> listOfStrings = Arrays.asList("Millat", "Imtiaze", "Rayhan", "Firoze", "Mydul", "Shajib");
        List<String> sortedStringsInAsc = listOfStrings.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted String in ascending order: " + sortedStringsInAsc);
        System.out.println();
        List<String> sortedStringInDesc = listOfStrings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted Strings in descending order: " + sortedStringInDesc);
    }
}
