package com.roze.interviewQAndAns.exceptionHandling.throwsKeyword;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
        //when we don't want to handle exception by own by bypass the exception to it's caller
        //suppose te caller of main method is JVM
        //but best case is to use try-catch block to handle it own
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
//    public static void main(String[] args) {
//        try {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(i);
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//    }
}
