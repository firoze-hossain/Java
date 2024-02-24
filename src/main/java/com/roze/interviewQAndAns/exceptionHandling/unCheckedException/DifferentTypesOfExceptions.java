package com.roze.interviewQAndAns.exceptionHandling.unCheckedException;

public class DifferentTypesOfExceptions {
    //produce different types of exception

    public static void main(String[] args) {
        //***Arithmetic exception
        int a = 10;
        //it will produce infinity result
        //number is not divisible by 0
        //System.out.println(a / 0);

        //***NullPointerException
        String s = null;
        // System.out.println(s.length());

        //***NumberFormatException
        //numerical value as string
        //it converts nicely string to int
        //String str = "12345";
        //but for character input it will create exception
        String str = "abcd";
        // int n = Integer.parseInt(str);
        // System.out.println(n);

        //*** ArrayIndexOutOfBoundException
        int[] arr = new int[5];//limit of this array is for 5 elements(array starts at 0->(n-1))
        //but we want to access 5 no index->which means for 6 no elements
        //so it exceeds it's limit throws exception
        arr[5] = 40;
    }

}
