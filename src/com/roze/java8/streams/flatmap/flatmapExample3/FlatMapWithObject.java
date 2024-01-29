package com.roze.java8.streams.flatmap.flatmapExample3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapWithObject {
    public static void main(String[] args) {
        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student(1, "Firoze", "A"));
        studentList1.add(new Student(2, "Rayhan", ""));
        studentList1.add(new Student(3, "Millat", "B"));

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student(4, "Imtiaze", "A"));
        studentList2.add(new Student(5, "Mydul", "B"));
        studentList2.add(new Student(6, "Jakir", "C"));

        List<List<Student>> bigList = Arrays.asList(studentList1, studentList2);

        //before java 8 using loop
        //retrieve the name of student
        for (List<Student> stu : bigList) {
            for (Student s : stu) {
                System.out.println(s.getName());
            }
        }
        System.out.println("=====================");
        //using flatmap-stream
        //bigList.stream().flatMap(x -> x.stream().map(y -> y.getName())).forEach(System.out::println);
        List<String> namesStudent = bigList.stream().flatMap(x -> x.stream()).map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(namesStudent);
    }
}
