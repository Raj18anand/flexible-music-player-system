package org.codebook.flexiblemusicplayersystem;

import java.util.List;

public class SequentialPlayback extends Playback {
    public int getNextSongIndex(List<Song> songs, int currentIndex){
        int nextIndex = (currentIndex + 1) % songs.size();
        if (nextIndex == 0) {
            completedCycle = true;
        }
        return nextIndex;
    }

    public int getPreviousSongIndex(List<Song> songs, int currentIndex){
        return (currentIndex-1+songs.size())%songs.size();
    }
}
