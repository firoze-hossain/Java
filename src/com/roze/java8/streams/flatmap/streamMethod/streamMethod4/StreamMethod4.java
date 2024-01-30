package com.roze.java8.streams.flatmap.streamMethod.streamMethod4;

import java.util.Arrays;
import java.util.List;

public class StreamMethod4 {
    public static void main(String[] args) {
        //use of toArray(terminal-we can use it directly to stream or after any non terminal process or operation)
        List<String> listOfString = Arrays.asList("1", "2", "3", "A", "B", "C");
        Object[] arr = listOfString.stream().toArray();
        System.out.println("Length of array: " + arr.length);
        System.out.println();
        System.out.println("Array element: ");
        for (Object value : arr) {
            System.out.println(value);
        }
    }
}
