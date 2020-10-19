package cn.dingli.edu.serializable;

import cn.dingli.edu.common.DaJi;

import java.io.Serializable;

public class Heroes implements Serializable {
    private static final long serialVersionUID = 1675213284024112612L;

    private String name;
    private int age;

    public Heroes(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
