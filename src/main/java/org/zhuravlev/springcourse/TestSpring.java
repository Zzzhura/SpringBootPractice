package org.zhuravlev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.attribute.standard.JobKOctets;

public class TestSpring  {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
}
