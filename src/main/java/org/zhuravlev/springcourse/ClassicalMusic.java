package org.zhuravlev.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music{
    public static ClassicalMusic getClassicalMusic()
    {
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit()
    {
        System.out.println("Doing my init");
    }

    @PreDestroy
    public void doMyDestroy()
    {
        System.out.println("Doing my destroy");
    }
    @Override
    public String getSong() {
        return "Prelude in C sharp";
    }
}
