package com.roze.interviewQAndAns.exceptionHandling.unCheckedException;

public class UnCheckedException {
    public static void main(String[] args) {
        int n = 10;
        // number not be divisible by 0(infinity result)
        //it is not detected by java compiler
        //it shows exception on runtime
        //Example: ArithmeticException,ArrayIndexOutOfBoundException, NumberFormatException etc.
        System.out.println(n / 0);
    }
}
