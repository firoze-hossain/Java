package com.roze.varargs;

public class VarargsAsSingleDimensionalArray {
    void m1(int[] num) {
        System.out.println("in m1 method");
    }

    void add(int... num) {
        System.out.println("in add() method");
    }

    public static void main(String[] args) {
        int[] num = {10, 16, 23};
        VarargsAsSingleDimensionalArray varargs = new VarargsAsSingleDimensionalArray();
        varargs.add(num);
        varargs.m1(num);
    }
}
