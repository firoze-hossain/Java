package com.roze.java8.streams.flatmap.streamMethod.SteamMethod1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod1 {
    public static void main(String[] args) {
        //non terminal method/processing method
        //**distinct
        //**limit

        //Terminal method
        //**count
        //**forEach

        List<Integer> listOfNums = Arrays.asList(1, 2, 3, 4, 3, 5, 6, 2);
        List<String> listofWords = Arrays.asList("One", "Two", "One", "Three", "Four", "Five", "Three");
        //use of distinct(non-terminal)
        List<Integer> distinctNum = listOfNums.stream().distinct().collect(Collectors.toList());
        List<String> distinctWords = listofWords.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Words: " + distinctWords);
        System.out.println("Distinct Numbers: " + distinctNum);

        System.out.println();

        //use of count(terminal)
        long countNum = listOfNums.stream().distinct().count();
        long countOfStrings = listofWords.stream().distinct().count();
        System.out.println("Count of distinct Nums: " + countNum);
        System.out.println("Count of distinct Words: " + countOfStrings);

        System.out.println();
        //use of limit
        System.out.println("Limit of Nums: ");
        listOfNums.stream().limit(3).forEach(System.out::println);
        System.out.println("Limit of Words:");
        listofWords.stream().limit(3).forEach(System.out::println);
    }
}
