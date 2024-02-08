package com.roze.java8.lambdaExpression.predefinedFunctionalInterface.function.example3;

import java.util.function.Function;

public class Example3 {
    //function chaining(andThen() and compose())
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = n -> n * 2;
        Function<Integer, Integer> f2 = n -> n * n;
        //using andThen()-->first it will execute f1 and apply the value in f2
        System.out.println(f1.andThen(f2).apply(2));
        System.out.println("*******************");
        //using compose()-->first it will execute f2 and apply the value in f1
        System.out.println(f1.compose(f2).apply(2));
    }
}
