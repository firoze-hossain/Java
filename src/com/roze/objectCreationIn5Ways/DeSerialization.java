package com.roze.objectCreationIn5Ways;

import java.io.*;

public class DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //First serialize the student class object
//        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        Student student = new Student();
//        objectOutputStream.writeObject(student);

        //Deserialize the object
        FileInputStream fileInputStream = new FileInputStream("file.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student s = (Student) objectInputStream.readObject();
        System.out.println(s);
        s.id = 101;
        System.out.println(s.id);
    }
}
