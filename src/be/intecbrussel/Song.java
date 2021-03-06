package be.intecbrussel;

import java.time.Duration;
import java.time.LocalTime;

public class Song {
    private String title;
    private String artist;
    private String album;
    private Duration playingTime;

    public Song() {

    }

    public Song(String title, String artist, String album, Duration playingTime) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.playingTime = playingTime;
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

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Duration getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(Duration playingTime) {
        this.playingTime = playingTime;
    }

    @Override
    public String toString() {
        return "Song{" + "title='" + title + '\'' + ", artist='" + artist + '\'' + ", album='" + album + '\'' + ", playingTime=" + playingTime + '}';
    }
}
