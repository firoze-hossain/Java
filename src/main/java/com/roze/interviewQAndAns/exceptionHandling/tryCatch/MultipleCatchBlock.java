package com.roze.interviewQAndAns.exceptionHandling.tryCatch;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int a = 20, b = 2, c;
            c = a / b;
            System.out.println(c);
            System.out.println("**********");
            int[] arr = {2, 3, 5, 4};
            System.out.println(arr[2]);
            System.out.println("*********");
            String s = "firoze";
            System.out.println(s.toUpperCase());
        }
        //if superclass of exception declared first then declared child class exception,
        //it shows compile time error
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (NumberFormatException e) {
            System.out.println("Number Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of array");
        } catch (Exception e) {
            System.out.println("all type of exception handled");
        }
    }
}
