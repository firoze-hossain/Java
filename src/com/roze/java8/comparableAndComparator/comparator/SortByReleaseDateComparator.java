package com.roze.java8.comparableAndComparator.comparator;

import com.roze.java8.comparableAndComparator.customObject.Song;

import java.util.Comparator;

public class SortByReleaseDateComparator implements Comparator<Song> {
    @Override
    public int compare(Song song1, Song song2) {
        if (song1.getReleaseDate() > song2.getReleaseDate()) {
            return +1;
        }
        if (song1.getReleaseDate() < song2.getReleaseDate()) {
            return -1;
        }
        return 0;
    }
}
