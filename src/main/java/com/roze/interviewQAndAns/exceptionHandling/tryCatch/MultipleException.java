package com.roze.interviewQAndAns.exceptionHandling.tryCatch;

public class MultipleException {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
//            int result = a / b;
//            System.out.println(result);
            int[] arr = new int[5];
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
            }
        }
        //from java 1.7 we can handle multiple exception(using bitwise operator"|") in a single catch block
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Hello I am Firoze");
        }
    }
}
