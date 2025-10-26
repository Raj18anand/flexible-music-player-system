package org.codebook.flexiblemusicplayersystem;

import java.util.List;

public abstract class Playback {
    protected boolean completedCycle = false;
    public abstract int getNextSongIndex(List<Song> songs, int currentIndex);
    public abstract  int getPreviousSongIndex(List<Song> songs, int currentIndex);
    public boolean hasCompletedCycle() {
        return completedCycle;
    }

    public void resetCycle() {
        completedCycle = false;
    }
}
