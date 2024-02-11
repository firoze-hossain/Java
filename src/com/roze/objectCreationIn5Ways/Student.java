package com.roze.objectCreationIn5Ways;

import java.io.Serializable;

public class Student implements Cloneable, Serializable {
    public int id;

    public Student() {
        System.out.println("Student class Constructor");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
