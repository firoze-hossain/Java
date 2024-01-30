package com.roze.java8.streams.streamMethodExtra.concat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatStream {
    public static void main(String[] args) {
        //concatenation of stream
        List<String> bike1 = Arrays.asList("Bajaj", "Yamaha", "Pulsar");
        List<String> bike2 = Arrays.asList("Suzuki", "Hero", "Bullet");
        Stream<String> b1 = bike1.stream();
        Stream<String> b2 = bike2.stream();
        Stream.concat(b1, b2).forEach(System.out::println);
    }
}
