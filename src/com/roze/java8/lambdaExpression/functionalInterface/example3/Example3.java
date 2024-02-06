package com.roze.java8.lambdaExpression.functionalInterface.example3;

@FunctionalInterface
interface Cab {
    public String cabBook(String source, String destination);
}

public class Example3 {
    public static void main(String[] args) {
        Cab uber = ((source, destination) -> {
            System.out.println("The Uber is booked from " + source + " to " + destination);
            return ("Rent: 500tk");
        });

        System.out.println(uber.cabBook("Ishurdi", "Dhaka"));
    }
}
