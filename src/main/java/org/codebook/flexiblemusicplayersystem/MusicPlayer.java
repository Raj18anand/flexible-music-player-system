package org.codebook.flexiblemusicplayersystem;

import lombok.Data;

@Data
public class MusicPlayer {
    private Playlist playlist;
    private int currentIndex;
    private Playback playback;
    private boolean repeatMode=true;

    public MusicPlayer() {
        this.playback=new SequentialPlayback();
    }

    public void setPlaylist(Playlist playlist){
        this.playlist=playlist;
        this.currentIndex=0;
    }

    public void play(){
        Song currentSong=playlist.getSongs().get(currentIndex);
        System.out.println("Playing: "+currentSong.getName());
    }

    public void setShuffleMode(boolean enabled){
        if(enabled){
            playback=new ShufflePlayback();
            System.out.println("Shuffle mode on");
        } else {
            playback=new SequentialPlayback();
            System.out.println("Shuffle mode off");
        }
    }

    public void toggleShuffle(){
        if(playback instanceof ShufflePlayback){
            setShuffleMode(false);
        }
        else{
            setShuffleMode(true);
        }
    }

    public void next(){
        currentIndex=playback.getNextSongIndex(playlist.getSongs(),currentIndex);
        if(playback.hasCompletedCycle()&&!repeatMode){
            System.out.println("Playlist ended");
            return;
        }
        play();
    }

    public void previous(){
        currentIndex=playback.getPreviousSongIndex(playlist.getSongs(),currentIndex);
        play();
    }

    public void setRepeatMode(boolean enabled){
        if(enabled){
            playback.resetCycle();
        }
        this.repeatMode=enabled;
    }
}
