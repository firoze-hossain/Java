package com.roze.java8.lambdaExpression.predefinedFunctionalInterface.predicate.example1;

import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {
        //for integer
        Predicate<Integer> pInt = i -> (i > 10);
        System.out.println(pInt.test(11)); //return true(based on condition)

        System.out.println();
        //for string
        Predicate<String> pStr = s -> (s.length() > 3);
        System.out.println(pStr.test("Firoze")); //return true based on condition
    }
}
