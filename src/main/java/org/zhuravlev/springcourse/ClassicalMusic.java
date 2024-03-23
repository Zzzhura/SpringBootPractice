package org.zhuravlev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic()
    {
        return new ClassicalMusic();
    }
    public void doMyInit()
    {
        System.out.println("Doing my init");
    }

    public void doMyDestroy()
    {
        System.out.println("Doing my destroy");
    }
    @Override
    public String getSong() {
        return "Prelude in C sharp";
    }
}
