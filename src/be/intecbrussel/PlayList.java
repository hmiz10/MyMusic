package be.intecbrussel;

import java.util.*;

public class PlayList {
    private String playListName;
    private ArrayList<Song> songsPlayList = new ArrayList<>();;
    public HashSet<Song>  masterPlaylist = new HashSet();

    public PlayList(){}

    public PlayList(String playListName) {
        this.playListName = playListName;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public ArrayList<Song> getSongs() {
        return songsPlayList;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songsPlayList = songs;
    }

    public void addSong(Song songObject){
     songsPlayList.add(songObject);
    }

    public void removeSong (Song songObject){
        songsPlayList.remove(songObject);
    }

    public int countOfPlayList(){
        return songsPlayList.size();
    }

    public void displayPlaylist(){
        for (int i = 0; i < songsPlayList.size() ; i++) {
            System.out.println(songsPlayList.get(i));
        }
    }

    public void sortByName(){
        songsPlayList.sort(Comparator.comparing(song -> song.getTitle()));
    }

    public void sortByPlayingTime(){
        songsPlayList.sort(Comparator.comparing(song -> song.getPlayingTime()));
    }

    public void sort(Comparator<Song> customSongComparator){
        songsPlayList.sort(customSongComparator);
    }

    @Override
    public String toString() {
        return "PlayList{" + "playListName='" + playListName + '\'' + ", songs=" + songsPlayList + '}';
    }
}
