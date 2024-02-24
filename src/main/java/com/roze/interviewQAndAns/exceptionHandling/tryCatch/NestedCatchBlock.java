package com.roze.interviewQAndAns.exceptionHandling.tryCatch;

public class NestedCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println(20 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
            try {
                String s = null;
                System.out.println(s.toLowerCase());
            } catch (NullPointerException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("Hello Firoze");
    }
}
