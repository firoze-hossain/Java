package com.roze.java8.comparableAndComparator.genricMethod.collection;

import com.roze.java8.comparableAndComparator.genricMethod.util.Util;

import java.util.ArrayList;
import java.util.Collections;

public class StringSorting {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Firoze");
        stringList.add("Imtiaze");
        stringList.add("Millat");
        stringList.add("Rayhan");
        stringList.add("Shajib");
        stringList.add("Jakir");
        System.out.println("Before sorting:");
        Util.iterateList(stringList);
        System.out.println("After sorting:");
        Collections.sort(stringList);
        Util.iterateList(stringList);
    }
}
