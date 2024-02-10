package com.roze.interviewQAndAns.exceptionHandling.throwKeyword;

public class ThrowKeyword {
    public static void main(String[] args) {
        //when we want to use our customize exception at that time use throw keyword
        //maximum time we use it for user defined exception
        // but we can use it for predefined exception also
        throw new ArithmeticException("Not divisible by zero");//predefined exception class
        //user defined exception like this
        // throw new AgeNotFoundException("");
    }
}
