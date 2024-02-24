package com.roze.java8.lambdaExpression.functionalInterface.example2;

@FunctionalInterface
interface Cab {
    public void cabBook(String source, String destination);
}

public class Example2 {
    public static void main(String[] args) {
        Cab uber = ((source, destination) ->
                System.out.println("The cab is booked from " + source + " to " + destination));
        uber.cabBook("Ishwardi", "Dhaka");

    }
}
