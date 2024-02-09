package com.roze.objectCreationIn5Ways;

public class NewInstanceOfClass {
    //using newInstance it will invoke the constructor
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //create object reference with newInstance()
        //two ways to load the class in java
        //**first way("should be fully qualified name")
        //Student s = (Student) Class.forName("com.roze.objectCreationIn5Ways.Student").newInstance();
        //** second way
        Student s1 = Student.class.newInstance();
        //print our the object reference
        //System.out.println(s);
        System.out.println(s1);
        //invoke the student class property
        //int id = s.id = 101;
        int id1 = s1.id = 101;
        // System.out.println(id);
        System.out.println(id1);

    }
}
