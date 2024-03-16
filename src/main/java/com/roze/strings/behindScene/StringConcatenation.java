package com.roze.strings.behindScene;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Firoze";
        String s2 = "Hossain";
        //concatenation using '+' operator
        //give a space between two string::->
        // (add a space before the value of s2)
        //(add a space after the value of s1)
        //((add a another string with space between two string ))
        String s3 = s1 + " " + s2;
        System.out.println(s3);
        //concatenation using concat method of String class
        String s4 = s1.concat(" ").concat(s2);
        System.out.println(s4);
    }
}
