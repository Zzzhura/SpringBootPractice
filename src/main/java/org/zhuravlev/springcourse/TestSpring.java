package org.zhuravlev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;


public class TestSpring  {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic2 == classicalMusic1);
        context.close();
    }
}
