package com.roze.java8.comparableAndComparator.customObject;

import com.roze.java8.comparableAndComparator.genricMethod.util.Util;

import java.util.ArrayList;
import java.util.Collections;

public class MP4 {
    public static void main(String[] args) {
        ArrayList<Song> musicList = new ArrayList<>();
        musicList.add(new Song("Kabhi Albida", "Yami Gautam", 2013));
        musicList.add(new Song("Holly Holly", "Sham Kapur", 2015));
        musicList.add(new Song("New Poem", "Games Sine", 2009));
        musicList.add(new Song("Noble", "Harbad ", 2000));
        musicList.add(new Song("Tumi kobe esechile", "Manna Dey", 1995));
        Util.iterateList(musicList);
        System.out.println();
        //problem created
        Collections.sort(musicList);
        System.out.println("After sorting...");
        Util.iterateList(musicList);
    }
}
