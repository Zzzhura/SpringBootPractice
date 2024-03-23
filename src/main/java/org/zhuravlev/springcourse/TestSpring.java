package org.zhuravlev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring  {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music = context.getBean("musicBean", ClassicalMusic.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        Music rapMusic = context.getBean("rapMusic", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(rapMusic);
        musicPlayer1.playMusic();
        context.close();
    }
}
