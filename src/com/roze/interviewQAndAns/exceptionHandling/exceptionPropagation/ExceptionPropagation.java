package com.roze.interviewQAndAns.exceptionHandling.exceptionPropagation;

public class ExceptionPropagation {
    public static void main(String[] args) {
        // m1();
        try {
            m1();
        } catch (ArithmeticException e) {
            System.out.println("EException handled by main method");
        }
    }

    public static void m1() {
//        try {
//            m2();
//        }catch (ArithmeticException e){
//            System.out.println("Exception handled by m1 method");
//        }
        m2();
    }

    public static void m2() {
        System.out.println(10 / 0);
    }
}
