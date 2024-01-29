package com.roze.streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample1 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("car", "bike", "Trucktor", "bicycle", "flight", "train");
        List<String> vehiclesInUppercase = new ArrayList<>();

        //*Process one:* before java 8 or without streams
        //enhance loop
        for (String vehicle : vehicles) {
            vehiclesInUppercase.add(vehicle.toUpperCase());
        }
        System.out.println("Using Loop:"+vehiclesInUppercase);

        System.out.println();

        // *Process Two:" using streams->map
        vehiclesInUppercase = vehicles.stream().map(vehicle -> vehicle.toUpperCase()).collect(Collectors.toList());
        System.out.println("Using streams map: "+vehiclesInUppercase);


    }


}
