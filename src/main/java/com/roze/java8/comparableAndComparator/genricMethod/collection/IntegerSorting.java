package com.roze.java8.comparableAndComparator.genricMethod.collection;

import com.roze.java8.comparableAndComparator.genricMethod.util.Util;

import java.util.*;

public class IntegerSorting {
    public static void main(String[] args) {
        // List<Integer> listOfInteger = Arrays.asList(2, 3, 7, 9, 1,8, 4, 5);
        ArrayList<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(2);
        listOfInteger.add(3);
        listOfInteger.add(7);
        listOfInteger.add(9);
        listOfInteger.add(1);
        listOfInteger.add(8);
        listOfInteger.add(4);
        listOfInteger.add(5);

        System.out.println("Before sorting:");
        Util.iterateList(listOfInteger);
        Collections.sort(listOfInteger);
        //after sorting
        System.out.println("After sorting:");
        Util.iterateList(listOfInteger);
    }
}
