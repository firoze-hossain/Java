package com.roze.interviewQAndAns.exceptionHandling.tryCatch;

public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            //less important code than nested try block's code
            //it is the best case we write the outer try block's code below the nested try-catch block
            try {
                //this try block for more import code
                int[] arr = {1, 8, 8, 9};
                System.out.println(arr[2]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println(20 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
