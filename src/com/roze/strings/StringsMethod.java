package com.roze.strings;

import java.util.Arrays;

public class StringsMethod {
    public static void main(String[] args) {
        String name = "Firoze Hossain Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
        //strip remove space
        System.out.println("    firoze  ".strip());
        System.out.println(name.indexOf('i'));
    }
}
