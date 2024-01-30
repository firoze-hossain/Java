package com.roze.java8.streams.streamMethodExtra.anyAllNoneMatch;

import java.util.HashSet;
import java.util.Set;

//use of anyMatch(), allMatch() and noneMatch()
public class AnyAllNoneMatch {
    public static void main(String[] args) {
        Set<String> bikes1 = new HashSet<>();
        bikes1.add("One Bajaj");
        bikes1.add("Two Yamaha");
        bikes1.add("One BMW");
        bikes1.add("One Pulsar");

        Set<String> bikes2 = new HashSet<>();
        bikes2.add("One Bajaj");
        bikes2.add("One Yamaha");
        bikes2.add("One BMW");
        bikes2.add("One Pulsar");

        Set<String> bikes3 = new HashSet<>();
        bikes3.add("One Bajaj");
        bikes3.add("Two Yamaha");
        bikes3.add("Three BMW");
        bikes3.add("Four Pulsar");

        //use of anyMatch()
        Boolean b1 = bikes1.stream().anyMatch(value -> {
            return value.startsWith("One");
        });
        System.out.println("anyMatch(): " + b1);

        //use of allMatch()
        Boolean b2 = bikes2.stream().allMatch(value -> {
            return value.startsWith("One");
        });
        System.out.println("allMatch(): " + b2);

        //use of noneMatch()
        Boolean b3 = bikes3.stream().noneMatch(value -> {
            return value.startsWith("Ones");
        });
        System.out.println("noneMatch(): " + b3);
    }
}
