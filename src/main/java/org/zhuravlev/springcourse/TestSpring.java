package org.zhuravlev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.attribute.standard.JobKOctets;

public class TestSpring  {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }
}
