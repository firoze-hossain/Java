package com.roze.objectCreationIn5Ways;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceOfConstructor {
    public static void main(String[] args) throws
            NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Constructor<Student> cons = Student.class.getConstructor();
        Student s = cons.newInstance();
        System.out.println(s);
        int id = s.id = 20;
        System.out.println(id);
    }
}
