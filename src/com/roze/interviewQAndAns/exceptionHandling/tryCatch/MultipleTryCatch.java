package com.roze.interviewQAndAns.exceptionHandling.tryCatch;

public class MultipleTryCatch {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException e) {
            System.out.println("Number is not divisible by 0(zero)");
        }
        try {
            int[] arr = {2, 5, 6, 7};
            System.out.println(arr[4]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of array limit!!");
        }
        System.out.println("Hello Firoze");
    }
}
