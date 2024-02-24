package com.roze.java8.comparableAndComparator.genricMethod.util;

import java.util.ArrayList;

public class Util {
    public static <T> void iterateList(ArrayList<T> list) {
        for (T temp : list) {
            System.out.println(temp);
        }
    }
}
