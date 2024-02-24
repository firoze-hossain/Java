package com.roze.strings;

public class StringExample {
    public static void main(String[] args) {
        // using String string pool
        //create one value in string pool called Firoze
        // but reference two variable a,b
        String a = "Firoze";
        String b = "Firoze";
        String c = a;
        System.out.println(a == b);
        System.out.println("***********");
        System.out.println(a.equals(b));
        System.out.println("************");
        System.out.println(c == a);
        System.out.println("***************");
        //outside string pool but in heap create two separate objects
        String name1 = new String("Firoze");
        String name2 = new String("Firoze");
        System.out.println(name1 == name2);
        System.out.println("***********");
        //equals() method only compare values not object reference
        System.out.println(name1.equals(name2));
        System.out.println("***********");
        //charAt(find character based on index)
        System.out.println(a.charAt(0));
    }
}
