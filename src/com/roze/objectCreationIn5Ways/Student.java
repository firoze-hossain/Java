package com.roze.objectCreationIn5Ways;

public class Student implements Cloneable{
    public int id;

    public Student() {
        System.out.println("Student class Constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
