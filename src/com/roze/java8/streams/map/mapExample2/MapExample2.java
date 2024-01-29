package com.roze.java8.streams.map.mapExample2;

import java.util.Arrays;
import java.util.List;

public class MapExample2 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("car", "bike", "Trucktor", "bicycle", "flight", "train");

        //*Process One:* before java 8 or without stream
        for (String vehicle : vehicles) {
            System.out.println(vehicle.length());
        }

        System.out.println();

        //**Process Two:* using streams map
        vehicles.stream().map(vehicle -> vehicle.length()).forEach(System.out::println);
    }
}
