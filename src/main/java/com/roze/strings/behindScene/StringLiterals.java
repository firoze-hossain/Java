package com.roze.strings.behindScene;

public class StringLiterals {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        if (s1 == s2) {
            System.out.println("Both object pointing the same reference");
        } else {
            System.out.println("Both object pointing the different reference");
        }
    }
}
