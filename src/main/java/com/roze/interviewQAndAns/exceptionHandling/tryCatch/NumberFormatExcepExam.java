package com.roze.interviewQAndAns.exceptionHandling.tryCatch;

public class NumberFormatExcepExam {
    public static void main(String[] args) {
        String s = "abc";
        //only put risky statement in try block
        try {
            int a = Integer.parseInt(s);
            System.out.println(a);
            //provide valid exception class to catch the error..
            // nor it will terminated whole program abnormally
            //or use super class(Exception class), not good practice, but it will work
        } catch (NumberFormatException e) {
            System.out.println("String with character converted to integer" +
                    ". Please provide numerical value to string");
        }
        System.out.println("Hello Firoze");

    }
}
