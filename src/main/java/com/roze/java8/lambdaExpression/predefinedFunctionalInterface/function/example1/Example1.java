package com.roze.java8.lambdaExpression.predefinedFunctionalInterface.function.example1;

import java.util.function.Function;

public class Example1 {
    public static void main(String[] args) {
        //argument type and return type with integer(two)
        Function<Integer, Integer> f = i -> (i * i);
        System.out.println(f.apply(5));
        System.out.println("*****************");
        //argument type(String) and return type(Integer)
        Function<String, Integer> s = n -> (n.length());
        System.out.println(s.apply("Hello"));
    }
}
