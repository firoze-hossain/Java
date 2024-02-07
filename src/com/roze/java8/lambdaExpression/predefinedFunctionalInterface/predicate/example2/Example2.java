package com.roze.java8.lambdaExpression.predefinedFunctionalInterface.predicate.example2;

import java.util.function.Predicate;

public class Example2 {
    public static void main(String[] args) {
        //check condition for list of string using predicate and lambda expressions
        String[] names = {"Firoze", "Rayhan", "Mydul", "Millat", "Imtiaze", "Shajib", "Jakir"};
        Predicate<String> pStr = s -> (s.length() > 5);
        for (String name : names) {
            if (pStr.test(name)) {
                System.out.println(name);
            }

//            //traditional approach
//            if (name.length() > 5) {
//                System.out.println(name);
//            }
        }
    }
}
