package com.roze.varargs.cases;

//java is Backward Compatibility language
//it gives priority of old feature rather than new
public class LanguageBackwardCompatibility {

    void m1(long a, long b, long c) {
        System.out.println("Three long type parameterized method called");
    }

    void m1(double a, double b, double c) {
        System.out.println("Three double type parameterized method called");
    }

    void m1(float a, float b, float c) {
        System.out.println("Three float type parameterized method called");
    }

    //old feature from java 1.1(get high priority)
    void m1(int a, int b, int c) {
        System.out.println("Three int type parameterized method called");
    }

    //    void m1(short a, short b, short c) {
//        System.out.println("Three short type parameterized method called");
//    }
//    void m1(byte a, byte b, byte c) {
//        System.out.println("Three byte type parameterized method called");
//    }
    //new feature from java 1.5(get less priority)
    void m1(short... a) {
        System.out.println("Varargs method invoked");
    }

    public static void main(String[] args) {
        LanguageBackwardCompatibility compatibility = new LanguageBackwardCompatibility();
        short a = 10;
        compatibility.m1(a, a, a);
    }

}
