package com.roze.objectCreationIn5Ways;

public class NewKeyword {
    public static void main(String[] args) {
        //create object with new keyword
        //constructor invoke with new keyword
        Student s = new Student();
        //print object reference
        System.out.println(s);
        //use the student class properties
        int id = s.id = 101;
        System.out.println(id);
    }
}
