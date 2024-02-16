package com.roze.strings.stringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            //it will not create the new object
            //every iteration it will change the same object
            //time complexity O(n)
            //StringBuilder is mutable
            stringBuilder.append(ch);
        }
        System.out.println(stringBuilder);
    }
}
