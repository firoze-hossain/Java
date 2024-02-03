package com.roze.java8.comparableAndComparator.customObject;

class Human {

}

class Engineer extends Human {

}

class Animal {

}

class Dog extends Animal {

}

public class Test {
    public static void main(String[] args) {
        //print(new Dog());
        print(new Engineer());
        print(new Human());
       // print(new Animal());
    }

    public static <T extends Human> void print(T temp) {
        System.out.println("That is human/dog/Animal/Engineer");
    }
}
