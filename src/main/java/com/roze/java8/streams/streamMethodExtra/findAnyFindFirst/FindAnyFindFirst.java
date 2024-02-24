package com.roze.java8.streams.streamMethodExtra.findAnyFindFirst;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyFindFirst {
    public static void main(String[] args) {
        //use of findAny()
        List<String> listOfWords = Arrays.asList("One", "Two", "Three", "One", "Four");
        Optional<String> anyElem = listOfWords.stream().findAny();
        System.out.println("Any element: " + anyElem.get());
        System.out.println();

        //use of findFirst()
        Optional<String> firstElem = listOfWords.stream().findFirst();
        System.out.println("First Element: " + firstElem.get());
    }
}
