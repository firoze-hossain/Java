package com.roze.interviewQAndAns.exceptionHandling.throwsAndThrow;

public class ThrowsAndThrow {
    //we create throw to create an exception object
    // we use throws keyword to declare exception and by-bass it's caller to handle
    //we can not handle exception by throws just by-pass
    public void div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("b should not be zero");
        } else {
            int c = a / b;
            System.out.println(c);
        }
    }

    public static void main(String[] args) throws ArithmeticException {
        ThrowsAndThrow throwsAndThrow = new ThrowsAndThrow();
        try {
            throwsAndThrow.div(10, 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }


    }
}
