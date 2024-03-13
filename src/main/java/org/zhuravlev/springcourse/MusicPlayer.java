package org.zhuravlev.springcourse;

public class MusicPlayer {
    private Music music;

    //IOC(inversion of control)
    public MusicPlayer(Music music)
    {
        this.music = music;
    }

    public MusicPlayer(){}

    public void setMusic(Music music) {
        this.music = music;
    }


    public void playMusic()
    {
        System.out.println("Playing: " + this.music.getSong());
    }
}
