package com.roze.varargs.cases;

public class VarArgsWithNormalParameter {
    //varargs should be last parameter, otherwise it shows compile type error
    //we can declare only varargs as method parameter
    public void m1(int a, int... b) {
        System.out.println("From normal Parameter: " + a);
        for (int temp : b) {
            System.out.println("Come from varargs: " + temp);
        }
    }

    //we can mix type, but varargs will be the last parameter
    //we can declare only varargs as method parameter
    public void m2(Long a, String... b) {
        System.out.println("From normal Parameter: " + a);
        for (String temp : b) {
            System.out.println("Come from varargs: " + temp);
        }
    }

    public static void main(String[] args) {
        VarArgsWithNormalParameter parameter = new VarArgsWithNormalParameter();
        parameter.m1(10, 15, 20, 25);
        System.out.println("*****************");
        parameter.m2(20L, "Java", "2", "Java");
    }
}
