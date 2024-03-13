package org.zhuravlev.springcourse;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

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
