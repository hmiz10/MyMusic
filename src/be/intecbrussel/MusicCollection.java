package be.intecbrussel;

import java.util.*;

public class MusicCollection {
    private String musicCollectionName;
    private Map<String, PlayList> musicCollectionPlaylist = new HashMap<>();

    public MusicCollection() {

    }

    public MusicCollection(String musicCollectionName) {
        this.musicCollectionName = musicCollectionName;
    }

    public void addSongToPlaylist (String playlistName, Song songObject){
      Map<String, Song> mapOfSongs = new HashMap<>();
      mapOfSongs.put(playlistName, songObject);
    }

    public void removeSongFromPlaylist (String playlistName, Song songObject){
        musicCollectionPlaylist.remove(playlistName, songObject);
    }

    public void addPlaylist (PlayList playListObject){
       Map<String, PlayList> mapOfPlaylists = new HashMap<>();

       mapOfPlaylists.entrySet().add((Map.Entry<String, PlayList>) playListObject);
    }

    public void removePlaylist (PlayList playlistObject){
        musicCollectionPlaylist.remove(playlistObject);
    }

    public int countOfPlaylistsCollection(){
        return musicCollectionPlaylist.size();
    }

    public int countsOfSongsInPlaylist (String playlistName){

        Map<String, Integer> mapOfPlaylists = new HashMap<>();

        mapOfPlaylists.get(playlistName);

        return mapOfPlaylists.entrySet().stream().mapToInt(Map.Entry::getValue).sum();
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
}
