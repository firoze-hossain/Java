package com.roze.interviewQAndAns.exceptionHandling.tryCatchThrows;

public class TryCatchThrows {
    public static void display() throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    //throws keyword does not handle all exception by it's caller(like main method call jvm)
    //jvm handle display method's exception,but it can not handle it's own exception
    //so best case is use try catch to normal terminate the program
    public static void main(String[] args) {
        try {
            display();
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("All Exception handled");
        }

        System.out.println("Hello Firoze");
    }
}
