package com.roze.java8.lambdaExpression.predefinedFunctionalInterface.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
        //Supplier will take one return type argument
        //it will not take any input type argument
        //it has one abstract method get()
        Supplier<Date> date = () -> new Date();
        System.out.println(date.get());
    }
}
