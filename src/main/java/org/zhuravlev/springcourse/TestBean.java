package org.zhuravlev.springcourse;

public class TestBean {
    private String name;
    public TestBean(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
