package org.zhuravlev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;




public class TestSpring  {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        context.close();
    }
}
