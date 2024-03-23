package org.zhuravlev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    private ClassicalMusic classicalMusic;
    @Autowired
    private RapMusic rapMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
    }

    public void playMusic()
    {
        System.out.println("Playing: " + this.classicalMusic.getSong());
        System.out.println("Playing: " + this.rapMusic.getSong());
    }
}
