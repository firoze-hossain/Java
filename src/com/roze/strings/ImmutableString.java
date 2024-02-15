package com.roze.strings;

public class ImmutableString {
    public static void main(String[] args) {
        String s = "Firoze";
        //must have to assign to new object reference variable
        //or it will be go under garbage collection
        s.concat("Hossain");
        System.out.println(s);
        //write way to print concatenated string
        String s1 = s.concat(" Hossain");
        System.out.println(s1);
        //using intern() method to use string pool
        // beacuse with new keyword string will create new object in heap outside string pool
        String str = new String("Firoze").intern();
        System.out.println(str);

    }
}
