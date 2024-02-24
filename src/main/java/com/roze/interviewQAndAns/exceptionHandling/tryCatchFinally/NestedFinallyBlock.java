package com.roze.interviewQAndAns.exceptionHandling.tryCatchFinally;

public class NestedFinallyBlock {
    public static void main(String[] args) {
        try {
            String name = "Firoze";
            System.out.println(name.toUpperCase());
        } catch (NullPointerException n) {
            System.out.println("Name not be null");
        } finally {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException a) {
                System.out.println("Number is not divisible by zero(0)");
            } finally {
                System.out.println("Passionate Java Programmer");
            }

        }
        System.out.println("Hello Java Pro");
    }
}
