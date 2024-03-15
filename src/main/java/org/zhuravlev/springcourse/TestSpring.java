package org.zhuravlev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring  {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        boolean comparison = (musicPlayer2 == musicPlayer1);
        System.out.println(comparison);
        musicPlayer1.playMusic();
        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer1.getVolume());
        context.close();
    }
}
