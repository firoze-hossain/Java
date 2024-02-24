package com.roze.interviewQAndAns.exceptionHandling.tryCatch;

public class NPEExample {
    //NullPointer exception
    //user will create exception and handle it own(definition of "try catch" block)
    public static void main(String[] args) {
        String str = null;
        // String str = "abcd";
        try {
            System.out.println(str.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("you can not convert null value to uppercase!!");
        }

    }
}
