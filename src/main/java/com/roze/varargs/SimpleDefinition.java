package com.roze.varargs;

public class SimpleDefinition {
    void add(int... num) {
        System.out.println("var args method is called");
    }

    public static void main(String[] args) {
        SimpleDefinition simpleDefinition = new SimpleDefinition();
        simpleDefinition.add(10);
        simpleDefinition.add(10,11);
    }
}
