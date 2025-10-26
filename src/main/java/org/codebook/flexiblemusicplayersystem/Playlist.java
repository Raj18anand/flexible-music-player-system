package org.codebook.flexiblemusicplayersystem;

import lombok.Data;

import java.util.List;

@Data
public class Playlist {
    private String name;
    private List<Song> songs;

    public void addSong(Song song){
        songs.add(song);
    }

    public void removeSong(Song song){
        songs.remove(song);
    }
}
