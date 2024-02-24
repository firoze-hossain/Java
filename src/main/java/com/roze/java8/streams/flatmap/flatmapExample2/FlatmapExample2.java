package com.roze.java8.streams.flatmap.flatmapExample2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapExample2 {
    public static void main(String[] args) {
        List<String> teamAPlayer = Arrays.asList("Shajib", "Sumon", "Sohan");
        List<String> teamBPlayer = Arrays.asList("Firoze", "Millat", "Rayhan");
        List<String> teamCPlayer = Arrays.asList("Mydul", "Imtiaze", "Jakir");
        List<List<String>> totalTeamPlayers = new ArrayList<>();
        totalTeamPlayers.add(teamAPlayer);
        totalTeamPlayers.add(teamBPlayer);
        totalTeamPlayers.add(teamCPlayer);

        //before java 8 using enhance loop
        for (List<String> team : totalTeamPlayers) {
            for (String t : team) {
                System.out.println(t);
            }
        }

        System.out.println();
        //using flatmap

        List<String> finalList = totalTeamPlayers.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(finalList);

    }
}
