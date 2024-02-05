package com.roze.java8.comparableAndComparator.customObject;

public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private Integer releaseDate;

    public Song(String title, String artist, Integer releaseDate) {
        this.title = title;
        this.artist = artist;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }

    @Override
    public int compareTo(Song nextSong) {

        return this.getReleaseDate().compareTo(nextSong.getReleaseDate());
    }

//    @Override
//    public int compareTo(Song nextSong) {
//        if (this.getReleaseDate() > nextSong.getReleaseDate()) {
//            return +1;
//        }
//        if (this.getReleaseDate() < nextSong.getReleaseDate()) {
//            return -1;
//        }
//        return 0;
//    }
}
