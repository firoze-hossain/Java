package com.roze.interviewQAndAns.exceptionHandling.java.tryCatchFinal;

public class TryFinal {
    public static void main(String[] args) {
        try {
            System.out.println("I am Firoze");
            System.out.println("I am spring boot developer");
            //after printing the above line ,it will directly execute the finally block
            int a = 10 / 0;//exception occurs here && this and next line is not executed in try block
            System.out.println(a);

        } finally {
            System.out.println("I am a Java Developer");
        }
        //after finally block the following statement is not executed
        System.out.println("I have read different book");
    }
}
