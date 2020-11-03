package be.intecbrussel;

import java.util.*;

public class MusicCollection {
    private String musicCollectionName;
    private Map<String, Song> collectionPlaylist = new HashMap<>();


    public MusicCollection(String musicCollectionName) {
        this.musicCollectionName = musicCollectionName;
    }

    public void addSongToPlaylist (String playlistName, Song songObject){
        collectionPlaylist.put(playlistName, songObject);
    }

    public void removeSongFromPlaylist (String playlistName, Song songObject){
        collectionPlaylist.remove(playlistName, songObject);
    }

    public void addPlaylist (PlayList playListObject){
       List<PlayList> listOfPlaylists = new ArrayList<>();

       if (playListObject != null && !collectionPlaylist.containsKey(playListObject)){
           listOfPlaylists.add(playListObject);
       } else {
           System.out.println("The playlist already exists in the list!");
       }
    }

    public void removePlaylist (PlayList playlistObject){
        collectionPlaylist.remove(playlistObject);
    }

    public int countOfPlaylistsCollection(){
        return collectionPlaylist.size();
    }

    public Map<String, Integer> countsOfSongsInPlaylist (Collection<String> playlistName){

        Map<String, Integer> map = new HashMap<>();

        for(String sObj: playlistName){
            Integer i = map.get(sObj);
            if(i == null){
                map.put(sObj, 1);
            } else {
                map.put(sObj, i++);
            }
        }
        return map;
    }

    public void displayPlaylistInCollection(){
        for (int i = 0; i < collectionPlaylist.size() ; i++) {
            System.out.println(collectionPlaylist.get(i));
        }
    }

    public void displaySongsFromPlaylist (String playlistName){
        ArrayList<String> songsInPlaylist = new ArrayList<>();

        for (int i = 0; i < songsInPlaylist.size() ; i++) {
            System.out.println(songsInPlaylist.get(i));
        }
    }
}
