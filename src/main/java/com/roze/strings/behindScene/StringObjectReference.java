package com.roze.strings.behindScene;

public class StringObjectReference {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        if (s1 == s2) {
            System.out.println("Both object pointing the same reference");
        } else {
            System.out.println("Both object pointing to the different reference");
        }
    }
}
