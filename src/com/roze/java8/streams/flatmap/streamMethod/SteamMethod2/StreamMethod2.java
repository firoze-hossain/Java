package com.roze.java8.streams.flatmap.streamMethod.SteamMethod2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMethod2 {
    //terminal(direct we can apply in stream)
    //**min
    //**max

    //Terminal(direct we can apply in stream)
    //**Count
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 6, 9, 8, 5, 6, 4, 3);
        //count of even numbers
        long count = nums.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Total even Numbers: " + count);
        System.out.println();

        //minimum number in the list
        Optional<Integer> num = nums.stream().min((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println("Minimum number in the list: " + num.get());

        System.out.println();

        //maximum number in the list
        Optional<Integer> maxNum = nums.stream().max((x, y) -> {
            return x.compareTo(y);
        });
        System.out.println("Maximum number in the list: "+maxNum.get());
    }

}
