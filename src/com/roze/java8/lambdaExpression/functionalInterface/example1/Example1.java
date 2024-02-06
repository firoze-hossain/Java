package com.roze.java8.lambdaExpression.functionalInterface.example1;

@FunctionalInterface
interface Cab {
    public void canBook();
}

public class Example1 {
    public static void main(String[] args) {
        Cab uber = () -> System.out.println("The Uber cab is booked..");
        uber.canBook();
    }
}
