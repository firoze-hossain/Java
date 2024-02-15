package com.roze.strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isPalindrome(str));
    }

    //using StringBuilder
    public static boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        StringBuilder s = stringBuilder.reverse();
        return str.equals(s.toString());
    }

    //using iteration and and conditional check
    public static boolean isPalindrome1(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }


        }
        return true;
    }
}
