package com.roze.java8.streams.flatmap.flatmapExample1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//difference between map and flat map
public class FlatmapExample1 {
    public static void main(String[] args) {

        //map uses
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> finalNums = nums.stream().map(x -> x + 10).collect(Collectors.toList());
        System.out.println(finalNums);

        //using of flatmap
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<Integer> list3 = Arrays.asList(5, 6);
        List<List<Integer>> bigList = Arrays.asList(list1, list2, list3);
        List<Integer> finalList = bigList.stream().flatMap(x -> x.stream()).map(y -> y + 10).collect(Collectors.toList());
        System.out.println(finalList);

    }
}
