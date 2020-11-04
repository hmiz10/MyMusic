package be.intecbrussel;

import java.util.*;

public class MusicCollection {
    private String musicCollectionName;
    private Map<String, PlayList> musicCollectionPlaylist = new HashMap<>();

    public MusicCollection() {}

    public MusicCollection(String musicCollectionName) {
        this.musicCollectionName = musicCollectionName;
    }

    public void addSongToPlaylist (String playlistName, Song songObject){
        musicCollectionPlaylist.get(playlistName).addSong(songObject);
    }

    public void removeSongFromPlaylist (String playlistName, Song songObject){
        musicCollectionPlaylist.remove(playlistName, songObject);
    }

    public void addPlaylist (PlayList playListObject){
        musicCollectionPlaylist.put(playListObject.getPlayListName(), playListObject);
    }

    public void removePlaylist (PlayList playlistObject){
        musicCollectionPlaylist.remove(playlistObject);
    }

    public int countOfPlaylistsCollection(){
        return musicCollectionPlaylist.size();
    }

    public int countsOfSongsInPlaylist (String playlistName){
        return musicCollectionPlaylist.get(playlistName).getSongs().size();
    }

    public void displayPlaylistInCollection(){
        for (int i = 0; i < musicCollectionPlaylist.size() ; i++) {
            System.out.println(musicCollectionPlaylist.get(i));
        }
    }

    public void displaySongsFromPlaylist (String playlistName){
        ArrayList<String> songsInPlaylist = new ArrayList<>();

        for (int i = 0; i < songsInPlaylist.size() ; i++) {
            System.out.println(songsInPlaylist.get(i));
        }
    }

    @Override
    public String toString() {
        return "MusicCollection{" +
                "musicCollectionName='" + musicCollectionName + '\'' +
                ", musicCollectionPlaylist=" + musicCollectionPlaylist +
                '}';
    }
}
