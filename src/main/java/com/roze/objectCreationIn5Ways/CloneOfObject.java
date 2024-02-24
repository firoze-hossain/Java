package com.roze.objectCreationIn5Ways;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CloneOfObject {
    public static void main(String[] args) throws
            NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException, CloneNotSupportedException {
        Constructor<Student> cons = Student.class.getConstructor();
        Student s = cons.newInstance();
        System.out.println(s);
        int id = s.id = 20;
        System.out.println(id);

        //create object using clone() method of object class
        //have to use clone() method we have to implement Cloneable interface in that class
        //and have to override Object clone() method in that class
        Student s1 = (Student) s.clone();
        //print the object reference
        System.out.println(s1);
        //call the student class property
        System.out.println(s1.id);

    }
}
