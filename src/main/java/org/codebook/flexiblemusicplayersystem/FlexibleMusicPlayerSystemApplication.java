package org.codebook.flexiblemusicplayersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FlexibleMusicPlayerSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlexibleMusicPlayerSystemApplication.class, args);

        Song song1 = new Song();
        song1.setName("Bohemian Rhapsody");
        song1.setArtist("Queen");
        song1.setGenre("Rock");

        Song song2 = new Song();
        song2.setName("Stairway to Heaven");
        song2.setArtist("Led Zeppelin");
        song2.setGenre("Rock");

        Song song3 = new Song();
        song3.setName("Hotel California");
        song3.setArtist("Eagles");
        song3.setGenre("Rock");

        Song song4 = new Song();
        song4.setName("Imagine");
        song4.setArtist("John Lennon");
        song4.setGenre("Pop");

        Song song5 = new Song();
        song5.setName("Smells Like Teen Spirit");
        song5.setArtist("Nirvana");
        song5.setGenre("Grunge");

        Playlist playlist = new Playlist();
        playlist.setName("Classic Rock Playlist");
        List<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        playlist.setSongs(songs);

        // create a music player for a playlist
        MusicPlayer player = new MusicPlayer();
        player.setPlaylist(playlist);

        // play a song
        player.play();

        // next
        player.next();

        // previous
        player.previous();

        // toggle shuffle mode
        player.toggleShuffle();

        // play a song
        player.play();

        // next
        player.next();
        player.next();

        // previous
        player.previous();

        // toggle shuffle mode
        player.toggleShuffle();

        // play a song
        player.play();

        // next
        player.next();

        // previous
        player.previous();
    }

}
