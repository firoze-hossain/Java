package com.roze.java8.lambdaExpression.predefinedFunctionalInterface.predicate.example4;

import java.util.function.Predicate;

public class Example4 {
    // join predicates using(and, or, negate)
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
        //predicate one
        //checking numbers are even
        Predicate<Integer> p1 = i -> (i % 2 == 0);
        //predicate two
        //checking numbers are greater than 20
        Predicate<Integer> p2 = i -> (i > 30);
        //using and(two predicates should be true)
        for (int a : arr) {
            if (p1.and(p2).test(a)) {
                System.out.println(a);
            }
        }
        System.out.println("=================");
        //using or(one condition should be true)
        for (int a : arr) {
            if (p1.or(p2).test(a)) {
                System.out.println(a);
            }
        }
        System.out.println("==========");

        for (int a : arr) {
            if (p1.negate().test(a)) {
                System.out.println(a);
            }
        }
    }
}
