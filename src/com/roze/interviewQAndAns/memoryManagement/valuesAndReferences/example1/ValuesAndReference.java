package com.roze.interviewQAndAns.memoryManagement.valuesAndReferences.example1;

public class ValuesAndReference {
    public static void main(String[] args) {
        int localValue = 5;
        // java is always passed by copy of value
        // java is not for passed by reference even for Objects(like-> String, Student etc)
        calculate(localValue);
        System.out.println(localValue);
    }

    public static void calculate(int calValue) {
        calValue = calValue * 10;
    }
}
