package org.codebook.flexiblemusicplayersystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShufflePlayback extends Playback {
    private List<Integer> shuffledIndices;
    private int currentPosition;

    public int getNextSongIndex(List<Song> songs, int currentIndex){
        initializeShuffledIndices(songs);
        currentPosition = shuffledIndices.indexOf(currentIndex);
        currentPosition=(currentPosition+1)%songs.size();

        if (currentPosition == 0) {
            completedCycle = true;
        }

        return shuffledIndices.get(currentPosition);
    }

    public int getPreviousSongIndex(List<Song> songs, int currentIndex){
        initializeShuffledIndices(songs);
        currentPosition = shuffledIndices.indexOf(currentIndex);
        currentPosition=(currentPosition-1+songs.size())%songs.size();
        return shuffledIndices.get(currentPosition);
    }

    private void initializeShuffledIndices(List<Song> songs){
        if(shuffledIndices==null||songs.size()!=shuffledIndices.size()){
            shuffledIndices=new ArrayList<>();
            for(int i=0;i<songs.size();++i){
                shuffledIndices.add(i);
            }
            Collections.shuffle(shuffledIndices);
        }
    }
}
