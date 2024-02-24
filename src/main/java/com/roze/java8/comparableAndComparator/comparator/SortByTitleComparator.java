package com.roze.java8.comparableAndComparator.comparator;

import com.roze.java8.comparableAndComparator.customObject.Song;

import java.util.Comparator;

public class SortByTitleComparator implements Comparator<Song> {
    @Override
    public int compare(Song newSong, Song existingSong) {

        return newSong.getTitle().compareTo(existingSong.getTitle());
    }
}
