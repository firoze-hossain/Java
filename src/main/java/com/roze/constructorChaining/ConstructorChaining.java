package com.roze.constructorChaining;

public class ConstructorChaining {
    public ConstructorChaining() {
        this(10);
        System.out.println("Hey..I am default constructor");
    }

    public ConstructorChaining(int a) {
        this(10, "Hi");
        System.out.println("Hey..I am one parameterized constructor");
    }

    public ConstructorChaining(int a, String st) {
        System.out.println("Hey..I am two parameterized constructor");
    }

    public static void main(String[] args) {
        ConstructorChaining constructorChaining = new ConstructorChaining();
    }
}
