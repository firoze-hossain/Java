package com.roze.varargs.cases;

public class VarArgsWithObjectClass {
    void m1(Object... o) {
        System.out.println("Inside m1 method");
    }

    public static void main(String[] args) {
        VarArgsWithObjectClass objectClass = new VarArgsWithObjectClass();
        //in previous java version we can not pass a single null value in object varargs method
        //it can be handled the second one process
        //now in java 21 what i am using the two method call work nicely
        // objectClass.m1(null);
        //second process
        objectClass.m1(new Object[]{null});
    }
}
