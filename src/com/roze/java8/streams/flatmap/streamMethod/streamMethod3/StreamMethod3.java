package com.roze.java8.streams.flatmap.streamMethod.streamMethod3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethod3 {
    public static void main(String[] args) {
        //use of reduce(terminal(direct we can apply in stream)) method
        List<String> listOfString = Arrays.asList("1", "2", "3", "A", "B", "C");
        Optional<String> finalValue = listOfString.stream().reduce((value, combinedValue) -> {
            return combinedValue + value;
        });
        System.out.println(finalValue.get());
    }

}
