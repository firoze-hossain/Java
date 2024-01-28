package com.roze.streams.filter.filterExample2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("FirozeH", "Imtiaze", "Ahsanul", "Sykhul", "Shajib");
        List<String> longNames = new ArrayList<>();

        // without using stream
        // *Process One:* Using for each loop to retrieve name based on condition
        for (String s : names) {
            if (s.length() > 6 && s.length() < 8) {
                longNames.add(s);
            }
        }
        System.out.println("Process One: " + longNames);

        System.out.println();

        // *Process Two:* using filter and add the conditional list in another list
        longNames = names.stream().filter(n -> n.length() > 6 && n.length() < 8).collect(Collectors.toList());
        System.out.println("Process Two: " + longNames);

        System.out.println();

        // *Process Three:* using filter print the conditional list single line
        System.out.println("Third Process:");
        names.stream().filter(n -> n.length() > 6 && n.length() < 8).forEach(n -> System.out.println(n));

        System.out.println();

        // *Process Fourth:* using filter print the conditional list without using lambda expression
        System.out.println("Process Fourth:");
        names.stream().filter(n -> n.length() > 6 && n.length() < 8).forEach(System.out::println);

    }

}
