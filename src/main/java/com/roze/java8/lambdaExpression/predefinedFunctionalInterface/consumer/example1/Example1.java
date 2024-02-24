package com.roze.java8.lambdaExpression.predefinedFunctionalInterface.consumer.example1;

import java.util.function.Consumer;

public class Example1 {
    public static void main(String[] args) {
        //consumer-> it just accepts the one parameter value and print it with accept() method
        //it does not return anything
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Firoze");
    }
}
