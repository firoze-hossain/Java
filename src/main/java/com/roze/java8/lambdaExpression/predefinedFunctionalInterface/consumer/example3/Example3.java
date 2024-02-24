package com.roze.java8.lambdaExpression.predefinedFunctionalInterface.consumer.example3;

import java.util.function.Consumer;

public class Example3 {
    //chaining of consumer
    public static void main(String[] args) {
        Consumer<String> c1 = n -> System.out.println(n + " " + "have two leg");
        Consumer<String> c2 = n -> System.out.println(n + " " + "eat Biriyani");
        Consumer<String> c3 = n -> System.out.println(n + " " + "is tall");
        //first option for chaining
        //use andThen()
        c1.andThen(c2).andThen(c3).accept("Man");
        System.out.println();
        //or
        Consumer<String>s4=c1.andThen(c2).andThen(c3);
        s4.accept("Firoze");
    }
}
