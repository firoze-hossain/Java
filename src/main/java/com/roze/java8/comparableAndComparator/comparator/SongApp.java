package com.roze.java8.comparableAndComparator.comparator;

import com.roze.java8.comparableAndComparator.customObject.Song;
import com.roze.java8.comparableAndComparator.genricMethod.util.Util;

import java.util.ArrayList;
import java.util.Collections;

public class SongApp {
    public static void main(String[] args) {
        ArrayList<Song> musicList = new ArrayList<>();
        musicList.add(new Song("Kabhi Albida", "Yami Gautam", 2013));
        musicList.add(new Song("Noble", "Harbad ", 2000));
        Util.iterateList(musicList);
        System.out.println();
        Collections.sort(musicList,new SortByReleaseDateComparator().reversed());
        System.out.println("After sorting...");
        Util.iterateList(musicList);

    }
}
