package com.roze.varargs.cases;

public class NotExactMatch {
    public void m1(int[] a) {
        System.out.println("array of int method invoked");
        for (int temp : a) {
            System.out.println(temp);
        }
    }

    public void m1(double... d) {
        System.out.println("varargs double type method invoked");
        for (double temp : d) {
            System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        //  int[] num = {1, 8, 8, 9, 7};
        NotExactMatch notExactMatch = new NotExactMatch();
        // notExactMatch.m1(num);
        //jvm will implicitly cast int to double
        //so varargs method invoked..
        //the array type method wll not accept the element directly
        notExactMatch.m1(9, 45, 6, 7);

    }
}
