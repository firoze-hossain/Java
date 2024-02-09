package com.roze.interviewQAndAns.exceptionHandling.tryCatchFinally;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("One********");
            int a=20,b=0,c;
            c=a/b;
            System.out.println("Two********** "+c);
            System.out.println("Three********");

        } catch (ArithmeticException e) {
            System.out.println("Four****** " + "You can not divide number by zero(0)");

        }finally {
            System.out.println("Five**********");
        }
        System.out.println("Six**********");
    }
}
