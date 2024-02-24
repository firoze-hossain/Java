package com.roze.strings;

import java.util.ArrayList;

public class PrettyFormatting {
    public static void main(String[] args) {
        System.out.printf("My name is %s %s", "Firoze", "Hossain");
        System.out.println();
        float a = 32.5698f;
        System.out.printf("%.2f", a);
        System.out.println();
        System.out.printf("%.2f", Math.PI);
        System.out.println();
        System.out.println("Printing different String operations");
        System.out.println("a" + "b");
        //if we add two characters then it will add it's numeric value
        System.out.println('a' + 'b');
        //if we add one string with integer then the inter will be converted into string using toString()
        System.out.println(1 + "a");
        System.out.println('a' + 1);
        //if we add two or more object there should be present string in that statement
        // System.out.println(new ArrayList<>() + " " + new Integer(56));


    }
}
