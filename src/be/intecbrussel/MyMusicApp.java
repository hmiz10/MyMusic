package be.intecbrussel;

import java.time.Duration;
import java.util.ArrayList;

public class MyMusicApp {
    public static void main(String[] args) {

        Song song1 = new Song("Hotline Bling", "Drake", "Hotline Bing - Single", Duration.ofSeconds(45621));
        Song song2 = new Song("What Do You Mean?", "Justin Bieber", "What Do You Mean? - Single", Duration.ofSeconds(654123));
        Song song3 = new Song("Watch Me", "Silento", "Watch Me (Whip / Nae Nae) - Single", Duration.ofSeconds(2618496));
        Song song4 = new Song("679", "Fetty Wap ft. Remy Boyz", "Fetty Wap", Duration.ofSeconds(218186));
        Song song5 = new Song("Can't Feel My Face", "The Weeknd", "Beauty Behind the Madness", Duration.ofSeconds(14787));
        Song song6 = new Song("Good for You", "Selena Gomez ft. A$AP Rocky", "Good for You - Single", Duration.ofSeconds(63254));
        Song song7 = new Song("If You", "Big Bang", "MADE", Duration.ofSeconds(74581));
        Song song8 = new Song("Angie", "The Rolling Stones", "Goats Head Soup", Duration.ofSeconds(1247523));
        Song song9 = new Song("Billie Jean", "Michael Jackson", "Thriller", Duration.ofSeconds(98754));
        Song song10 = new Song("Bennie and The Jets", "Elton John", "Goodbye Yellow Brick Road", Duration.ofSeconds(12321));

        PlayList playList1 = new PlayList();

        playList1.addSong(song1);
        playList1.masterPlaylist.add(song1);
        playList1.addSong(song2);
        playList1.masterPlaylist.add(song2);
        playList1.addSong(song3);
        playList1.masterPlaylist.add(song3);
        playList1.addSong(song4);
        playList1.masterPlaylist.add(song4);



        PlayList playList2 = new PlayList();

        playList2.addSong(song5);
        playList2.masterPlaylist.add(song5);
        playList2.addSong(song6);
        playList2.masterPlaylist.add(song6);
        playList2.addSong(song7);
        playList2.masterPlaylist.add(song7);

        PlayList playList3 = new PlayList();

        playList3.addSong(song8);
        playList3.masterPlaylist.add(song8);
        playList3.addSong(song9);
        playList3.masterPlaylist.add(song9);
        playList3.addSong(song10);
        playList3.masterPlaylist.add(song10);

        MusicCollection  musicCollection = new MusicCollection();

        musicCollection.addPlaylist(playList1);
        musicCollection.addPlaylist(playList2);
        musicCollection.addPlaylist(playList3);

        System.out.println(musicCollection);
    }
}
