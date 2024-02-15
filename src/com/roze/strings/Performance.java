package com.roze.strings;

public class Performance {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            //System.out.println(ch);

            //every iteration it is creating new string object
            //time complexity of it is O(n*n)
            //cause string is immutable
            s += ch;
        }
        System.out.println(s);
    }
}
