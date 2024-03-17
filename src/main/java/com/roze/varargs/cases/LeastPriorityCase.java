package com.roze.varargs.cases;

public class LeastPriorityCase {
    //jvm will give the var-args method least priority than exact match
    public void m1(int... num) {
        System.out.println("var-args param in m1 method");
    }

    //jvm will give the most priority than var-args
    public void m1(int a) {
        System.out.println("single int param in m1 method");
    }

    public static void main(String[] args) {
        LeastPriorityCase priorityCase = new LeastPriorityCase();
        //call one single int parameterized method(will invoke m1(int a))
        priorityCase.m1(10);
    }
}
