package com.roze.interviewQAndAns.exceptionHandling.tryCatch;

public class Example1 {
    public static void main(String[] args) {
        //exception handling using try catch block
        int a = 10, b = 0, c;
        try {
            System.out.println("Started");
            c = a / b;//throws ArithmeticException
            System.out.println(c);
        } catch (Exception e) {
            // we can pass a custom message in here
            System.out.println("number can not be divided by 0(zero)");
        }
        System.out.println("Ended");


    }
}
