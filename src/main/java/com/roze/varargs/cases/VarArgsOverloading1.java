package com.roze.varargs.cases;

public class VarArgsOverloading1 {
    //we can not overloading varargs methods it will show compile error
    //because int[] and int... are  one dimensional array
    //so we can not declare both at a time


//    void m1(int[] a) {
//        System.out.println("array method called");
//    }

    void m1(int... a) {
        System.out.println("Varargs method called");
    }

    public static void main(String[] args) {
        VarArgsOverloading1 varArgsOverloading1 = new VarArgsOverloading1();

    }
}
