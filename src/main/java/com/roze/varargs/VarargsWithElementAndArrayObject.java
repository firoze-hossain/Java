package com.roze.varargs;

public class VarargsWithElementAndArrayObject {
    void m1(int[] num) {
        System.out.println("in m1 method");
    }

    void add(int... num) {
        System.out.println("in add() method");
    }

    public static void main(String[] args) {
        //add() method will take elements as well as array of object
        //varargs will accept elements as well as array of object
        //but m1 method will take only array of object
        int[] num = {5, 1, 8};
        VarargsWithElementAndArrayObject varargs = new VarargsWithElementAndArrayObject();
        varargs.add(num);
        varargs.add(5, 8, 9, 8);
        System.out.println("************");
        varargs.m1(num);
        //but m1 method will not accept the element
        //will show compile time error
        //  varargs.m1(455, 8, 9);
    }
}
