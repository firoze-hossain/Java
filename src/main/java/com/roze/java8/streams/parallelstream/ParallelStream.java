package com.roze.java8.streams.parallelstream;

import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

public class ParallelStream {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Firoze", 80),
                new Student("Millat", 70),
                new Student("Rayhan", 85),
                new Student("Imtiaze", 90),
                new Student("Shajib", 50),
                new Student("Jakir", 60),
                new Student("Mydul", 84)

        );
        //using stream(sequential)
        studentList.stream().filter(x -> x.getScore() >= 80)
                .limit(3).forEach(x -> System.out.println(x.getName() + " " + x.getScore()));
        System.out.println();
        //using parallel stream(parallel-non sequential)
        studentList.parallelStream().
                filter(x -> x.getScore() >= 80).
                limit(3).forEach(x -> System.out.println(x.getName() + " " + x.getScore()));
        System.out.println();
        // using stream with parallel method
        studentList.stream().parallel().
                filter(x -> x.getScore() >= 80).
                limit(3).forEach(x -> System.out.println(x.getName() + " " + x.getScore()));

    }
}
